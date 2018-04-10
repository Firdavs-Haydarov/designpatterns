package com.firdavs.designpatterns.creational.abstractfactory.entities.website;

import com.firdavs.designpatterns.creational.abstractfactory.entities.interfaces.Tester;

public class LoadTester implements Tester {
    public void test() {
        System.out.println("Load tester test web site");
    }
}
