/*
 * Copyright 2010-2015 JetBrains s.r.o.
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

package org.jetbrains.kotlin.js.test.semantics;

import com.intellij.testFramework.TestDataPath;
import org.jetbrains.kotlin.test.JUnit3RunnerWithInners;
import org.jetbrains.kotlin.test.KotlinTestUtils;
import org.jetbrains.kotlin.test.TestMetadata;
import org.junit.runner.RunWith;

import java.io.File;
import java.util.regex.Pattern;

/** This class is generated by {@link org.jetbrains.kotlin.generators.tests.TestsPackage}. DO NOT MODIFY MANUALLY */
@SuppressWarnings("all")
@TestMetadata("compiler/testData/codegen/box/objects")
@TestDataPath("$PROJECT_ROOT")
@RunWith(JUnit3RunnerWithInners.class)
public class ObjectsTestGenerated extends AbstractObjectsTest {
    public void testAllFilesPresentInObjects() throws Exception {
        KotlinTestUtils.assertAllTestsPresentByMetadata(this.getClass(), new File("compiler/testData/codegen/box/objects"), Pattern.compile("^(.+)\\.kt$"), true);
    }

    @TestMetadata("anonymousObjectPropertyInitialization.kt")
    public void testAnonymousObjectPropertyInitialization() throws Exception {
        String fileName = KotlinTestUtils.navigationMetadata("compiler/testData/codegen/box/objects/anonymousObjectPropertyInitialization.kt");
        doTest(fileName);
    }

    @TestMetadata("classCallsProtectedInheritedByCompanion.kt")
    public void testClassCallsProtectedInheritedByCompanion() throws Exception {
        String fileName = KotlinTestUtils.navigationMetadata("compiler/testData/codegen/box/objects/classCallsProtectedInheritedByCompanion.kt");
        doTest(fileName);
    }

    @TestMetadata("flist.kt")
    public void testFlist() throws Exception {
        String fileName = KotlinTestUtils.navigationMetadata("compiler/testData/codegen/box/objects/flist.kt");
        doTest(fileName);
    }

    @TestMetadata("initializationOrder.kt")
    public void testInitializationOrder() throws Exception {
        String fileName = KotlinTestUtils.navigationMetadata("compiler/testData/codegen/box/objects/initializationOrder.kt");
        doTest(fileName);
    }

    @TestMetadata("kt1047.kt")
    public void testKt1047() throws Exception {
        String fileName = KotlinTestUtils.navigationMetadata("compiler/testData/codegen/box/objects/kt1047.kt");
        doTest(fileName);
    }

    @TestMetadata("kt1136.kt")
    public void testKt1136() throws Exception {
        String fileName = KotlinTestUtils.navigationMetadata("compiler/testData/codegen/box/objects/kt1136.kt");
        doTest(fileName);
    }

    @TestMetadata("kt1186.kt")
    public void testKt1186() throws Exception {
        String fileName = KotlinTestUtils.navigationMetadata("compiler/testData/codegen/box/objects/kt1186.kt");
        doTest(fileName);
    }

    @TestMetadata("kt1600.kt")
    public void testKt1600() throws Exception {
        String fileName = KotlinTestUtils.navigationMetadata("compiler/testData/codegen/box/objects/kt1600.kt");
        doTest(fileName);
    }

    @TestMetadata("kt1737.kt")
    public void testKt1737() throws Exception {
        String fileName = KotlinTestUtils.navigationMetadata("compiler/testData/codegen/box/objects/kt1737.kt");
        doTest(fileName);
    }

    @TestMetadata("kt2398.kt")
    public void testKt2398() throws Exception {
        String fileName = KotlinTestUtils.navigationMetadata("compiler/testData/codegen/box/objects/kt2398.kt");
        doTest(fileName);
    }

    @TestMetadata("kt2663.kt")
    public void testKt2663() throws Exception {
        String fileName = KotlinTestUtils.navigationMetadata("compiler/testData/codegen/box/objects/kt2663.kt");
        doTest(fileName);
    }

    @TestMetadata("kt2663_2.kt")
    public void testKt2663_2() throws Exception {
        String fileName = KotlinTestUtils.navigationMetadata("compiler/testData/codegen/box/objects/kt2663_2.kt");
        doTest(fileName);
    }

