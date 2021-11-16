package com.foxminded.racedao;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.time.LocalTime;
import java.util.*;
import java.util.stream.Collectors;

public class RaceDao {

    public Map<String, LocalTime> timeParticipants(String filePath) throws IOException {
        return Files.lines(Paths.get(filePath))
                .collect(Collectors.toMap(p -> p.substring(0, 3), p -> LocalTime.parse(p.substring(14))));
    }

    public Map<String, String> abbreviationParticipants(String filePath) throws IOException {
        return Files.lines(Paths.get(filePath))
                .collect(Collectors.toMap(p -> p.substring(0, 3), p -> p.substring(4)));
    }

}
