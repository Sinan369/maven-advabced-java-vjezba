package io;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class CopyBytes {
    public static void main(String[] args) {

        try(
                FileInputStream in = new FileInputStream("C:\\Users\\Ajdin\\Desktop\\IT akademija\\Maven-Java-Vjezba\\src\\main\\resources\\source.txt");
                FileOutputStream out = new FileOutputStream("C:\\Users\\Ajdin\\Desktop\\IT akademija\\Maven-Java-Vjezba\\src\\main\\resources\\destination.txt");) {
            int byteChar;
            while ((byteChar = in.read()) !=-1){
                out.write(byteChar);
            }
        } catch (IOException e){
            System.err.println(e.getMessage());
        }
    }
}
