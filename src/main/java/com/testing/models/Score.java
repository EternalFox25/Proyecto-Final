package com.testing.models;

public class Score {
    
    public static int calculateScore(int correctAnswers, int numOfTries){
        int percent;
        if (correctAnswers>numOfTries) {
            return 500;
        }if (numOfTries == 0) {
            return 403;
        }//end if statements
        percent = (correctAnswers*100)/numOfTries;
        return percent;
    }//end calculateScore


    public static String showScore(int correctAnswers, int numOfTries){
        int average = Score.calculateScore(correctAnswers, numOfTries);
        String output;
        if (average == 500) {
            output = "No puedes tener mas respuestas correctas que intentos";
            return output;
        }if (average == 403) {
            output = "Aun no has hecho ningún ejercicio";
            return output;
        }//end if statements
        output = "Respuestas Correctas: " + correctAnswers +"\nIntentos en total: " + numOfTries + "\nPorcentaje: " + average + "%\n";
        return output;
    }//end showScore
    
}
