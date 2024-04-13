package com.cpg.dfg.analyze.valueevaluator;

public class TestReference {
    // interprocedural test case
    public void test() {
        int a = 1;
        a = getA(a);
        System.out.println(a);
    }

    public int getA(int a) {
        a++;
        return a;
    }
}