    @TestMetadata("kt2675.kt")
    public void testKt2675() throws Exception {
        String fileName = KotlinTestUtils.navigationMetadata("compiler/testData/codegen/box/objects/kt2675.kt");
        doTest(fileName);
    }

    @TestMetadata("kt2719.kt")
    public void testKt2719() throws Exception {
        String fileName = KotlinTestUtils.navigationMetadata("compiler/testData/codegen/box/objects/kt2719.kt");
        doTest(fileName);
    }

    @TestMetadata("kt2822.kt")
    public void testKt2822() throws Exception {
        String fileName = KotlinTestUtils.navigationMetadata("compiler/testData/codegen/box/objects/kt2822.kt");
        doTest(fileName);
    }

    @TestMetadata("kt3238.kt")
    public void testKt3238() throws Exception {
        String fileName = KotlinTestUtils.navigationMetadata("compiler/testData/codegen/box/objects/kt3238.kt");
        doTest(fileName);
    }

    @TestMetadata("kt3684.kt")
    public void testKt3684() throws Exception {
        String fileName = KotlinTestUtils.navigationMetadata("compiler/testData/codegen/box/objects/kt3684.kt");
        doTest(fileName);
    }

    @TestMetadata("kt4086.kt")
    public void testKt4086() throws Exception {
        String fileName = KotlinTestUtils.navigationMetadata("compiler/testData/codegen/box/objects/kt4086.kt");
        doTest(fileName);
    }

    @TestMetadata("kt535.kt")
    public void testKt535() throws Exception {
        String fileName = KotlinTestUtils.navigationMetadata("compiler/testData/codegen/box/objects/kt535.kt");
        doTest(fileName);
    }

    @TestMetadata("kt560.kt")
    public void testKt560() throws Exception {
        String fileName = KotlinTestUtils.navigationMetadata("compiler/testData/codegen/box/objects/kt560.kt");
        doTest(fileName);
    }

    @TestMetadata("kt694.kt")
    public void testKt694() throws Exception {
        String fileName = KotlinTestUtils.navigationMetadata("compiler/testData/codegen/box/objects/kt694.kt");
        doTest(fileName);
    }

    @TestMetadata("localFunctionInObjectInitializer_kt4516.kt")
    public void testLocalFunctionInObjectInitializer_kt4516() throws Exception {
        String fileName = KotlinTestUtils.navigationMetadata("compiler/testData/codegen/box/objects/localFunctionInObjectInitializer_kt4516.kt");
        doTest(fileName);
    }

    @TestMetadata("methodOnObject.kt")
    public void testMethodOnObject() throws Exception {
        String fileName = KotlinTestUtils.navigationMetadata("compiler/testData/codegen/box/objects/methodOnObject.kt");
        doTest(fileName);
    }

    @TestMetadata("nestedDerivedClassCallsProtectedFromCompanion.kt")
    public void testNestedDerivedClassCallsProtectedFromCompanion() throws Exception {
        String fileName = KotlinTestUtils.navigationMetadata("compiler/testData/codegen/box/objects/nestedDerivedClassCallsProtectedFromCompanion.kt");
        doTest(fileName);
    }

    @TestMetadata("nestedObjectWithSuperclass.kt")
    public void testNestedObjectWithSuperclass() throws Exception {
        String fileName = KotlinTestUtils.navigationMetadata("compiler/testData/codegen/box/objects/nestedObjectWithSuperclass.kt");
        doTest(fileName);
    }

    @TestMetadata("objectExtendsInnerAndReferencesOuterMember.kt")
    public void testObjectExtendsInnerAndReferencesOuterMember() throws Exception {
        String fileName = KotlinTestUtils.navigationMetadata("compiler/testData/codegen/box/objects/objectExtendsInnerAndReferencesOuterMember.kt");
        doTest(fileName);
    }

    @TestMetadata("objectInLocalAnonymousObject.kt")
    public void testObjectInLocalAnonymousObject() throws Exception {
        String fileName = KotlinTestUtils.navigationMetadata("compiler/testData/codegen/box/objects/objectInLocalAnonymousObject.kt");
        doTest(fileName);
    }

    @TestMetadata("objectInitialization_kt5523.kt")
    public void testObjectInitialization_kt5523() throws Exception {
        String fileName = KotlinTestUtils.navigationMetadata("compiler/testData/codegen/box/objects/objectInitialization_kt5523.kt");
        doTest(fileName);
    }

