package com.cpg.dfg;

public class TestVariableDeclaration {
    public static void main(String[] args) {
        String str = "init str"; // initializer of str
        System.out.println(str); // read access of str
        readStr(str); // read access of str
        str = "SASTing"; // write access of str
        System.out.println(str); // read access of str, str写入值后的读取，故VariableDeclaration不会流向此处
    }
    private static void readStr(String str) {
        System.out.println(str);
    }
}