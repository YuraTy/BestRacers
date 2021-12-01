package com.foxminded.timeformatter;

import com.foxminded.racer.Racer;
import com.foxminded.racerservice.RacerService;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;

@ExtendWith(MockitoExtension.class)
class TimeFormatterTest {

    @Mock
    private RacerService racerService;

    @InjectMocks
    private TimeFormatter timeFormatter;


    private static final String EXPECTED_STING =
            "1  Sebastian Vettel  |FERRARI                   |1:04.415\n" +
            "2  Daniel Ricciardo  |RED BULL RACING TAG HEUER |1:12.013\n" +
            "3  Valtteri Bottas   |MERCEDES                  |1:12.434\n" +
            "4  Lewis Hamilton    |MERCEDES                  |1:12.460\n" +
            "5  Stoffel Vandoorne |MCLAREN RENAULT           |1:12.463\n" +
            "6  Kimi Raikkonen    |FERRARI                   |1:12.639\n" +
            "7  Fernando Alonso   |MCLAREN RENAULT           |1:12.657\n" +
            "8  Sergey Sirotkin   |WILLIAMS MERCEDES         |1:12.706\n" +
            "9  Charles Leclerc   |SAUBER FERRARI            |1:12.829\n" +
            "10 Sergio Perez      |FORCE INDIA MERCEDES      |1:12.848\n" +
            "11 Romain Grosjean   |HAAS FERRARI              |1:12.930\n" +
            "12 Pierre Gasly      |SCUDERIA TORO ROSSO HONDA |1:12.941\n" +
            "13 Carlos Sainz      |RENAULT                   |1:12.950\n" +
            "14 Esteban Ocon      |FORCE INDIA MERCEDES      |1:13.028\n" +
            "15 Nico Hulkenberg   |RENAULT                   |1:13.065\n" +
            "---------------------------------------------------------\n" +
            "16 Brendon Hartley   |SCUDERIA TORO ROSSO HONDA |1:13.179\n" +
            "17 Marcus Ericsson   |SAUBER FERRARI            |1:13.265\n" +
            "18 Lance Stroll      |WILLIAMS MERCEDES         |1:13.323\n" +
            "19 Kevin Magnussen   |HAAS FERRARI              |1:13.393" ;


    @Test
    void resultOutput() {
        Mockito.lenient().when(racerService.bestCircle()).thenReturn(expectedListTest());
        String actual = timeFormatter.resultOutput();
        Assertions.assertEquals(EXPECTED_STING,actual);

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
}