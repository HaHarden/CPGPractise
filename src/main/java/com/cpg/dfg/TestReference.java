package com.cpg.dfg;

public class TestReference {
    public static void main(String[] args) {
        String a = "a";
        readA(a);  // read access of a
        a = "";  // write access of a
        a += "b";  // read and write access of a
    }
    private static void readA(String a) {
        System.out.println("read access of " + a);
    }
}