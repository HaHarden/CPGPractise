package com.cpg.dfg;

public class TestLambdaExpression {
    public static void main(String[] args) {
        Thread thread = new Thread(() -> System.out.println("I am SASTing!")); // LambdaExpression
        thread.start();
    }
}