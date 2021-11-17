package com.foxminded.racer;

import java.time.LocalTime;

public class Racer {

    String car;

    public Racer(String name, String fulName, String car) {
        this.car = car;
        this.fulName = fulName;
        this.name = name;
    }

    @Override
    public String toString() {
        return getName() + "=" + getLocalTime();
    }

    public Racer(String name, LocalTime localTime) {
        this.localTime = localTime;
        this.name = name;
    }

    public String getCar() {
        return car;
    }

    public String getFulName() {
        return fulName;
    }

    String fulName;

    public LocalTime getLocalTime() {
        return localTime;
    }

    public String getName() {
        return name;
    }

    LocalTime localTime;
    String name;
}
