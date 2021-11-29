package com.foxminded.racerservice;

import com.foxminded.racerdao.RacerDao;
import com.foxminded.racer.Racer;

import java.time.Duration;
import java.time.LocalDateTime;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class RacerService {

    private final RacerDao racerDao = new RacerDao();

    public List<Racer> bestCircle() {
        List<Racer> start = racerDao.timeParticipants("start.log");
        List<Racer> end = racerDao.timeParticipants("end.log");
        return end.stream()
                .peek(p -> p.setTravelTime(Duration.between(p.getLocalDateTime(), searchObject(start, p.getName()).get())))
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
