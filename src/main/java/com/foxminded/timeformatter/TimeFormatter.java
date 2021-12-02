package com.foxminded.timeformatter;

import com.foxminded.racerservice.RacerService;
import org.apache.commons.lang3.time.DurationFormatUtils;

import java.time.Duration;
import java.util.stream.Collectors;

public class TimeFormatter {

    private final RacerService racerService = new RacerService();
    private static int numberRacer = 0;

    public String resultOutput() {
        return racerService.bestCircle().stream()
                .peek(p -> numberRacer += 1)
                .map(p -> String.format("%-3d%-18s|%-26s|%s%s", numberRacer, p.getNameSurname(), p.getCar(), timeFormatting(p.getTravelTime()), delimiterTop15(numberRacer)))
                .collect(Collectors.joining("\n"));
    }

    private String delimiterTop15(int numberRacer) {
        if (numberRacer == 15) {
            return "\n" + "---------------------------------------------------------";
        } else return "";
    }

    private String timeFormatting(Duration travelTime) {
        return DurationFormatUtils.formatDuration(travelTime.toMillis(), "m:ss.SSS");
    }
}
