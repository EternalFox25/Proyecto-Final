package com.testing.models;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;
//import com.testing.models.UserInput;

public class RecognizeCharacters {
    private static int correctAnswers = 0;
    private static int numOfTries = 0;
    private static ArrayList<Definition> wordArray = CsvReader.getWordList();

    public static void recognizeCharacters(Scanner scan){
        switch (UserInput.getUserInput(scan)) {
            case "ha ocurrido un error porque el scanner es null":
                System.err.println("Ha ocurrido un error porque el scanner es null");
                break;
            case "1":
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
                break;
            case "2":
                System.err.println("Esta opción todavía no esta disponible, por favor espere a una version actualizada del programa");
                break;
            case"3":
                Collections.shuffle(wordArray);//cambiamos el orden del array, el único motivo por el cual cambio el orden del array que los dos métodos usan es sencillo, el otro método también accede de forma aleatoria a este array, de forma que cambiando los index no genera ningún problema
                for (Definition definition : wordArray) {
                        System.err.println("Cual es este carácter? " + definition.getCharacter());
                        if ((definition.getDefinition()).contains(UserInput.getUserInput(scan))) {
                            System.err.println("Respuesta Correcta!");
                            correctAnswers += 1;
                            numOfTries += 1;
                        }else{
                            System.err.println("Respuesta incorrecta :(");
                            numOfTries += 1;
                        }//end if-else
                    }//end for - each
                    break;
                case "4":
                    break;
                default:
                    System.err.println("Por favor elija una opción valida");
                    break;
        } //end switch
    }//end recognizeOneCharacters

    /**
     * @param correctAnswers
     */
    public static int getCorrectAnswers(){
        return correctAnswers;
    }

    /**
     * @param numOfTries
     */
    public static int getNumOfTries(){
        return numOfTries;
    }
}//end RecognizeCharacters
