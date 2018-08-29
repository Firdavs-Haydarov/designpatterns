package com.firdavs.designpatterns.creational.factory.entities;

public class CppDeveloperFactory implements DeveloperFactory {
        public Developer createDeveloper() {
        return new CppDeveloper();
    }
}
