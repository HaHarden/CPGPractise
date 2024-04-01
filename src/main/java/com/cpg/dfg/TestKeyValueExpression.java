package com.cpg.dfg;

import java.util.Map;

public class TestKeyValueExpression {
    // java不支持
    public static void main(String[] args) {
        int[] a = new int[] {1};
        int b = a[0];

        int[][] emptyMatrix = new int[1][2];

        int[][] matrix = new int[][] {new int[] {1, 2}, new int[] {3, 4}};
        Map.of("name","SASTing");  // // KeyValueExpression
    }
}
