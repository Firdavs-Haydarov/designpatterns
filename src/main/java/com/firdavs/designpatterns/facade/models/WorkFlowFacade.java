package com.firdavs.designpatterns.facade.models;

public class WorkFlowFacade {
    Job job=new Job();
    BugTracker bugTracker=new BugTracker();
    Developer developer=new Developer();

    public void solveProblem(){
        job.doJob();
        bugTracker.startSprint();
        developer.doJobBefireDeadLine(bugTracker);
        bugTracker.stopSprint();
        developer.doJobBefireDeadLine(bugTracker);
    }

}
