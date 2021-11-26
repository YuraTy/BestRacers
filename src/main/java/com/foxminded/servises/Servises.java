package com.foxminded.servises;

import com.foxminded.dao.Dao;
import com.foxminded.racer.Racer;

import java.time.Duration;
import java.time.LocalDateTime;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class Servises extends Dao {

    public List<Racer> bestCircle() {
        List<Racer> start = timeParticipants("start.log");
        List<Racer> end = timeParticipants("end.log");
        return end.stream()
                .peek(p -> p.setTravelTime(Duration.between(p.getLocalDateTime(), searchObject(start, p.getName()).get())))
                .sorted()
                .collect(Collectors.toList());
    }

    public Optional<LocalDateTime> searchObject(List<Racer> search, String name) {
        return search.stream()
                .filter(p -> p.getName().equals(name))
                .map(p -> p.getLocalDateTime())
                .findFirst();
    }
}
