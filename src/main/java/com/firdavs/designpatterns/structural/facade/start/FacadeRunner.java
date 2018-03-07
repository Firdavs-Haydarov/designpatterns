package com.firdavs.designpatterns.structural.facade.start;

import com.firdavs.designpatterns.structural.facade.models.WorkFlowFacade;

public class FacadeRunner {
    public static void main(String[] args) {
        WorkFlowFacade workFlowFacade=new WorkFlowFacade();
        workFlowFacade.solveProblem();
    }
}
