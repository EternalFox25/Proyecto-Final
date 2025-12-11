package com.testing.enums;

public enum SubMenu {
    ONE("Un carácter"),
    SOME("Varios caracteres"), 
    ALL("Todos los caracteres"),
    BACK("Volver al menu anterior");

    //declare var
    private final String description;

    //formato de SubMenuOption
    SubMenu(String description){
        this.description = description;
    }//end SubMenuOption (constructor)

    //Solo get, porque es una constante y no puede ser cambiado
    public String getDescription(){
        return description;
    }

    public static void showMenu(){//imprime el Menu
        System.err.println("------- Elegir una opción  -------");
        for (SubMenu option : SubMenu.values()) {//for-each para mostrar el menu
            System.err.println(option.ordinal()+1 +")" + option.getDescription());//imprime el numero de la opción y muestra la descripción 
        }//end foreach
        System.err.print("Elija (1 - " + MenuOption.values().length + "): ");//imprime para que el usuario sepa que hacer
    }//end showMenu()
}
