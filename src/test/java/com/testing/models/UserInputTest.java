package com.testing.models;

import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

public class UserInputTest {
    @Test
    void nullScanner(){
        assertTrue(UserInput.getUserInput(null).equals("ha ocurrido un error porque el scanner es null"));//el mensaje es en minúscula porque en UserInput se le aplica el .toLowerCase() a el string
    }//end nullScanner
}//end UserInputTest
