package com.company;

public class Main {

    public static void main(String[] args) {

        Walkable walkable1 = new Cow("Daisy");
        Walkable walkable2 = new Dog(34);
        Walkable walkable3 = new Cat("white");

        Walkable [] walkables = {walkable1, walkable2, walkable3};

        for (Walkable walkable : walkables) {
            System.out.println(walkable);
            Walkable.method2();
        }


    }
}
