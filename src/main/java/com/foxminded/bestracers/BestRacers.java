package com.foxminded.bestracers;

import com.foxminded.racedao.RaceDao;
import com.foxminded.racer.Racer;
import com.foxminded.raceservises.RaceServises;

public class BestRacers {
    public static void main(String[] args) {
        RaceDao raceDao = new RaceDao();
        RaceServises raceServises = new RaceServises();
        System.out.println(raceServises.timeDifference(new RaceDao().timeParticipants("start.log"), new RaceDao().timeParticipants("end.log") ));
    }
}
