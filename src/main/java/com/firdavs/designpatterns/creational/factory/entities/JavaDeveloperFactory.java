package com.firdavs.designpatterns.creational.factory.entities;

public class JavaDeveloperFactory implements  DeveloperFactory{
    @Override
    public Developer createDeveloper() {
        return new JavaDeveloper();
    }
}
