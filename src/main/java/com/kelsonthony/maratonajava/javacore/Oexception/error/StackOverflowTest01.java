package com.kelsonthony.maratonajava.javacore.Oexception.error;

public class StackOverflowTest01 {

    public static void main(String[] args) {
        recursividade();
    }

    public static void recursividade() {

        recursividade();
    }
}
