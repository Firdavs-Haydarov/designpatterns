package com.firdavs.designpatterns.behavioral.state.start;

import com.firdavs.designpatterns.behavioral.state.entities.Human;
import com.firdavs.designpatterns.behavioral.state.entities.Work;

public class StartState {
    public static void main(String[] args) {
        Human human = new Human();
        human.setActivity(new Work());
        for (int i = 0; i <10 ; i++) {
            human.doSomething();
        }
    }
}
