package com.firdavs.designpatterns.structural.facade.entities;

public class WorkFlowFacade {
    private Job job=new Job();
    private BugTracker bugTracker=new BugTracker();
    private Developer developer=new Developer();

    public void solveProblem(){
        job.doJob();
        bugTracker.startSprint();
        developer.doJobBeforeDeadLine(bugTracker);
//        bugTracker.stopSprint();
//        developer.doJobBefireDeadLine(bugTracker);
    }

}
