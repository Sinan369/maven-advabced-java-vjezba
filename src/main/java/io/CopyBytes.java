package io;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class CopyBytes {
    public static void main(String[] args) {
        // Čitanje BYTE po BYTE
        //Byte po Byte: Za ovaj text ima 57 iteracija!
        //TRY-WITH-RECORSE dodato u java 7 -- mogu samo da uđu klase koje nasljeđuju coloseable --
        try(
                FileInputStream in = new FileInputStream("C:\\Users\\Ajdin\\Desktop\\IT akademija\\Maven-Java-Vjezba\\src\\main\\resources\\source.txt");
                FileOutputStream out = new FileOutputStream("C:\\Users\\Ajdin\\Desktop\\IT akademija\\Maven-Java-Vjezba\\src\\main\\resources\\destination.txt");
                )
        {
            int byteChar;
            int counter = 0;
            while ((byteChar = in.read()) !=-1){
                counter++;
                System.out.println("Broj Iteracija: " + counter);
                out.write(byteChar);
            }
        } catch (IOException e){
            System.err.println(e.getMessage());
        }
    }
}
