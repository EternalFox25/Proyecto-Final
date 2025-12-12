package com.testing.models;

import java.util.ArrayList;
import java.util.Scanner;

public class SearchByDefinition {
    
    public static void byDefinition(Scanner scan){
        ArrayList<Definition> wordArray = CsvReader.getWordList();
        System.err.println("------- Que carácter estas buscando? -------");
        String userInput = UserInput.getUserInput(scan);

        if (userInput.equals("ha ocurrido un error porque el scanner es null")) {
            System.err.println(userInput);
        }
        for (Definition definition : wordArray) {//
            if ((definition.getDefinition()).contains(userInput)) {//si el input del usuario existe como definición
                System.err.println("Este character tiene esa definición " + definition.toString());
            } // end if
        }//end for
    }//end byDefinition
}//end SearchByDefinition
