package com.foxminded.racedao;

import com.foxminded.racer.Racer;


import java.io.*;
import java.time.LocalTime;
import java.util.*;
import java.util.stream.Collectors;

public class RaceDao {

    public List<Racer> timeParticipants(String filePath){
        InputStream propertiesStream = ClassLoader.getSystemClassLoader().getResourceAsStream(filePath);
        assert propertiesStream != null;
        return new BufferedReader(new InputStreamReader(propertiesStream)).lines()
                .map(p -> new Racer(p.substring(0, 3), LocalTime.parse(p.substring(14))))
                .collect(Collectors.toList());
    }

    public List<Racer> abbreviationParticipants(String filePath){
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
