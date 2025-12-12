package com.testing.models;

public class Score {
     
    public static void showScore(){
        int totalCorrectAnswers = RecognizeCharacters.getCorrectAnswers();
        int totalTries = RecognizeCharacters.numOfTries();
        int percent = (totalCorrectAnswers*100)/totalTries;
        try {
            System.err.printf("Respuestas Correctas: %d\nIntentos en total: %d\nPorcentaje: %d\n", totalCorrectAnswers, totalTries, percent);
        } catch (ArithmeticException e){
            System.err.println("Aun no has hecho ningún ejercicio");
        }catch (Exception e) {
            System.err.println("Ocurrió un error inesperado");
        }
        
    }
}
