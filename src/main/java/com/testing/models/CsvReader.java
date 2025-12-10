package com.testing.models;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class CsvReader {
    private List<Definition> wordList = csvReaderArray();//array que tendrá todas la palabras que están en el csv
    
    private ArrayList<String[]> csvReaderArray(){//este método jamas deberá ser llamado por otras clases, si necesitan saber los valores dentro del csv que llamen a wordList
        String file = "src\\main\\java\\com\\testing\\models\\Palabras.csv";//ubicación del archivo a leer
        String line = "";//va a guardar los valores dentro de 
        String delimiter = ";";//lo que separa las columnas dentro el csv
        ArrayList<String[]> data = new ArrayList<>();

        try (BufferedReader reader = new BufferedReader(new FileReader(file))) {
            while ((line = reader.readLine()) != null) {
                String[] fields = line.split(delimiter);
                data.add(fields);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return data;
    }

    public ArrayList<String[]> getWordList(){
        return wordList;
    }
    
    public void csvReaderShowTable() throws IOException {
        System.err.println();
        for (String[] row : wordList) {
            for (String string : row) {
                System.out.print(string + " ");
            }
            System.err.println();

        }
    }

}// end CsvReader
