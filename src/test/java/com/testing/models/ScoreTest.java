package com.testing.models;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

public class ScoreTest {

    @ParameterizedTest
    @Tag("regression")
    @CsvSource({
        /* correctAnswers , numOfTries */
            "2,5",
            "167,200",
            "12,25",
            "40,50",
            "50,60"
    })//end CsvSource declaration
    void averageCalculator(int correctAnswers, int numOfTries){
        int average = (correctAnswers*100)/numOfTries;
        assertEquals(average, Score.calculateScore(correctAnswers, numOfTries));
    }//end averageCalculator

    @Test
    @Tag("smoke")
    void correctDisplay(){
        assertTrue(Score.showScore(50, 60).equals("Respuestas Correctas: 50\nIntentos en total: 60\nPorcentaje: " + Score.calculateScore(50, 60) + "%\n"));
    }//end correctDisplay
}
