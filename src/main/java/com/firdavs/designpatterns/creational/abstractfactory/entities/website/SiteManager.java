package com.firdavs.designpatterns.creational.abstractfactory.entities.website;

import com.firdavs.designpatterns.creational.abstractfactory.entities.interfaces.ProjectManager;

public class SiteManager implements ProjectManager{
    public void manageProject() {
        System.out.println("SiteManager manages site promotion");
    }
}
