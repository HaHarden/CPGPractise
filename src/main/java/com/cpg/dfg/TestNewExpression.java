package com.cpg.dfg;

public class TestNewExpression {
    public static void main(String[] args) {
        MyObject o = new MyObject("cpg");  // new MyObject("cpg") 就是一个 NewExpression
    }
    static class MyObject {
        String name;

        public MyObject(String name) {
            this.name = name;
        }
    }
}
