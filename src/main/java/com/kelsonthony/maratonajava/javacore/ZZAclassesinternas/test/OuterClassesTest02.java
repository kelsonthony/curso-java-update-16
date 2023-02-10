package com.kelsonthony.maratonajava.javacore.ZZAclassesinternas.test;

public class OuterClassesTest02 {
    {
        class Test {

        }
    }

    private String name = "Kakaroto";

    void print(final String param) {
        //obrigatório ser final
        final String lastName = "SSJ";

        class LocalClass {
            public void printLocal() {
                System.out.println(name + " " + lastName + " " +  param);
            }
        }

        LocalClass localClass = new LocalClass();
        localClass.printLocal();
    }

    public static void main(String[] args) {
        OuterClassesTest02 outer = new OuterClassesTest02();

        outer.print("DBZ");

    }
}
