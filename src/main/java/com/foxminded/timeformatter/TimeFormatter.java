package com.foxminded.timeformatter;

import com.foxminded.racerdao.RacerDao;
import com.foxminded.racerservice.RacerService;
import org.apache.commons.lang3.time.DurationFormatUtils;

import java.time.Duration;
import java.util.Optional;
import java.util.StringJoiner;
import java.util.stream.Collectors;

public class TimeFormatter {

    private final RacerService racerService = new RacerService();
    private static int numberRacer = 0;

    public String resultOutput() {
        return racerService.bestCircle().stream()
                .map(p -> String.format("%-1s%s%s", searchObject(p.getName()).get(), timeFormatting(p.getTravelTime()),delimiterTop15(numberRacer)))
                .collect(Collectors.joining("\n"));
    }

    private Optional<String> searchObject(String name) {
        numberRacer += 1;
        return racerService.bestCircle().stream()
                .filter(p -> p.getName().equals(name))
                .map(p -> String.format("%-3d%-18s|%-26s|", numberRacer, p.getNameSurname(), p.getCar()))
                .findFirst();
    }

    private String delimiterTop15 (int numberRacer){
        if (numberRacer == 15){
            return "\n" + "---------------------------------------------------------";
        }
        else return "";
    }

    private String timeFormatting(Duration travelTime) {
        return DurationFormatUtils.formatDuration(travelTime.toMillis(), "m:ss.SSS");
    }
}
