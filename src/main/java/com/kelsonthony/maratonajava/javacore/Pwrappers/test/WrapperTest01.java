package com.kelsonthony.maratonajava.javacore.Pwrappers.test;

public class WrapperTest01 {

    public static void main(String[] args) {
        /**
         * T8 tipos primitiso no chava
         */
        byte byteP = 1;
        short shortP = 1;
        int intP = 1;
        long longP = 1L;
        float floatP = 1F;
        double doubleP = 1D;
        char charP = 'W';
        boolean booleanP = false;

        /**
         * Classes Wrappers incapsulam os tipos primitivos e transformam em objetos
         */
        Byte byteW = 127;
        Short shortW = 1;
        Integer intW = 1; // boxing ou autoboxing
        Long longW = 1L;
        Float floatW = 1F;
        Double doubleW = 1D;
        Character charW = 'W';
        Boolean booleanW = false;

        int i = intW; // unboxing
        Integer intW2 = Integer.parseInt("1");
        Integer intW3 = new Integer("2"); // depreciado
        Boolean verdadeiro = Boolean.parseBoolean("true");

        System.out.println(Character.isDigit('A'));
        System.out.println(Character.isDigit('9'));
        System.out.println(Character.isLetterOrDigit('!'));
        System.out.println(Character.isLowerCase('!'));
        System.out.println(Character.isUpperCase('!'));
        System.out.println(Character.toLowerCase('A'));

    }
}
