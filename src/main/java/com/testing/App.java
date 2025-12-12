package com.testing;

import java.io.IOException;
import java.util.Scanner;

import com.testing.enums.MenuOption;
import com.testing.enums.SubMenu;
import com.testing.models.*;

public class App {
    public static void main( String[] args ){
        Scanner scan = new Scanner(System.in); //Creamos el objeto Scanner
        MenuOption choice;
        int subChoice;
        
        do{
            MenuOption.showMenu();
            choice = MenuOption.fromOrdinal(Integer.parseInt(scan.nextLine()));//cambia el input del usuario a un int
            
            //switch para imprimir el menu enum
            switch (choice) {
                case RECOGNIZE:
                    SubMenu.showMenu();
                    try {
                        subChoice = Integer.parseInt(scan.nextLine());//cambia el input del usuario a un int
                        if (subChoice == 1) {
                            RecognizeCharacters.recognizeOneCharacter(scan);
                            break;  
                        }if (subChoice == 2) {
                            System.err.println("Esta opción todavía no esta disponible, por favor espere a una version actualizada del programa");
                            break;
                        }if (subChoice == 3) {
                            RecognizeCharacters.recognizeAllCharacter(scan);
                            break;
                        }if (subChoice == 4) {
                            break;
                        }else{
                            System.err.println("Por favor elija una opción valida");
                            break;
                        }
                    } catch (Exception e) {
                        System.err.println("Ha ocurrido un error");
                        System.err.println(e);
                    }
                    
                    
                    case SEARCH:
                        SearchByDefinition.byDefinition(scan);
                        break;
                    case SHOW:
                        try {
                            CsvReader.csvReaderShowTable();
                        } catch (IOException e) {
                            e.printStackTrace();
                        }break;
                    case SCORE:
                        Score.showScore();
                        break;
                    case EXIT:
                            System.err.println("祝你一天 (Que tengas un buen dia)");
                        break;
            }
        }while(choice != MenuOption.EXIT);
        scan.close(); 

    }//end static void main
}//end App
