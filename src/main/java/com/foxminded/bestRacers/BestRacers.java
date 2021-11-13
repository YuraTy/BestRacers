package com.foxminded.bestRacers;

import com.foxminded.readingData.ReadingData;

import java.io.IOException;
import java.time.LocalTime;
import java.util.HashMap;
import java.util.Map;

public class BestRacers {
    public static void main(String[] args) throws IOException {
        ReadingData readingData = new ReadingData();
        Map<String,String > abbreviationMap = new HashMap<>(readingData.abbreviationParticipants("abbreviations.txt"));
        Map<String, LocalTime> startMap = new HashMap<>(readingData.timeParticipants("start.log"));
        Map<String,LocalTime > endMap = new HashMap<>(readingData.timeParticipants("end.log"));

        for (Map.Entry m :startMap.entrySet()){
            System.out.println("mapTime.put("+ '"' + m.getKey()+ '"' +"," + '"' + m.getValue()+ '"' +");");
        }

        //System.out.println(endMap);

    }
}
