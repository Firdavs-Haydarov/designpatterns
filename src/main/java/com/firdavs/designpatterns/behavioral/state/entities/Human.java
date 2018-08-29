package com.firdavs.designpatterns.behavioral.state.entities;

public class Human {
    private Activity activity;

    public void setActivity(Activity activity) {
        this.activity = activity;
    }

    public void doSomething() {
        activity.doSomething(this);
    }
}
