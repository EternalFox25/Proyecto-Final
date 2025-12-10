package com.testing.models;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class CsvReader {
    private ArrayList<Definition> wordList = csvReaderArray();//array que tendrá todas la palabras que están en el csv
    
    private ArrayList<Definition> csvReaderArray(){//este método jamas deberá ser llamado por otras clases, si necesitan saber los valores dentro del csv que llamen a wordList
        String file = "src\\main\\java\\com\\testing\\models\\Palabras.csv";//ubicación del archivo a leer
        String line = "";//va a guardar los valores dentro de 
        String delimiter = ";";//lo que separa las columnas dentro el csv
        ArrayList<Definition> data = new ArrayList<>();

        try (BufferedReader reader = new BufferedReader(new FileReader(file))) {
            while ((line = reader.readLine()) != null) {
                String[] rawFields = line.split(delimiter);
                Definition fields = new Definition(rawFields[0], rawFields[1], rawFields[2]);
                data.add(fields);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return data;
    }

    public ArrayList<Definition> getWordList(){
        return wordList;
    }
    
    public void csvReaderShowTable() throws IOException {
        System.err.println();
        for (Definition row : wordList) {

            System.err.println(row.toString());
        }
    }

}// end CsvReader
