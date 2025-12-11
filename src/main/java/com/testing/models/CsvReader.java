package com.testing.models;

//imports
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class CsvReader {
    private static ArrayList<Definition> wordList = csvReaderArray();//array que tendrá todas la palabras que están en el csv
    
    //método que se encarga de leer el archivo cvs. Es privado porque nunca debería de ser llamado por otras clases, si necesitan la lista deben de llamar a word list, que llama a este método para crearse y tiene toda la info del csv
    //es static para que pueda ser llamado sin tener que instanciar la clase
    private static ArrayList<Definition> csvReaderArray(){//este método jamas deberá ser llamado por otras clases, si necesitan saber los valores dentro del csv que llamen a wordList
        //declaramos e instanciamos variables
        String file = "src\\main\\java\\com\\testing\\models\\Palabras.csv";//ubicación del archivo a leer
        String line = "";//va a guardar los valores dentro de 
        String delimiter = ";";//lo que separa las columnas dentro el csv
        ArrayList<Definition> data = new ArrayList<>();//donde se guardaran todos los datos para el return

        //es importante destacar que esta estructura es necesaria, si no se envuelve en un try-catch da error
        try (BufferedReader reader = new BufferedReader(new FileReader(file))) {//el BufferReader necesita el FileReader para poder funcionar. El reader puede funcionar solo, pero el BufferReader lo hace mas eficiente
            while ((line = reader.readLine()) != null) {//mientras la linea existe el while corre. Al mismo tiempo line se le asigna una linea del archivo
                String[] rawFields = line.split(delimiter);//el array String guarda todos los valores de la linea que se esta leyendo. 
                Definition fields = new Definition(rawFields[0], rawFields[1], rawFields[2]);//usamos el array para crear el Definitions fields
                data.add(fields);//agregamos el field que acabamos de crear
            }//end while
        } catch (IOException e) {//la IOException es la excepción que necesitamos manejar si o si.
            e.printStackTrace();//mostramos mensaje de error
        }//end try-catch
        return data;
    }//end csvReaderArray
    /**
     * @param WordList
     */
    public static ArrayList<Definition> getWordList(){
        return wordList;
    }
    

    public static void csvReaderShowTable() throws IOException {
        System.err.println();
        for (Definition row : wordList) {
            System.err.println(row.toString());
        }
    }

}// end CsvReader
