package com.testing.models;

import java.util.Scanner;

public final class UserInput {
    public static String getUserInput(Scanner scan) {
        String value = null;//iniciamos la variable antes para que se pueda hacer la asignación dentro del try catch
        try {
            value = scan.nextLine();//capturamos el input del usuario
        } catch (NullPointerException e) {
            value = "Ha ocurrido un error porque el scanner es null";
        }catch (Exception e){
            value = "Ocurrió un error inesperado";
        }
        String valueNoSpaces = value.replaceAll("\\s", " ");//cambiamos todos los espacios extras que el usuario puede haber puesto y los cambiamos por uno solo
        String trimmedString = valueNoSpaces.trim();//sacamos todos los espacios extras al principios y final del String
        return trimmedString.toLowerCase();//devolvemos el string con una cantidad razonable de espacios y lo pasamos a lower case.
    }
}
