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

    public void setTravelTime(Duration travelTime) {
        this.travelTime = travelTime;
    }

    public Duration getTravelTime() {
        return travelTime;
    }

    private Duration travelTime;

    public Racer(String name, Duration travelTime) {
        this.travelTime = travelTime;
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
        } else if (travelTime != null && (travelTime.equals(racer.travelTime)) && name.equals(racer.name)) {
            return true;
        } else return car.equals(racer.car) && name.equals(racer.name) && nameSurname.equals(racer.nameSurname);
    }

    @Override
    public int hashCode() {
        return Objects.hash(car, nameSurname, name, localDateTime, travelTime);
    }

    @Override
    public int compareTo(Racer racer) {
        return this.getTravelTime().compareTo(racer.getTravelTime());
    }
}
