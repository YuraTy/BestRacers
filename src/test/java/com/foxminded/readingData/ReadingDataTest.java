package com.foxminded.readingData;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.io.IOException;
import java.time.LocalTime;
import java.util.HashMap;
import java.util.Map;


class ReadingDataTest {
    private final ReadingData readingData = new ReadingData();


    @Test
    void timeParticipantsStart() throws IOException {
        Map<String, LocalTime> mapTimeExpectations = testMapTimeStart();
        String fileStart = "start.log";
        Map<String, LocalTime> actualMap = readingData.timeParticipants(fileStart);
        Assertions.assertEquals(mapTimeExpectations,actualMap);
    }

    @Test
    void timeParticipantsEnd() throws IOException {
        Map<String, LocalTime> mapTimeExpectations = testMapTimeEnd();
        String fileEnd = "end.log";
        Map<String, LocalTime> actualMap = readingData.timeParticipants(fileEnd);
        Assertions.assertEquals(mapTimeExpectations,actualMap);
    }

    @Test
    void abbreviationParticipants() throws IOException {
        Map<String, String> abbreviationExpectationsMap = abbreviation();
        String fileAbbreviations = "abbreviations.txt";
        Map<String, String> actualMap = readingData.abbreviationParticipants(fileAbbreviations);
        Assertions.assertEquals(abbreviationExpectationsMap,actualMap);
    }

    public Map<String, String> abbreviation() {
        Map<String, String> abbreviationExpectationsMap = new HashMap<>();
        abbreviationExpectationsMap.put("VBM","Valtteri Bottas_MERCEDES");
        abbreviationExpectationsMap.put("SVF","Sebastian Vettel_FERRARI");
        abbreviationExpectationsMap.put("CSR","Carlos Sainz_RENAULT");
        abbreviationExpectationsMap.put("DRR","Daniel Ricciardo_RED BULL RACING TAG HEUER");
        abbreviationExpectationsMap.put("KMH","Kevin Magnussen_HAAS FERRARI");
        abbreviationExpectationsMap.put("SPF","Sergio Perez_FORCE INDIA MERCEDES");
        abbreviationExpectationsMap.put("SVM","Stparsefel Vandoorne_MCLAREN RENAULT");
        abbreviationExpectationsMap.put("CLS","Charles Leclerc_SAUBER FERRARI");
        abbreviationExpectationsMap.put("BHS","Brendon Hartley_SCUDERIA TORO ROSSO HONDA");
        abbreviationExpectationsMap.put("LHM","Lewis Hamilton_MERCEDES");
        abbreviationExpectationsMap.put("LSW","Lance Stroll_WILLIAMS MERCEDES");
        abbreviationExpectationsMap.put("RGH","Romain Grosjean_HAAS FERRARI");
        abbreviationExpectationsMap.put("FAM","Fernando Alonso_MCLAREN RENAULT");
        abbreviationExpectationsMap.put("SSW","Sergey Sirotkin_WILLIAMS MERCEDES");
        abbreviationExpectationsMap.put("NHR","Nico Hulkenberg_RENAULT");
        abbreviationExpectationsMap.put("MES","Marcus Ericsson_SAUBER FERRARI");
        abbreviationExpectationsMap.put("Eparse","Esteban Ocon_FORCE INDIA MERCEDES");
        abbreviationExpectationsMap.put("PGS","Pierre Gasly_SCUDERIA TORO ROSSO HONDA");
        abbreviationExpectationsMap.put("KRF","Kimi Raikkonen_FERRARI");
        return abbreviationExpectationsMap;
    }

    public Map<String, LocalTime> testMapTimeStart (){
        Map<String, LocalTime> mapTime = new HashMap<>();
        mapTime.put("VBM",LocalTime.parse("12:00"));
        mapTime.put("SVF",LocalTime.parse("12:02:58.917"));
        mapTime.put("CSR",LocalTime.parse("12:03:15.145"));
        mapTime.put("DRR",LocalTime.parse("12:14:12.054"));
        mapTime.put("KMH",LocalTime.parse("12:02:51.003"));
        mapTime.put("SPF",LocalTime.parse("12:12:01.035"));
        mapTime.put("SVM",LocalTime.parse("12:18:37.735"));
        mapTime.put("CLS",LocalTime.parse("12:09:41.921"));
        mapTime.put("BHS",LocalTime.parse("12:14:51.985"));
        mapTime.put("LHM",LocalTime.parse("12:18:20.125"));
        mapTime.put("LSW",LocalTime.parse("12:06:13.511"));
        mapTime.put("RGH",LocalTime.parse("12:05:14.511"));
        mapTime.put("FAM",LocalTime.parse("12:13:04.512"));
        mapTime.put("SSW",LocalTime.parse("12:16:11.648"));
        mapTime.put("NHR",LocalTime.parse("12:02:49.914"));
        mapTime.put("MES",LocalTime.parse("12:04:45.513"));
        mapTime.put("EOF",LocalTime.parse("12:17:58.810"));
        mapTime.put("PGS",LocalTime.parse("12:07:23.645"));
        mapTime.put("KRF",LocalTime.parse("12:03:01.250"));
        return mapTime;
    }

    public Map<String, LocalTime> testMapTimeEnd (){
        Map<String, LocalTime> mapTime = new HashMap<>();
        mapTime.put("VBM",LocalTime.parse("12:01:12.434"));
        mapTime.put("SVF",LocalTime.parse("12:04:03.332"));
        mapTime.put("CSR",LocalTime.parse("12:04:28.095"));
        mapTime.put("DRR",LocalTime.parse("12:15:24.067"));
        mapTime.put("KMH",LocalTime.parse("12:04:04.396"));
        mapTime.put("SPF",LocalTime.parse("12:13:13.883"));
        mapTime.put("SVM",LocalTime.parse("12:19:50.198"));
        mapTime.put("CLS",LocalTime.parse("12:10:54.750"));
        mapTime.put("BHS",LocalTime.parse("12:16:05.164"));
        mapTime.put("LHM",LocalTime.parse("12:19:32.585"));
        mapTime.put("LSW",LocalTime.parse("12:07:26.834"));
        mapTime.put("RGH",LocalTime.parse("12:06:27.441"));
        mapTime.put("FAM",LocalTime.parse("12:14:17.169"));
        mapTime.put("SSW",LocalTime.parse("12:17:24.354"));
        mapTime.put("NHR",LocalTime.parse("12:04:02.979"));
        mapTime.put("MES",LocalTime.parse("12:05:58.778"));
        mapTime.put("EOF",LocalTime.parse("12:19:11.838"));
        mapTime.put("PGS",LocalTime.parse("12:08:36.586"));
        mapTime.put("KRF",LocalTime.parse("12:04:13.889"));
        return mapTime;
    }


}