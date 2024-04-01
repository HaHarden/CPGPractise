package com.cpg.dfg;

public class TestDoStatement {
    public static void main(String[] args) {
        int i=3;
        do {  // DoStatement,condition就是 i<10
            System.out.println("Hello SASTing!");
            i++;
        } while (i<10);
    }
}