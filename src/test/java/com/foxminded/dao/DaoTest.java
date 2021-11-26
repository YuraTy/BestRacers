package com.foxminded.dao;

import com.foxminded.racer.Racer;
import org.hamcrest.Matchers;
import org.junit.jupiter.api.Test;

import static org.hamcrest.MatcherAssert.assertThat;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class DaoTest {

    private final Dao dao = new Dao();

    @Test
    void timeParticipantsStart() {
        String fileStartTest = "start.log";
        List<Racer> listTimeExpectations = testListTimeStart();
        List<Racer> actualList = dao.timeParticipants(fileStartTest);
        assertThat(Arrays.asList(actualList), Matchers.containsInAnyOrder(listTimeExpectations));
    }

    @Test
    void timeParticipantsEnd() {
        String fileEndTest = "end.log";
        List<Racer> listTimeExpectations = testListTimeEnd();
        List<Racer> actualList = dao.timeParticipants(fileEndTest);
        assertThat(Arrays.asList(actualList), Matchers.containsInAnyOrder(listTimeExpectations));
    }

    @Test
    void abbreviationParticipants() {
        String fileAbbreviationsTest = "abbreviations.txt";
        List<Racer> abbreviationExpectationList = testListAbbreviation();
        List<Racer> actualList = dao.abbreviationParticipants(fileAbbreviationsTest);
        assertThat(Arrays.asList(actualList), Matchers.containsInAnyOrder(abbreviationExpectationList));
    }

    public List<Racer> testListAbbreviation() {
        List<Racer> abbreviationExpectationsList = new ArrayList<>();
        abbreviationExpectationsList.add(new Racer("DRR", "Daniel Ricciardo", "RED BULL RACING TAG HEUER"));
        abbreviationExpectationsList.add(new Racer("SVF", "Sebastian Vettel", "FERRARI"));
        abbreviationExpectationsList.add(new Racer("LHM", "Lewis Hamilton", "MERCEDES"));
        abbreviationExpectationsList.add(new Racer("KRF", "Kimi Raikkonen", "FERRARI"));
        abbreviationExpectationsList.add(new Racer("VBM", "Valtteri Bottas", "MERCEDES"));
        abbreviationExpectationsList.add(new Racer("EOF", "Esteban Ocon", "FORCE INDIA MERCEDES"));
        abbreviationExpectationsList.add(new Racer("FAM", "Fernando Alonso", "MCLAREN RENAULT"));
        abbreviationExpectationsList.add(new Racer("CSR", "Carlos Sainz", "RENAULT"));
        abbreviationExpectationsList.add(new Racer("SPF", "Sergio Perez", "FORCE INDIA MERCEDES"));
        abbreviationExpectationsList.add(new Racer("PGS", "Pierre Gasly", "SCUDERIA TORO ROSSO HONDA"));
        abbreviationExpectationsList.add(new Racer("NHR", "Nico Hulkenberg", "RENAULT"));
        abbreviationExpectationsList.add(new Racer("SVM", "Stoffel Vandoorne", "MCLAREN RENAULT"));
        abbreviationExpectationsList.add(new Racer("SSW", "Sergey Sirotkin", "WILLIAMS MERCEDES"));
        abbreviationExpectationsList.add(new Racer("CLS", "Charles Leclerc", "SAUBER FERRARI"));
        abbreviationExpectationsList.add(new Racer("RGH", "Romain Grosjean", "HAAS FERRARI"));
        abbreviationExpectationsList.add(new Racer("BHS", "Brendon Hartley", "SCUDERIA TORO ROSSO HONDA"));
        abbreviationExpectationsList.add(new Racer("MES", "Marcus Ericsson", "SAUBER FERRARI"));
        abbreviationExpectationsList.add(new Racer("LSW", "Lance Stroll", "WILLIAMS MERCEDES"));
        abbreviationExpectationsList.add(new Racer("KMH", "Kevin Magnussen", "HAAS FERRARI"));
        return abbreviationExpectationsList;
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