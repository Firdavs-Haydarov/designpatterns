package com.firdavs.designpatterns.creational.abstractfactory.entities.banking;

import com.firdavs.designpatterns.creational.abstractfactory.entities.interfaces.ProjectManager;

public class BankingManager implements ProjectManager {
    public void manageProject() {
        System.out.println("Banking manager manages banking persones");
    }
}
