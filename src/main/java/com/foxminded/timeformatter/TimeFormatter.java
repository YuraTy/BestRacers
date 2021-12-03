package com.foxminded.timeformatter;

import com.foxminded.racer.Racer;
import com.foxminded.racerservice.RacerService;
import org.apache.commons.lang3.time.DurationFormatUtils;


import java.time.Duration;
import java.util.List;
import java.util.stream.Collectors;

public class TimeFormatter {

    private final RacerService racerService = new RacerService();
    private static int numberRacer = 0;

    public String resultOutput() {
        return racerService.bestCircle().stream()
                .peek(p -> numberRacer ++)
                .map(p -> String.format("%-3d%-18s|%-26s|%s%s", numberRacer, p.getNameSurname(), p.getCar(), timeFormatting(p.getTravelTime()), delimiterTop15(numberRacer)))
                .collect(Collectors.joining("\n"));
    }

    private  String delimiterTop15(int numberRacer) {
        String delimiter = "-";
        if (numberRacer == 15) {
            return "\n" + delimiter.repeat(max());
        } else return "";
    }

    private String timeFormatting(Duration travelTime) {
        return DurationFormatUtils.formatDuration(travelTime.toMillis(), "m:ss.SSS");
    }

    private int max () {
        List<Racer> racerList = racerService.bestCircle();
        assert racerList != null;
        return racerList.stream()
                .map(p-> (String.format("%-3d%-18s|%-26s|%s", numberRacer, p.getNameSurname(), p.getCar(), timeFormatting(p.getTravelTime()))).split("").length)
                .max(Integer::compare)
                .get();
    }
}
