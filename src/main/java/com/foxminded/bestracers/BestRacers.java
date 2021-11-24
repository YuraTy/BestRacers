package com.foxminded.bestracers;

import com.foxminded.racedao.RaceDao;
import com.foxminded.racer.Racer;
import com.foxminded.raceservises.RaceServises;

import java.util.List;

public class BestRacers {
    public static void main(String[] args) {
        RaceDao raceDao = new RaceDao();
        RaceServises raceServises = new RaceServises();
        List<Racer> test =  (raceServises.bestCircle(new RaceDao().timeParticipants("start.log"), new RaceDao().timeParticipants("end.log") ));

        List <Racer> startList = raceDao.timeParticipants("end.log");
//        for (Racer racer : startList){
//            System.out.println("listEndTest.add(new Racer(\"" + racer.getName() +'\"' +",LocalDateTime.parse(\""+racer.getLocalDateTime() + "\")));");
//        }
    }
}
