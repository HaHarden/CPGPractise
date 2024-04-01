package com.cpg.dfg;

public class TestReferenceCFS {
    // ControlFlowSensitiveDFGPass test case
    public static void main(String[] args) {
        int a = 1;
        String str = "init";  // str initializer
        if (a > 0) {
            str = "a";  // str 赋值
        }
        else {
            str = "b";  // str 赋值
        }
        System.out.println(str);  // read access of str
        a = 2;  // write access of a
        a = 3;  // write access of a
        a++;  // write access of a
        System.out.println(a); // read access of a
        a += 1;  // write access of a
        System.out.println(a); // read access of a
    }
}
