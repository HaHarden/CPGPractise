package com.cpg.dfg;

public class TestSwitchStatement {
    public static void main(String[] args) {
        Language language = Language.JAVA;
        switch (language) { // SwitchStatement，selector就是 language引用
            case JAVA:
                System.out.println("Java");
                break;
            case CPP:
                System.out.println("Cpp, skip~");
            default:
                System.out.println("not support language");
        }
    }

    enum Language {
        JAVA, CPP
    }
}
