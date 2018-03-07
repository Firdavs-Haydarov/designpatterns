package com.firdavs.designpatterns.factory.models;

public class JavaDeveloper implements Developer {
    @Override
    public void writeCode() {
        System.out.println("Java developer writes Java code!");
    }
}
