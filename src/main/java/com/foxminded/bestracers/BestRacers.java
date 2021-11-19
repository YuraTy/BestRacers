package com.foxminded.bestracers;

import com.foxminded.racedao.RaceDao;
import com.foxminded.racer.Racer;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class BestRacers {
    public static void main(String[] args) throws IOException {
        RaceDao raceDao = new RaceDao();
        List<Racer> abbreviationMap = new ArrayList<>(raceDao.abbreviationParticipants("resources/abbreviations.txt"));
    }
}
