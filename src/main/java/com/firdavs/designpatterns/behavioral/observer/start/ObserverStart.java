package com.firdavs.designpatterns.behavioral.observer.start;

import com.firdavs.designpatterns.behavioral.observer.entity.JavaDeveloperJobSite;
import com.firdavs.designpatterns.behavioral.observer.entity.Observer;
import com.firdavs.designpatterns.behavioral.observer.entity.Subsrciber;

public class ObserverStart {
    public static void main(String[] args) {
        JavaDeveloperJobSite site =new JavaDeveloperJobSite();
        site.addVacancy("Java architect");
        site.addVacancy("Senior Java developer");

        Observer firstSubscriber =new Subsrciber("Firdavs Khaidarov");
        Observer secondSubscriber =new Subsrciber("Peter Romanenko");

        site.addObserver(firstSubscriber);
        site.addObserver(secondSubscriber);

        site.addVacancy("Team Lead");
        site.removeObserver(secondSubscriber);
        site.removeVacancy("Java architect");









    }
}
