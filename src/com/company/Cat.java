package com.company;

public class Cat implements Walkable{
    private String color;

    public Cat(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return "Cat{" +
                "color='" + color;
    }

    @Override
    public void method1() {

    }

    @Override
    public void method3() {
        Walkable.super.method3();
    }
}
