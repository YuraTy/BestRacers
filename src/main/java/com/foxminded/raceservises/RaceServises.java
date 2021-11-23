package com.foxminded.raceservises;

import com.foxminded.racer.Racer;

import java.time.Duration;
import java.time.LocalTime;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class RaceServises {


    public List<Racer> timeDifference (List<Racer> start , List<Racer> end) {
        return end.stream()
        .map(p -> new Racer(p.getName() ,sortedRacer(Duration.between((p.getLocalTime()),searchObject(start, p.getName()).get()).toString())))
                .collect(Collectors.toList());

    }

    private Optional<LocalTime> searchObject (List<Racer> search , String name ) {
        return search.stream()
                .filter(p -> p.getName().equals(name))
                .map(p -> p.getLocalTime())
                .findFirst();
    }

    public String sortedRacer ( String   between) {
        String [] array = between.replace("PT-" , "").replace("M-",":").replace("S","").split("");
        return String.join("",array);
    }

}
