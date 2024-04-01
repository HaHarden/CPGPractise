package com.cpg;

import de.fraunhofer.aisec.cpg.*;
import de.fraunhofer.aisec.cpg.frontends.java.JavaLanguage;
import de.fraunhofer.aisec.cpg.graph.Assignment;
import de.fraunhofer.aisec.cpg.graph.Node;
import de.fraunhofer.aisec.cpg.graph.declarations.FieldDeclaration;
import de.fraunhofer.aisec.cpg.graph.declarations.MethodDeclaration;
import de.fraunhofer.aisec.cpg.graph.declarations.TupleDeclaration;
import de.fraunhofer.aisec.cpg.graph.declarations.VariableDeclaration;
import de.fraunhofer.aisec.cpg.graph.statements.*;
import de.fraunhofer.aisec.cpg.graph.statements.expressions.*;
import de.fraunhofer.aisec.cpg.processing.IVisitor;
import de.fraunhofer.aisec.cpg.processing.strategy.Strategy;

import java.io.File;
import java.nio.file.Path;
import java.util.List;
import java.util.concurrent.ExecutionException;

public class Main {
    public static void main(String[] args) {
        File file = new File("src/main/java/com/cpg/dfg/TestAssignExpression.java");
        TranslationResult tr = analyze(List.of(file), Path.of("src/main/java"), true);
        MyVisitor visitor = new MyVisitor();
        tr.accept(Strategy.INSTANCE::AST_FORWARD, visitor);
        System.out.println(tr);
    }

    private static TranslationResult analyze(List<File> files, Path topLevel, Boolean usePass) {
        TranslationResult result = null;
        TranslationConfiguration.Builder builder = new TranslationConfiguration.Builder();
        TranslationConfiguration configuration = null;
        InferenceConfiguration inferenceConfiguration = new InferenceConfiguration.Builder().build();
        try {
            configuration = builder
                    .sourceLocations(files)
                    .debugParser(true)
                    .defaultPasses()  // 此处默认使用defaultPasses，若有需要，请手动配置
                    .inferenceConfiguration(inferenceConfiguration) // 默认开启所有推断模块，若有需要，请手动配置
                    .registerLanguage(new JavaLanguage())
                    .build();
            TranslationManager analyzer = new TranslationManager.Builder().config(configuration).build();
            result = analyzer.analyze().get();
            /**
             * 手动配置passes方式如下：（可选择性关闭/开启某些Pass，需要注意Pass间的依赖关系）
             *   此处kotlin使用了KClass反射，所以Java调用时需要将Class类转换为KClass类型
             *
             * builder.registerPass(JvmClassMappingKt.getKotlinClass(TypeResolver.class));
             * builder.registerPass(JvmClassMappingKt.getKotlinClass(TypeHierarchyResolver.class));
             * builder.registerPass(JvmClassMappingKt.getKotlinClass(EvaluationOrderGraphPass.class));
             * builder.registerPass(JvmClassMappingKt.getKotlinClass(SymbolResolver.class));
             * builder.registerPass(JvmClassMappingKt.getKotlinClass(DFGPass.class));
             * builder.registerPass(JvmClassMappingKt.getKotlinClass(ControlFlowSensitiveDFGPass.class));
             */

            /**
             * 手动配置inference推断模块方法如下：（可选择性关闭/开启某些推断模块）
             *  InferenceConfiguration inferenceConfiguration = inferenceConfiguration.builder()
             *                     .enabled(true)
             *                     .guessCastExpressions(true)  // 针对C++
             *                     .inferFunctions(true)
             *                     .inferRecords(true)
             *                     .inferVariables(true)
             *                     .inferDfgForUnresolvedCalls(true).build();
             */
        } catch (ConfigurationException e) {
            throw new RuntimeException(e);
        } catch (ExecutionException e) {
            throw new RuntimeException(e);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        return result;
    }

    static class MyVisitor extends IVisitor<Node> {
        public void visit(AssignExpression assignExpression) {
            System.out.println(assignExpression);
        }

        public void visit(BinaryOperator binaryOperator) {
            System.out.println(binaryOperator);
        }

        public void visit(NewArrayExpression newArrayExpression) {
            System.out.println(newArrayExpression);
        }

        public void visit(NewExpression newExpression) {
            System.out.println(newExpression);
        }

        public void visit(SubscriptExpression subscriptExpression) {
            System.out.println(subscriptExpression);
        }

        public void visit(ConditionalExpression conditionalExpression) {
            System.out.println(conditionalExpression);
        }

        public void visit(Reference reference) {
            System.out.println(reference);
        }

        public void visit(MemberExpression memberExpression) {
            System.out.println(memberExpression);
        }

        public void visit(ExpressionList expressionList) {
            System.out.println(expressionList);
        }

        public void visit(InitializerListExpression initializerListExpression) {
            System.out.println(initializerListExpression);
        }

        public void visit(KeyValueExpression keyValueExpression) {
            System.out.println(keyValueExpression);
        }

        public void visit(LambdaExpression lambdaExpression) {
            System.out.println(lambdaExpression);
        }

        public void visit(UnaryOperator unaryOperator) {
            System.out.println(unaryOperator);
        }

        public void visit(ReturnStatement returnStatement) {
            System.out.println(returnStatement);
        }

        public void visit(ForEachStatement forEachStatement) {
            System.out.println(forEachStatement);
        }

        public void visit(DoStatement doStatement) {
            System.out.println(doStatement);
        }

        public void visit(WhileStatement whileStatement) {
            System.out.println(whileStatement);
        }

        public void visit(ForStatement forStatement) {
            System.out.println(forStatement);
        }

        public void visit(IfStatement ifStatement) {
            System.out.println(ifStatement);
        }

        public void visit(SwitchStatement switchwStatement) {
            System.out.println(switchwStatement);
        }

        public void visit(MethodDeclaration methodDeclaration) {
            System.out.println(methodDeclaration);
        }

        public void visit(FieldDeclaration fieldDeclaration) {
            System.out.println(fieldDeclaration);
        }

        public void visit(VariableDeclaration variableDeclaration) {
            System.out.println(variableDeclaration);
        }

        public void visit(TupleDeclaration tupleDeclaration) {
            System.out.println(tupleDeclaration);
        }

        public void visit(Assignment assignment) {
            System.out.println(assignment);
        }
    }
}
