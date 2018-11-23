package com.firdavs.designpatterns.behavioral.observer.entity;

import java.util.ArrayList;
import java.util.List;

public class JavaDeveloperJobSite implements Observable {
    private List<Observer> observers =new ArrayList<>();
    private List<String> vacancies =new ArrayList<>();



    public void addVacancy(String vacancy){
        this.vacancies.add(vacancy);
        notifyObservers();
    }

    public void removeVacancy(String vacancy){
        this.vacancies.remove(vacancy);
        notifyObservers();
    }





    public void addObserver(Observer observer) {
            this.observers.add(observer);
    }

    public void removeObserver(Observer observer) {
            observers.remove(observer);
    }

    public void notifyObservers() {
        observers.forEach(s->s.handleEvent(this.vacancies));


    }
}
