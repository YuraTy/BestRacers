package com.foxminded.racerdao;

import com.foxminded.racer.Racer;


import java.io.*;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.*;
import java.util.stream.Collectors;

public class RacerDao {

    public List<Racer> timeParticipants(String filePath) {
        InputStream propertiesStream = ClassLoader.getSystemClassLoader().getResourceAsStream(filePath);
        String dataPattern = "yyyy-MM-dd_HH:mm:ss.SSS";
        assert propertiesStream != null;
        return new BufferedReader(new InputStreamReader(propertiesStream)).lines()
                .map(p -> new Racer(p.substring(0, 3), LocalDateTime.parse(p.substring(3), DateTimeFormatter.ofPattern(dataPattern))))
                .collect(Collectors.toList());
    }

    public List<Racer> abbreviationParticipants(String filePath) {
        InputStream propertiesStream = ClassLoader.getSystemClassLoader().getResourceAsStream(filePath);
        assert propertiesStream != null;
        return new BufferedReader(new InputStreamReader(propertiesStream)).lines()
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
