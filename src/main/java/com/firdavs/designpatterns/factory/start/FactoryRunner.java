package com.firdavs.designpatterns.factory.start;

import com.firdavs.designpatterns.factory.models.CppDeveloperFactory;
import com.firdavs.designpatterns.factory.models.Developer;
import com.firdavs.designpatterns.factory.models.DeveloperFactory;
import com.firdavs.designpatterns.factory.models.JavaDeveloperFactory;

public class FactoryRunner {
    public static void main(String[] args) {
            DeveloperFactory developerFactory=createDeveloperFactoryBySpecialty("java");
            Developer developer=developerFactory.createDeveloper();
            developer.writeCode();
    }

    private  static DeveloperFactory createDeveloperFactoryBySpecialty(String specialty) {
        if(specialty.equalsIgnoreCase("java")){
            return new JavaDeveloperFactory();
        } else if (specialty.equalsIgnoreCase("c++")) {
            return   new CppDeveloperFactory();
        } else {
            throw  new RuntimeException(specialty + " specialty is not recognized!");
        }

    }
}
