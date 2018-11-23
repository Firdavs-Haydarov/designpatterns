package com.firdavs.designpatterns.behavioral.observer.entity;

import java.util.List;

public class Subsrciber implements Observer {
    private String name;

    public Subsrciber(String name) {
        this.name = name;
    }

    public void handleEvent(List<String> vacancies) {
        System.out.println("Dear "+name+ "\nWe have some chages in vacancies");
        System.out.println("\t\tVacancies are: ");
        System.out.println(vacancies);
//        vacancies.stream().forEach(System.out::println);
        System.out.println("\n========================================================\n");

    }
}
