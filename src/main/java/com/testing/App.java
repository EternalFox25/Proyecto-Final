package com.testing;

import java.util.Scanner;

import com.testing.enums.MenuOption;
import com.testing.models.*;

public class App {
    public static void main( String[] args ){
        /* Linea para comprobar que el terminal puede mostrar caracteres chinos*/
        System.out.println( "你好!\n这是Emilia Lopez的电脑， 欢迎你来到我们的计算机程序！" );
        
        Scanner scan = new Scanner(System.in); //Creamos el objeto Scanner
        MenuOption choice;
        CsvReader reader = new CsvReader();

        do{
            MenuOption.showMenu();
            choice = MenuOption.fromOrdinal(Integer.parseInt(scan.nextLine()));//cambia el input del usuario a un int
            
            //switch para imprimir el menu enum
            switch (choice) {
                case RECOGNIZE:
                        break;
                    case WRITE:
                        break;
                    case SHOW:
                        try {
                            reader.csvReaderShowTable();
                        } catch (Exception e) {

                        }break;
                    case EXIT:
                        System.err.println("祝你一天愉快 (Que tengas un buen dia)");
                        break;
            }
        }while(choice != MenuOption.EXIT);
        scan.close(); 

    }//end static void main
}//end App
