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
        List<Racer> racerList = racerService.bestCircle();
        int maxTeamLength = calculateMaxTeamLength(racerList);
        int maxRacerLength = calculateMaxRacerLength(racerList);

        return racerList.stream()
                .peek(p -> numberRacer ++)
                .map(p -> formatItem(p,numberRacer,maxTeamLength,maxRacerLength))
                .collect(Collectors.joining("\n"));
    }

    private String timeFormatting(Duration travelTime) {
        return DurationFormatUtils.formatDuration(travelTime.toMillis(), "m:ss.SSS");
    }

    private int calculateMaxRacerLength (List<Racer> racerList) {
        return racerList.stream()
                .map(p-> Integer.toString(numberRacer).length() +p.getNameSurname().length() + timeFormatting(p.getTravelTime()).length() )
                .max(Integer::compare)
                .get();
    }

    private int calculateMaxTeamLength (List<Racer> racerList) {
        return racerList.stream()
                .map(p-> p.getTeam().length() )
                .max(Integer::compare)
                .get();
    }

    private String formatItem (Racer racer , int numberRacer , int maxTeamLength , int maxRacerLength) {
        String delimiter = "-";
        if (numberRacer == 15) {
            return   String.format("%-2d.%-17s|%-25s|%s%s", numberRacer, racer.getNameSurname(), racer.getTeam(), timeFormatting(racer.getTravelTime()),"\n"+ delimiter.repeat(maxRacerLength + maxTeamLength + 4));
        } else return String.format("%-2d.%-17s|%-25s|%s", numberRacer, racer.getNameSurname(), racer.getTeam(), timeFormatting(racer.getTravelTime()));
    }
}
