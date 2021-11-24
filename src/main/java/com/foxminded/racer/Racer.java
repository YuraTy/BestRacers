package com.foxminded.racer;

import java.time.Duration;
import java.time.LocalDateTime;
import java.util.Objects;

public class Racer implements Comparable<Racer> {
    private String car;

    public String getCar() {
        return car;
    }

    private String nameSurname;

    public String getNameSurname() {
        return nameSurname;
    }

    private String name;

    public String getName() {
        return name;
    }

    public Racer(String name, String nameSurname, String car) {
        this.car = car;
        this.nameSurname = nameSurname;
        this.name = name;
    }

    public Duration getBetween() {
        return between;
    }

    private Duration between;

    public Racer(String name, Duration between) {
        this.between = between;
        this.name = name;
    }

    public LocalDateTime getLocalDateTime() {
        return localDateTime;
    }

    private LocalDateTime localDateTime;

    public Racer(String name, LocalDateTime localDateTime) {
        this.localDateTime = localDateTime;
        this.name = name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Racer racer = (Racer) o;
        if (localDateTime != null && (localDateTime.equals(racer.localDateTime) && name.equals(racer.name))) {
            return true;
        } else if (between != null && (between.equals(racer.between)) && name.equals(racer.name)) {
            return true;
        } else return car.equals(racer.car) && name.equals(racer.name) && nameSurname.equals(racer.nameSurname);
    }

    @Override
    public int hashCode() {
        return Objects.hash(car, nameSurname, name, localDateTime, between);
    }

    @Override
    public int compareTo(Racer racer) {
        return racer.getBetween().compareTo(this.getBetween());
    }
}
