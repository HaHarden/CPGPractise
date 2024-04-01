package com.cpg.dfg;

import java.util.Arrays;
import java.util.List;

public class TestForEachStatement {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("hello", "SASTing");
        for (String s : list) { // // ForEachStatement，属性 variable表示String s,属性iterable表示list
            System.out.println(s);
        }
    }
}