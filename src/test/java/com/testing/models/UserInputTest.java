package com.testing.models;

import java.util.Scanner;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Tag;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.NullSource;


public class UserInputTest {
    @ParameterizedTest
    @NullSource
    @Tag("regression")
    void nullScanner(Scanner scanner){
        assertTrue(UserInput.getUserInput(scanner).equals("ha ocurrido un error porque el scanner es null"));//el mensaje es en minúscula porque en UserInput se le aplica el .toLowerCase() a el string
    }//end nullScanner
}//end UserInputTest
