package com.firdavs.designpatterns.creational.abstractfactory.start;

import com.firdavs.designpatterns.creational.abstractfactory.entities.banking.BankingFactory;
import com.firdavs.designpatterns.creational.abstractfactory.entities.interfaces.Developer;
import com.firdavs.designpatterns.creational.abstractfactory.entities.interfaces.ProjectFactory;
import com.firdavs.designpatterns.creational.abstractfactory.entities.interfaces.ProjectManager;
import com.firdavs.designpatterns.creational.abstractfactory.entities.interfaces.Tester;
import com.firdavs.designpatterns.creational.abstractfactory.entities.website.SiteFactory;

public class AbstractFactoryRunner {
    public static void main(String[] args) {
        ProjectFactory projectFactory=new SiteFactory();
        Developer developer=projectFactory.getDeveloper();
        Tester tester=projectFactory.getTester();
        ProjectManager projectManager=projectFactory.getProjectManager();
        developer.writeCode();
        tester.test();
        projectManager.manageProject();
    }
}
