package com.cpg.dfg;

public class TestCallExpression {
    public static void main() {
        int a, b, c;
        a = 6;
        b = addOne(a);
        c = b - 3;
        b = ten();
        c = a * b;
    }

    static int addOne(int x) {
        int y = x + 1;
        return y;
    }

    static int ten() {
        return 10;
    }
}
