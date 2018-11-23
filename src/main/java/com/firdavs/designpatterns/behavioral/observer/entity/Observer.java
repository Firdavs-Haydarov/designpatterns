package com.firdavs.designpatterns.behavioral.observer.entity;

import java.util.List;

public interface Observer {
    void handleEvent(List<String> vacancies);
}
