package com.foxminded.bestracers;

import com.foxminded.racedao.RaceDao;

import java.io.IOException;
import java.time.LocalTime;
import java.util.HashMap;
import java.util.Map;

public class BestRacers {
    public static void main(String[] args) throws IOException {
        RaceDao raceDao = new RaceDao();
        Map<String,String > abbreviationMap = new HashMap<>(raceDao.abbreviationParticipants("abbreviations.txt"));
        Map<String, LocalTime> startMap = new HashMap<>(raceDao.timeParticipants("start.log"));
        Map<String,LocalTime > endMap = new HashMap<>(raceDao.timeParticipants("end.log"));

        System.out.println(abbreviationMap);
        System.out.println(startMap);
        System.out.println(endMap);

    }
}
