package com.firdavs.designpatterns.creational.abstractfactory.entities.banking;

import com.firdavs.designpatterns.creational.abstractfactory.entities.interfaces.Tester;

public class QATester implements Tester {
    public void test() {
        System.out.println("QA tester test banking code");
    }
}
