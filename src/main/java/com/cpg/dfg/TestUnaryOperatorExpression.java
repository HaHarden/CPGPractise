package com.cpg.dfg;

public class TestUnaryOperatorExpression {
    public static void main(String[] args) {
        int b = 2;
        b = 1;  // last write access of b
        int a = -b;  // UnaryOperatorExpression
        System.out.println(a);
    }
}
