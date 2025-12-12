package com.testing;

import java.io.IOException;
import java.util.Scanner;

import com.testing.enums.*;
import com.testing.models.*;

public class App {
    public static void main( String[] args ){
        Scanner scan = new Scanner(System.in); //Creamos el objeto Scanner
        boolean validInput = false; //variable para crear el primer loop
        MenuOption choice = null;//debe de ser inicializada antes de poder asignarle un valor en el try catch

        do{
            while (!validInput) {//mientras el input no esa valido 
                MenuOption.showMenu();//mostramos el menu
                try {//verificamos que lo que escribe el usuario es un numero
                    choice = MenuOption.fromOrdinal(Integer.parseInt(scan.nextLine()));//cambia el input del usuario a un int
                    validInput = true;//asumimos que el usuario puso bien el tipo de dato, y cambiamos la variable para que el while no se ejecute otra vez
                } catch (Exception e) {//si el usuario no puso un numero
                    System.err.println("Input no reconocido. Por favor intente de nuevo.");//indicamos al usuario que su input no fue correcto
                    validInput = false;// decimos que se tiene que repetir el while
                }
            }
            validInput = false;//asignamos otra vez false a el validInput, para que la proxima vez que el do se repita el do podamos elegir una opción nueva
            //switch para imprimir el menu enum
            switch (choice) {
                case RECOGNIZE:
                    SubMenu.showMenu();
                    RecognizeCharacters.recognizeCharacters(scan);
                    break;
                case SEARCH:
                    SearchByDefinition.byDefinition(scan);
                    break;
                case SHOW:
                    try {//este try catch es necesario por la IOException
                        CsvReader.csvReaderShowTable();
                    } catch (IOException e) {
                        e.printStackTrace();
                    }break;
                case SCORE:
                    System.err.println(Score.showScore(RecognizeCharacters.getCorrectAnswers(), RecognizeCharacters.getNumOfTries()));
                    break;
                case EXIT:
                        System.err.println("祝你一天很好 (Que tengas un buen dia)");
                    break;
                default:
                    System.err.println("Debes elegir entre 1 y " + MenuOption.values().length + ")");//si el usuario pone un numero pero ese numero esta por fuera del rango del enum
            }

        }while(choice != MenuOption.EXIT || validInput);
        scan.close(); 

    }//end static void main
}//end App
