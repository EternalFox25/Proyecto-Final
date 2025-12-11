package com.testing.models;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;
//import com.testing.models.UserInput;

public class RecognizeCharacters {
    static int correctAnswers = 0;
    static int numOfTries = 0;
    static ArrayList<Definition> wordArray = CsvReader.getWordList();

    public static void recognizeOneCharacter(Scanner scan){
        int randomNum = (int)(Math.random() * CsvReader.getWordList().size()); // creamos un numero random entre 0 y el tamaño de nuestra lista de palabras
        
        System.err.println("Cual es este carácter? " + wordArray.get(randomNum).getCharacter());
        if (UserInput.getUserInput(scan).equals(wordArray.get(randomNum).getDefinition())) {
            System.err.println("Respuesta Correcta!");
            correctAnswers =+ 1;
            numOfTries =+ 1;
        }else{
            System.err.println("Respuesta incorrecta :(");
            numOfTries =+ 1;
        }//end if-else
    }//end recognizeCharacters

    public static void recognizeAllCharacter(Scanner scan){
        Collections.shuffle(wordArray);//cambiamos el orden del array, el único motivo por el cual cambio el orden del array que los dos métodos usan es sencillo, el otro método también accede de forma aleatoria a este array, de forma que cambiando los index no genera ningún problema
        for (Definition definition : wordArray) {
            System.err.println("Cual es este carácter? " + definition.getCharacter());
            if (UserInput.getUserInput(scan).equals(definition.getDefinition())) {
                System.err.println("Respuesta Correcta!");
                correctAnswers =+ 1;
                numOfTries =+ 1;
            }else{
                System.err.println("Respuesta incorrecta :(");
                numOfTries =+ 1;
            }//end if-else
        }
        
    }//end recognizeCharacters
}//end RecognizeCharacters
