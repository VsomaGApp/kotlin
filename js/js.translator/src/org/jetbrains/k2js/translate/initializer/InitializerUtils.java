/*
 * Copyright 2010-2012 JetBrains s.r.o.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.jetbrains.k2js.translate.initializer;

import com.google.dart.compiler.backend.js.ast.*;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.jet.lang.descriptors.*;
import org.jetbrains.jet.lang.psi.JetObjectDeclaration;
import org.jetbrains.k2js.translate.context.TranslationContext;
import org.jetbrains.k2js.translate.declaration.ClassTranslator;
import org.jetbrains.k2js.translate.utils.JsAstUtils;

import java.util.List;

import static org.jetbrains.k2js.translate.utils.BindingUtils.getClassDescriptor;
import static org.jetbrains.k2js.translate.utils.JsAstUtils.assignment;
import static org.jetbrains.k2js.translate.utils.TranslationUtils.assignmentToBackingField;

/**
 * @author Pavel Talanov
 */
public final class InitializerUtils {
    private InitializerUtils() {
    }

    @NotNull
    public static JsStatement generateInitializerForProperty(@NotNull TranslationContext context,
            @NotNull PropertyDescriptor descriptor,
            @NotNull JsExpression value) {
        if (context.isEcma5()) {
            return JsAstUtils.definePropertyDataDescriptor(descriptor, value, context).makeStmt();
        }
        else {
            return assignmentToBackingField(context, descriptor, value).makeStmt();
        }
    }

    public static void generate(
            @NotNull JetObjectDeclaration declaration,
            @NotNull List<JsStatement> initializers,
            @NotNull TranslationContext context
    ) {
        ClassDescriptor descriptor = getClassDescriptor(context.bindingContext(), declaration);
        JsExpression value = ClassTranslator.generateObjectLiteral(declaration, descriptor, context);
        initializers.add(create(descriptor, !(descriptor.getContainingDeclaration() instanceof NamespaceDescriptor), value, context));
    }

    private static JsStatement create(DeclarationDescriptor descriptor, boolean enumerable, JsExpression value, TranslationContext context) {
        JsExpression expression;
        if (context.isEcma5()) {
            expression = JsAstUtils.defineProperty(descriptor.getName().getName(), JsAstUtils.createDataDescriptor(value, false, enumerable), context);
        }
        else {
            expression = assignment(new JsNameRef(descriptor.getName().getName(), JsLiteral.THIS), value);
        }
        return expression.makeStmt();
    }


    public static JsExpression toDataDescriptor(JsExpression value, TranslationContext context) {
        return context.isEcma5() ? JsAstUtils.createDataDescriptor(value) : value;
    }

    public static JsPropertyInitializer createPropertyInitializer(Named named, JsExpression value, TranslationContext context) {
        return new JsPropertyInitializer(context.nameToLiteral(named), toDataDescriptor(value, context));
    }
}