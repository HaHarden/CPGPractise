package com.cpg.dfg;

public class TestMemberExpression {
    // refersTo == null  test case
    public static void main(String[] args) {
        System.out.println(ClassWithoutNameField.name);  // ClassWithoutNameField.name是一个 MemberExpression
    }
    static class ClassWithoutNameField {
        // 该类没有name字段
    }
}
