package com.firdavs.designpatterns.structural.facade.start;

import com.firdavs.designpatterns.structural.facade.entities.WorkFlowFacade;

public class FacadeRunner {
    public static void main(String[] args) {
        WorkFlowFacade workFlowFacade=new WorkFlowFacade();
        workFlowFacade.solveProblem();
    }
}
