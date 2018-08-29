package com.firdavs.designpatterns.creational.abstractfactory.entities.banking;


import com.firdavs.designpatterns.creational.abstractfactory.entities.interfaces.Developer;

public class JavaDeveloper implements Developer{
    public void writeCode() {
        System.out.println("Java developer writes java code");
    }
}
