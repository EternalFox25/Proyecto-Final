package com.testing.models;

import java.util.Scanner;

public final class UserInput {
    public static String getUserInput(Scanner scan) {
        String value = scan.nextLine();//capturamos el input del usuario
        String valueNoSpaces = value.replaceAll("\\s", " ");//cambiamos todos los espacios extras que el usuario puede haber puesto y los cambiamos por uno solo
        String trimmedString = valueNoSpaces.trim();//sacamos todos los espacios extras al principios y final del String
        return trimmedString;//devolvemos 
    }
}
