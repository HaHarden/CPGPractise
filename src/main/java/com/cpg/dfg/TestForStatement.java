package com.cpg.dfg;

import java.util.Arrays;
import java.util.List;

public class TestForStatement {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("hello", "SASTing");
        for (int i=0;i<list.size();i++) { // ForStatement, condition就是i<list.size()
            System.out.println(list.get(i));
        }
    }
}