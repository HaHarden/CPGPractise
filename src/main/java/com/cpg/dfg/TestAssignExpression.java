package com.cpg.dfg;

public class TestAssignExpression {
    public static void main(String[] args) {
        // Normal assignment
        MyObject o1 = new MyObject();
        MyObject o2 = new MyObject();
        o1 = o2;  // AssignExpression
        System.out.println(o1);
        // Compound assignment
        int a = 1;
        a += 1;  // AssignExpression
        System.out.println(a);
    }

    static class MyObject{}
}
