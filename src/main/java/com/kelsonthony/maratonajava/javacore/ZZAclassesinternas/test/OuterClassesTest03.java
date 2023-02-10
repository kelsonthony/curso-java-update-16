package com.kelsonthony.maratonajava.javacore.ZZAclassesinternas.test;

public class OuterClassesTest03 {
    private String name = "Kelson";
    static class Nested {
        private String lastName = "Anthony";
        void print() {
            System.out.println(new OuterClassesTest03().name + " " + lastName);
        }
    }
    public static void main(String[] args) {
        Nested nested = new Nested();
        Nested nested1 = new OuterClassesTest03.Nested();
        nested.print();
    }
}
