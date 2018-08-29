package com.firdavs.designpatterns.creational.abstractfactory.entities.banking;


import com.firdavs.designpatterns.creational.abstractfactory.entities.interfaces.Developer;
import com.firdavs.designpatterns.creational.abstractfactory.entities.interfaces.ProjectFactory;
import com.firdavs.designpatterns.creational.abstractfactory.entities.interfaces.ProjectManager;
import com.firdavs.designpatterns.creational.abstractfactory.entities.interfaces.Tester;

public class BankingFactory implements ProjectFactory {
    public Developer getDeveloper() {
        return new JavaDeveloper();
    }

    public Tester getTester() {
        return new QATester();
    }

    public ProjectManager getProjectManager() {
        return new BankingManager();
    }
}
