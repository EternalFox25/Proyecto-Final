package com.testing.enums;

public enum MenuOption {
    RECOGNIZE("Reconocer caracteres chinos"),
    SEARCH("Buscar caracteres dando una definición"), 
    SHOW("Mostrar todos los caracteres en el programa y sus significados"),
    SCORE("Mostrar calificación actual"),
    EXIT("Salir del programa");

    //declare var
    private final String description;

    //formato de MenuOption
    MenuOption(String description){
        this.description = description;
    }//end MenuOption (constructor)

    //Solo get, porque es una constante y no puede ser cambiado
    public String getDescription(){
        return description;
    }

    public static void showMenu(){//imprime el Menu
        System.err.println("------- 汉宇次 (Caracteres chinos)  -------");//nombre del programa
        for (MenuOption option : MenuOption.values()) {//for-each para mostrar el menu
            System.err.println(option.ordinal()+1 +")" + option.getDescription());//imprime el numero de la opción y muestra la descripción 
        }//end foreach
        System.err.print("Elija (1 - " + MenuOption.values().length + "): ");//imprime para que el usuario sepa que hacer
    }//end showMenu()

    //cambia el input del usuario a una constante para el enum
    public static MenuOption fromOrdinal(int choice){ 
        if (choice < 1 || choice>values().length) {//if el usuario pone un input fuera del rango del enum
            throw new IllegalArgumentException();//muestra un mensaje de error
        }//end if
        return values()[choice-1];//-1 para que el index sea correcto
    }//end MenuOption fromOrdinal
}//ends enum MenuOption
