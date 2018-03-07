package com.firdavs.designpatterns.factory.models;

public class JavaDeveloperFactory implements  DeveloperFactory{
    @Override
    public Developer createDeveloper() {
        return new JavaDeveloper();
    }
}
