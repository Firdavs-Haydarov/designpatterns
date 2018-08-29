package com.firdavs.designpatterns.behavioral.state.entities;

public class Work implements Activity {
    @Override
    public void doSomething(Human human) {
        System.out.println("Working...");
        human.setActivity(new WeekEnd());
    }
}
