package com.foxminded.raceservises;

import com.foxminded.racer.Racer;
import org.junit.jupiter.api.Test;
import org.hamcrest.Matchers;

import java.time.Duration;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.hamcrest.MatcherAssert.assertThat;

class RaceServisesTest {

    private final RaceServises raceServises = new RaceServises();

    @Test
    void timeDifference() {
        List<Racer> expectedList = expectedListTest();
        List<Racer> actualList = raceServises.bestCircle(testListTimeStart(), testListTimeEnd());
        assertThat(Arrays.asList(actualList), Matchers.containsInAnyOrder(expectedList));
    }

    private List<Racer> expectedListTest() {
        List<Racer> listTest = new ArrayList<>();
        listTest.add(new Racer("SVF", Duration.parse("PT-1M-4.415S")));
        listTest.add(new Racer("DRR", Duration.parse("PT-1M-12.013S")));
        listTest.add(new Racer("VBM", Duration.parse("PT-1M-12.434S")));
        listTest.add(new Racer("LHM", Duration.parse("PT-1M-12.46S")));
        listTest.add(new Racer("SVM", Duration.parse("PT-1M-12.463S")));
        listTest.add(new Racer("KRF", Duration.parse("PT-1M-12.639S")));
        listTest.add(new Racer("FAM", Duration.parse("PT-1M-12.657S")));
        listTest.add(new Racer("SSW", Duration.parse("PT-1M-12.706S")));
        listTest.add(new Racer("CLS", Duration.parse("PT-1M-12.829S")));
        listTest.add(new Racer("SPF", Duration.parse("PT-1M-12.848S")));
        listTest.add(new Racer("RGH", Duration.parse("PT-1M-12.93S")));
        listTest.add(new Racer("PGS", Duration.parse("PT-1M-12.941S")));
        listTest.add(new Racer("CSR", Duration.parse("PT-1M-12.95S")));
        listTest.add(new Racer("EOF", Duration.parse("PT-1M-13.028S")));
        listTest.add(new Racer("NHR", Duration.parse("PT-1M-13.065S")));
        listTest.add(new Racer("BHS", Duration.parse("PT-1M-13.179S")));
        listTest.add(new Racer("MES", Duration.parse("PT-1M-13.265S")));
        listTest.add(new Racer("LSW", Duration.parse("PT-1M-13.323S")));
        listTest.add(new Racer("KMH", Duration.parse("PT-1M-13.393S")));
        return listTest;
    }

    public List<Racer> testListTimeStart() {
        List<Racer> listStartTest = new ArrayList<>();
        listStartTest.add(new Racer("SVF", LocalDateTime.parse("2018-05-24T12:02:58.917")));
        listStartTest.add(new Racer("NHR", LocalDateTime.parse("2018-05-24T12:02:49.914")));
        listStartTest.add(new Racer("FAM", LocalDateTime.parse("2018-05-24T12:13:04.512")));
        listStartTest.add(new Racer("KRF", LocalDateTime.parse("2018-05-24T12:03:01.250")));
        listStartTest.add(new Racer("SVM", LocalDateTime.parse("2018-05-24T12:18:37.735")));
        listStartTest.add(new Racer("MES", LocalDateTime.parse("2018-05-24T12:04:45.513")));
        listStartTest.add(new Racer("LSW", LocalDateTime.parse("2018-05-24T12:06:13.511")));
        listStartTest.add(new Racer("BHS", LocalDateTime.parse("2018-05-24T12:14:51.985")));
        listStartTest.add(new Racer("EOF", LocalDateTime.parse("2018-05-24T12:17:58.810")));
        listStartTest.add(new Racer("RGH", LocalDateTime.parse("2018-05-24T12:05:14.511")));
        listStartTest.add(new Racer("SSW", LocalDateTime.parse("2018-05-24T12:16:11.648")));
        listStartTest.add(new Racer("KMH", LocalDateTime.parse("2018-05-24T12:02:51.003")));
        listStartTest.add(new Racer("PGS", LocalDateTime.parse("2018-05-24T12:07:23.645")));
        listStartTest.add(new Racer("CSR", LocalDateTime.parse("2018-05-24T12:03:15.145")));
        listStartTest.add(new Racer("SPF", LocalDateTime.parse("2018-05-24T12:12:01.035")));
        listStartTest.add(new Racer("DRR", LocalDateTime.parse("2018-05-24T12:14:12.054")));
        listStartTest.add(new Racer("LHM", LocalDateTime.parse("2018-05-24T12:18:20.125")));
        listStartTest.add(new Racer("CLS", LocalDateTime.parse("2018-05-24T12:09:41.921")));
        listStartTest.add(new Racer("VBM", LocalDateTime.parse("2018-05-24T12:00")));
        return listStartTest;
    }

    public List<Racer> testListTimeEnd() {
        List<Racer> listEndTest = new ArrayList<>();
        listEndTest.add(new Racer("MES", LocalDateTime.parse("2018-05-24T12:05:58.778")));
        listEndTest.add(new Racer("RGH", LocalDateTime.parse("2018-05-24T12:06:27.441")));
        listEndTest.add(new Racer("SPF", LocalDateTime.parse("2018-05-24T12:13:13.883")));
        listEndTest.add(new Racer("LSW", LocalDateTime.parse("2018-05-24T12:07:26.834")));
        listEndTest.add(new Racer("DRR", LocalDateTime.parse("2018-05-24T12:15:24.067")));
        listEndTest.add(new Racer("NHR", LocalDateTime.parse("2018-05-24T12:04:02.979")));
        listEndTest.add(new Racer("CSR", LocalDateTime.parse("2018-05-24T12:04:28.095")));
        listEndTest.add(new Racer("KMH", LocalDateTime.parse("2018-05-24T12:04:04.396")));
        listEndTest.add(new Racer("BHS", LocalDateTime.parse("2018-05-24T12:16:05.164")));
        listEndTest.add(new Racer("SVM", LocalDateTime.parse("2018-05-24T12:19:50.198")));
        listEndTest.add(new Racer("KRF", LocalDateTime.parse("2018-05-24T12:04:13.889")));
        listEndTest.add(new Racer("VBM", LocalDateTime.parse("2018-05-24T12:01:12.434")));
        listEndTest.add(new Racer("SVF", LocalDateTime.parse("2018-05-24T12:04:03.332")));
        listEndTest.add(new Racer("EOF", LocalDateTime.parse("2018-05-24T12:19:11.838")));
        listEndTest.add(new Racer("PGS", LocalDateTime.parse("2018-05-24T12:08:36.586")));
        listEndTest.add(new Racer("SSW", LocalDateTime.parse("2018-05-24T12:17:24.354")));
        listEndTest.add(new Racer("FAM", LocalDateTime.parse("2018-05-24T12:14:17.169")));
        listEndTest.add(new Racer("CLS", LocalDateTime.parse("2018-05-24T12:10:54.750")));
        listEndTest.add(new Racer("LHM", LocalDateTime.parse("2018-05-24T12:19:32.585")));
        return listEndTest;
    }
}