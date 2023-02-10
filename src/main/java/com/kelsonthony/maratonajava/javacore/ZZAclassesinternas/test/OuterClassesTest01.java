package com.kelsonthony.maratonajava.javacore.ZZAclassesinternas.test;

//classes internas são classes dentro da outra
public class OuterClassesTest01 {
    private String name = "Kelson Anthony";

    //pode receber modificadores de acesso, public, default, private
    class Inner {
        public void printOuterClassAttribute() {
            System.out.println(name);
            System.out.println(this);
            System.out.println(OuterClassesTest01.this);
        }
    }

    public static void main(String[] args) {

        OuterClassesTest01 outerClassesTest01 = new OuterClassesTest01();

        OuterClassesTest01.Inner inner0 = outerClassesTest01.new Inner();
        Inner inner1 = outerClassesTest01.new Inner();
        inner1.printOuterClassAttribute();

        Inner inner2 = new OuterClassesTest01().new Inner();
        inner2.printOuterClassAttribute();



    }
}
