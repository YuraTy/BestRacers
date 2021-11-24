package com.foxminded.raceservises;

import com.foxminded.racer.Racer;

import java.time.Duration;
import java.time.LocalDateTime;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class RaceServises {
    public List<Racer> bestCircle(List<Racer> start, List<Racer> end) {
        return end.stream()
                .map(p -> new Racer(p.getName(), Duration.between((p.getLocalDateTime()), searchObject(start, p.getName()).get())))
                .sorted()
                .collect(Collectors.toList());
    }

    private Optional<LocalDateTime> searchObject(List<Racer> search, String name) {
        return search.stream()
                .filter(p -> p.getName().equals(name))
                .map(p -> p.getLocalDateTime())
                .findFirst();
    }

}
