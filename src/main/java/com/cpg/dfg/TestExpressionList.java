package com.cpg.dfg;

import java.util.Arrays;
import java.util.List;

public class TestExpressionList {
    public static void main(String[] args) {
        List<String> ls = Arrays.asList(args);
        int i, j = 0;

        for (i = 1, j = 1; i < ls.size(); i++) {  // i = 1, j = 1 就是一个ExpressionList
            System.out.println(ls.get(i));
        }
    }
}
