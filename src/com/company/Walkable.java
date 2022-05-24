package com.company;

public interface Walkable {

    void method1();

    static void method2() {
        System.out.println("This is a static method.");
    }
    default void method3() {
        System.out.println("This is a default method.");
    }

}
