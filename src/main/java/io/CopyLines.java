package io;

import org.w3c.dom.css.Counter;

import java.io.*;

public class CopyLines {
    public static void main(String[] args) {
        // Čitanje LINIJU po LINIJU
        //Linija po Linija: Za ovaj text ima 4 iteracija!
        //BufferedReader -> FileReader -> reader = new BufferedReader(new FileReader());

        try(
                BufferedReader reader = new BufferedReader(new FileReader("src/main/resources/izvorLinija.txt "));
                PrintWriter writer = new PrintWriter(new FileWriter("src/main/resources/destinacijaLinija.txt"));
                )
        {
            String line;
            int counter = 0;
            while ((line= reader.readLine())!=null){
                counter++;
                System.out.println("Broj iteracija: " + counter);
                writer.println(line);
            }
        }catch (IOException e){
            System.err.println(e.getMessage());
        }
    }
}
