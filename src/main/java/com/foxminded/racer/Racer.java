package com.foxminded.racer;

import java.time.LocalTime;

public class Racer {

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

    private String car;
    public String getCar() {
        return car;
    }
    private String fulName;
    public String getFulName() {
        return fulName;
    }
    private LocalTime localTime;
    public LocalTime getLocalTime() {
        return localTime;
    }
    private String name;
    public String getName() {
        return name;
    }



}
