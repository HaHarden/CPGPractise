package com.cpg.dfg;

public class TestCastExpression {
    public static void main(String[] args) {
        Object o = getMyObject(1);
        if (o instanceof MyObject) {
            MyObject myObject = (MyObject) o;
            System.out.println(myObject);
        }
    }

    private static Object getMyObject(int a) {
        if (a > 0) {
            return new MyObject();
        }
        else {
            return new Object();
        }
    }
    static class MyObject {

    }
}
