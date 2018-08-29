package com.firdavs.designpatterns.creational.abstractfactory.entities.website;

import com.firdavs.designpatterns.creational.abstractfactory.entities.interfaces.Developer;

public class PHPDeveloper implements Developer{
    public void writeCode() {
        System.out.println("PHP developer writes php code");
    }
}
