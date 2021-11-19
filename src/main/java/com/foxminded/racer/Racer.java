package com.foxminded.racer;

import java.time.LocalTime;
import java.util.Objects;

public class Racer {

    public Racer(String name, String nameSurname, String car) {
        this.car = car;
        this.nameSurname = nameSurname;
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

    private String nameSurname;

    public String getNameSurname() {
        return nameSurname;
    }

    private LocalTime localTime;

    public LocalTime getLocalTime() {
        return localTime;
    }

    private String name;

    public String getName() {
        return name;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Racer racer = (Racer) o;
        if (localTime != null && (localTime.equals(racer.localTime) && name.equals(racer.name))) {
            return true;
        } else return car.equals(racer.car) && name.equals(racer.name) && nameSurname.equals(racer.nameSurname);
    }

    @Override
    public int hashCode() {
        return Objects.hash(car, nameSurname, localTime, name);
    }
}
