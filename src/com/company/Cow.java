package com.company;

public class Cow implements Walkable {
    private String name;

    public Cow(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Cow{" +
                "name='" + name;
    }

    @Override
    public void method1() {

    }

    @Override
    public void method3() {
        Walkable.super.method3();
    }
}
