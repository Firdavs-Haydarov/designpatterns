package com.firdavs.designpatterns.behavioral.state.entities;

public class WeekEnd implements Activity {
    private int count = 0;
    @Override
    public void doSomething(Human human) {
        if(count<3) {
            System.out.println("Having a rest...");
            count++;

        } else {
            human.setActivity(new Work());
        }
    }
}
