package com.testing.models;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class CsvReader {
    String file = "src\\main\\java\\com\\testing\\models\\Palabras.csv";
    BufferedReader reader = null;
    String line = "";

    public void csvReaderShowTable() throws IOException {
        try {
            reader = new BufferedReader(new FileReader(file));
            while ((line = reader.readLine()) != null) {
                String[] row = line.split(",");

                for (String index : row) {
                    System.err.printf("%-8s", index);
                } // end for-each
                System.err.println();
            }// end while
        }// end try
        catch (IOException ie) {
            ie.printStackTrace();
        }//end catch
        catch (Exception e) {
            e.printStackTrace();
        }// end catch
        finally {
            reader.close();
        }// end finally
    }//ends CsvReaderShowTable

}// end CsvReader
