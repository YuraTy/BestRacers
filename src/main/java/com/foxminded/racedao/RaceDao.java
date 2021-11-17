package com.foxminded.racedao;

import com.foxminded.racer.Racer;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.time.LocalTime;
import java.util.*;
import java.util.stream.Collectors;

public class RaceDao {

    public List<Racer> timeParticipants(String filePath) throws IOException {
        return Files.lines(Paths.get(filePath))
                .map(p -> new Racer(p.substring(0, 3), LocalTime.parse(p.substring(14))))
                .collect(Collectors.toList());
    }

    public List<Racer> abbreviationParticipants(String filePath) throws IOException {
        return Files.lines(Paths.get(filePath))
                .map(p -> new Racer(p.substring(0, 3), lineSeparator(p, 1), lineSeparator(p, 2)))
                .collect(Collectors.toList());
    }

    private String lineSeparator(String string, int wordNumber) {
        try {
            String[] stringArray = string.split("_");
            return stringArray[wordNumber];
        } catch (ArrayIndexOutOfBoundsException e) {
            System.err.println("Outside");
            e.getMessage();
        }
        return "Outside";
    }
}
