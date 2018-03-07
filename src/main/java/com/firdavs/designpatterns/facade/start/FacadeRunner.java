package com.firdavs.designpatterns.facade.start;

import com.firdavs.designpatterns.facade.models.WorkFlowFacade;

public class FacadeRunner {
    public static void main(String[] args) {
        WorkFlowFacade workFlowFacade=new WorkFlowFacade();
        workFlowFacade.solveProblem();
    }
}
