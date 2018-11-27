package com.firdavs.designpatterns.structural.decorator.entity;

public class JavaDeveloper implements Developer {
    @Override
    public String makeJob() {
        return "Write Java code.";
    }
}
