package com.foxminded.readingData;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.io.IOException;
import java.time.LocalTime;
import java.util.HashMap;
import java.util.Map;


class ReadingDataTest {
    private ReadingData readingData = new ReadingData();


    @Test
    void timeParticipants() {
    }

    @Test
    void abbreviationParticipants() throws IOException {
        Map<String, String> abbreviationExpectationsMap =abbreviation();
        Map<String, String> actualMap = readingData.abbreviationParticipants("abbreviations.txt");
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
        abbreviationExpectationsMap.put("SVM","Stoffel Vandoorne_MCLAREN RENAULT");
        abbreviationExpectationsMap.put("CLS","Charles Leclerc_SAUBER FERRARI");
        abbreviationExpectationsMap.put("BHS","Brendon Hartley_SCUDERIA TORO ROSSO HONDA");
        abbreviationExpectationsMap.put("LHM","Lewis Hamilton_MERCEDES");
        abbreviationExpectationsMap.put("LSW","Lance Stroll_WILLIAMS MERCEDES");
        abbreviationExpectationsMap.put("RGH","Romain Grosjean_HAAS FERRARI");
        abbreviationExpectationsMap.put("FAM","Fernando Alonso_MCLAREN RENAULT");
        abbreviationExpectationsMap.put("SSW","Sergey Sirotkin_WILLIAMS MERCEDES");
        abbreviationExpectationsMap.put("NHR","Nico Hulkenberg_RENAULT");
        abbreviationExpectationsMap.put("MES","Marcus Ericsson_SAUBER FERRARI");
        abbreviationExpectationsMap.put("EOF","Esteban Ocon_FORCE INDIA MERCEDES");
        abbreviationExpectationsMap.put("PGS","Pierre Gasly_SCUDERIA TORO ROSSO HONDA");
        abbreviationExpectationsMap.put("KRF","Kimi Raikkonen_FERRARI");
        return abbreviationExpectationsMap;
    }

    public Map<String, LocalTime> testMapTime (){
        Map<String, LocalTime> mapTime = new HashMap<>();
        mapTime.put("VBM","12:00");
        mapTime.put("SVF","12:02:58.917");
        mapTime.put("CSR","12:03:15.145");
        mapTime.put("DRR","12:14:12.054");
        mapTime.put("KMH","12:02:51.003");
        mapTime.put("SPF","12:12:01.035");
        mapTime.put("SVM","12:18:37.735");
        mapTime.put("CLS","12:09:41.921");
        mapTime.put("BHS","12:14:51.985");
        mapTime.put("LHM","12:18:20.125");
        mapTime.put("LSW","12:06:13.511");
        mapTime.put("RGH","12:05:14.511");
        mapTime.put("FAM","12:13:04.512");
        mapTime.put("SSW","12:16:11.648");
        mapTime.put("NHR","12:02:49.914");
        mapTime.put("MES","12:04:45.513");
        mapTime.put("EOF","12:17:58.810");
        mapTime.put("PGS","12:07:23.645");
        mapTime.put("KRF","12:03:01.250");
        return mapTime;
    }


}