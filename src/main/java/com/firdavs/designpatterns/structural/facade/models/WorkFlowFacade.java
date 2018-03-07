package com.firdavs.designpatterns.structural.facade.models;

public class WorkFlowFacade {
    private Job job=new Job();
    private BugTracker bugTracker=new BugTracker();
    private Developer developer=new Developer();

    public void solveProblem(){
        job.doJob();
        bugTracker.startSprint();
        developer.doJobBefireDeadLine(bugTracker);
//        bugTracker.stopSprint();
//        developer.doJobBefireDeadLine(bugTracker);
    }

}
