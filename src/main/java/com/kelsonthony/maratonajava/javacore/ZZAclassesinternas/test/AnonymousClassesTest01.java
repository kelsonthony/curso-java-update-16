package com.kelsonthony.maratonajava.javacore.ZZAclassesinternas.test;

class Animal {
    public void walk(){
        System.out.println("Animal walking");
    }
}

class Cachoro extends Animal {
    @Override
    public void walk() {
        System.out.println("Cachorro walking");
    }
}
public class AnonymousClassesTest01 {
    public static void main(String[] args) {
        Animal animal = new Animal(){
            @Override
            public void walk() {
                System.out.println("Walking in the shadows.");
                jump();
            }
            public void jump() {
                System.out.println("Animal jump");
            }
        };
        animal.walk();

    }
}
