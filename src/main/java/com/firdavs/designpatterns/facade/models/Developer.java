package com.firdavs.designpatterns.facade.models;

public class Developer {
    public void doJobBefireDeadLine(BugTracker bugTracker){
        if(bugTracker.isActiveSprint()) {
            System.out.println("Developer solves a problem");
        } else {
            System.out.println("Developer reads  habrahabr....");
        }
    }
}
