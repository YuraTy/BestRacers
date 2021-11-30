package com.foxminded.resultrrival;

import com.foxminded.racerdao.RacerDao;
import com.foxminded.racerservice.RacerService;
import org.apache.commons.lang3.time.DurationFormatUtils;

import java.time.Duration;
import java.util.Optional;
import java.util.stream.Collectors;

public class ResultArrival {

    private final RacerService racerService = new RacerService();
    private final RacerDao racerDao = new RacerDao();
    private static int numberRacer = 0;

    public String resultOutput() {
        return racerService.bestCircle().stream()
                .map(p -> String.format("%-1s%s", searchObject(p.getName()).get(), timeFormatting(p.getTravelTime())))
                .limit(17)
                .collect(Collectors.joining("\n"));
    }

    private Optional<String> searchObject(String name) {
        numberRacer += 1;
        return racerDao.abbreviationParticipants("abbreviations.txt").stream()
                .filter(p -> p.getName().equals(name))
                .map(p -> String.format("%-3d%-18s|%-26s|", numberRacer, p.getNameSurname(), p.getCar()))
                .findFirst();
    }

    private String timeFormatting(Duration travelTime) {
        return DurationFormatUtils.formatDuration(travelTime.toMillis(), "m:ss.SSS");
    }
}
