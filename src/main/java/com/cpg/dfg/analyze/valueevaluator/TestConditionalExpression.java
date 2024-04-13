package com.cpg.dfg.analyze.valueevaluator;

public class TestConditionalExpression {
    public void test() {
        int a = 1;
        a = a != 1 ? 2 : a;
        System.out.println(a);
    }
}