    @TestMetadata("objectLiteral.kt")
    public void testObjectLiteral() throws Exception {
        String fileName = KotlinTestUtils.navigationMetadata("compiler/testData/codegen/box/objects/objectLiteral.kt");
        doTest(fileName);
    }

    @TestMetadata("objectLiteralInClosure.kt")
    public void testObjectLiteralInClosure() throws Exception {
        String fileName = KotlinTestUtils.navigationMetadata("compiler/testData/codegen/box/objects/objectLiteralInClosure.kt");
        doTest(fileName);
    }

    @TestMetadata("objectVsClassInitialization_kt5291.kt")
    public void testObjectVsClassInitialization_kt5291() throws Exception {
        String fileName = KotlinTestUtils.navigationMetadata("compiler/testData/codegen/box/objects/objectVsClassInitialization_kt5291.kt");
        doTest(fileName);
    }

    @TestMetadata("objectWithSuperclass.kt")
    public void testObjectWithSuperclass() throws Exception {
        String fileName = KotlinTestUtils.navigationMetadata("compiler/testData/codegen/box/objects/objectWithSuperclass.kt");
        doTest(fileName);
    }

    @TestMetadata("objectWithSuperclassAndTrait.kt")
    public void testObjectWithSuperclassAndTrait() throws Exception {
        String fileName = KotlinTestUtils.navigationMetadata("compiler/testData/codegen/box/objects/objectWithSuperclassAndTrait.kt");
        doTest(fileName);
    }

    @TestMetadata("privateExtensionFromInitializer_kt4543.kt")
    public void testPrivateExtensionFromInitializer_kt4543() throws Exception {
        String fileName = KotlinTestUtils.navigationMetadata("compiler/testData/codegen/box/objects/privateExtensionFromInitializer_kt4543.kt");
        doTest(fileName);
    }

    @TestMetadata("privateFunctionFromClosureInInitializer_kt5582.kt")
    public void testPrivateFunctionFromClosureInInitializer_kt5582() throws Exception {
        String fileName = KotlinTestUtils.navigationMetadata("compiler/testData/codegen/box/objects/privateFunctionFromClosureInInitializer_kt5582.kt");
        doTest(fileName);
    }

    @TestMetadata("receiverInConstructor.kt")
    public void testReceiverInConstructor() throws Exception {
        String fileName = KotlinTestUtils.navigationMetadata("compiler/testData/codegen/box/objects/receiverInConstructor.kt");
        doTest(fileName);
    }

    @TestMetadata("safeAccess.kt")
    public void testSafeAccess() throws Exception {
        String fileName = KotlinTestUtils.navigationMetadata("compiler/testData/codegen/box/objects/safeAccess.kt");
        doTest(fileName);
    }

    @TestMetadata("simpleObject.kt")
    public void testSimpleObject() throws Exception {
        String fileName = KotlinTestUtils.navigationMetadata("compiler/testData/codegen/box/objects/simpleObject.kt");
        doTest(fileName);
    }

    @TestMetadata("thisInConstructor.kt")
    public void testThisInConstructor() throws Exception {
        String fileName = KotlinTestUtils.navigationMetadata("compiler/testData/codegen/box/objects/thisInConstructor.kt");
        doTest(fileName);
    }

    @TestMetadata("useAnonymousObjectAsIterator.kt")
    public void testUseAnonymousObjectAsIterator() throws Exception {
        String fileName = KotlinTestUtils.navigationMetadata("compiler/testData/codegen/box/objects/useAnonymousObjectAsIterator.kt");
        doTest(fileName);
    }

    @TestMetadata("useImportedMember.kt")
    public void testUseImportedMember() throws Exception {
        String fileName = KotlinTestUtils.navigationMetadata("compiler/testData/codegen/box/objects/useImportedMember.kt");
        doTest(fileName);
    }

    @TestMetadata("useImportedMemberFromCompanion.kt")
    public void testUseImportedMemberFromCompanion() throws Exception {
        String fileName = KotlinTestUtils.navigationMetadata("compiler/testData/codegen/box/objects/useImportedMemberFromCompanion.kt");
        doTest(fileName);
    }
}