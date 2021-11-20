package com.foxminded.bestracers;

import com.foxminded.racedao.RaceDao;
import com.foxminded.racer.Racer;

import java.util.ArrayList;
import java.util.List;

public class BestRacers {
    public static void main(String[] args) {
        RaceDao raceDao = new RaceDao();
        List<Racer> abbreviationMap = new ArrayList<>(raceDao.timeParticipants("start.log"));
        System.out.println(abbreviationMap);
    }
}
