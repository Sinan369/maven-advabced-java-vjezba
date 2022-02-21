package io;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class CopyChars {
    public static void main(String[] args) {
        //Čitanje KARAKTER po KARAKTER
        //Karakter po Karakter: Za ovaj text ima 57 iteracija!
        try (
                FileReader fileReader = new FileReader("src/main/resources/izvorKaraktera.txt");
                FileWriter fileWriter = new FileWriter("src/main/resources/destinationKaraktera.txt")
                )
        {
            int counter = 0;
            int procitaniKarakter;
            while ((procitaniKarakter = fileReader.read())!=-1){
                counter++;
                System.out.println("Broj Iteracija: " + counter);
                fileWriter.write(procitaniKarakter);
            }
        }catch (IOException e){
            System.err.println(e.getMessage());
        }
    }
}
