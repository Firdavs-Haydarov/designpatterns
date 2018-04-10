package com.firdavs.designpatterns.creational.abstractfactory.entities.website;

import com.firdavs.designpatterns.creational.abstractfactory.entities.interfaces.Developer;
import com.firdavs.designpatterns.creational.abstractfactory.entities.interfaces.ProjectFactory;
import com.firdavs.designpatterns.creational.abstractfactory.entities.interfaces.ProjectManager;
import com.firdavs.designpatterns.creational.abstractfactory.entities.interfaces.Tester;

public class SiteFactory implements ProjectFactory{
    public Developer getDeveloper() {
        return new PHPDeveloper();
    }

    public Tester getTester() {
        return new LoadTester();
    }

    public ProjectManager getProjectManager() {
        return new SiteManager();
    }
}
