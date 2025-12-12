package com.testing.models;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;
//import com.testing.models.UserInput;

public class RecognizeCharacters {
    private static int correctAnswers = 0;
    private static int numOfTries = 0;
    private static ArrayList<Definition> wordArray = CsvReader.getWordList();

    public static void recognizeOneCharacter(Scanner scan){
        int randomNum = (int)(Math.random() * CsvReader.getWordList().size()); // creamos un numero random entre 0 y el tamaño de nuestra lista de palabras
        
        System.err.println("Cual es este carácter? " + wordArray.get(randomNum).getCharacter());
        if ((wordArray.get(randomNum).getDefinition()).contains(UserInput.getUserInput(scan))) {
            System.err.println("Respuesta Correcta!");
            correctAnswers += 1;
            numOfTries += 1;
        }else{
            System.err.println("Respuesta incorrecta :(");
            numOfTries += 1;
        }//end if-else
    }//end recognizeOneCharacters

    public static void recognizeAllCharacter(Scanner scan){
        Collections.shuffle(wordArray);//cambiamos el orden del array, el único motivo por el cual cambio el orden del array que los dos métodos usan es sencillo, el otro método también accede de forma aleatoria a este array, de forma que cambiando los index no genera ningún problema
        for (Definition definition : wordArray) {
            System.err.println("Cual es este carácter? " + definition.getCharacter());
            if ((definition.getDefinition()).contains(UserInput.getUserInput(scan))) {
                System.err.println("Respuesta Correcta!");
                correctAnswers += 1;
                numOfTries += 1;
                System.err.println(correctAnswers + ", " + numOfTries);
            }else{
                System.err.println("Respuesta incorrecta :(");
                numOfTries += 1;
            }//end if-else
        }//end for - each
    }//end recognizeAllCharacters


    /**
     * @param correctAnswers
     */
    public static int getCorrectAnswers(){
        return correctAnswers;
    }

    /**
     * @param numOfTries
     */
    public static int numOfTries(){
        return numOfTries;
    }
}//end RecognizeCharacters
