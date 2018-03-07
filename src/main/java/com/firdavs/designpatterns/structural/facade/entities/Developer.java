package com.firdavs.designpatterns.structural.facade.entities;

public class Developer {
    public void doJobBeforeDeadLine(BugTracker bugTracker){
        if(bugTracker.isActiveSprint()) {
            System.out.println("Developer solves a problem");
        } else {
            System.out.println("Developer reads  habrahabr....");
        }
    }
}
