package com.firdavs.designpatterns.creational.factory.models;

public class CppDeveloper implements Developer {
    @Override
    public void writeCode() {
        System.out.println("C++ developer writes C++ code!");
    }
}
