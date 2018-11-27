package com.firdavs.designpatterns.structural.decorator.start;

import com.firdavs.designpatterns.structural.decorator.entity.Developer;
import com.firdavs.designpatterns.structural.decorator.entity.JavaDeveloper;
import com.firdavs.designpatterns.structural.decorator.entity.JavaTeamLead;
import com.firdavs.designpatterns.structural.decorator.entity.SeniorJavaDeveloper;

public class Task {
    public static void main(String[] args) {
        Developer developer = new JavaTeamLead(new SeniorJavaDeveloper(new JavaDeveloper()));
        System.out.println(developer.makeJob());

    }
}
