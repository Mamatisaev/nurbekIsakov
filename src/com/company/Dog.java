package com.company;

public class Dog implements Walkable {
    private int age;

    public Dog(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Dog{" +
                "age=" + age;
    }

    @Override
    public void method1() {

    }

    @Override
    public void method3() {
        Walkable.super.method3();
    }
}
