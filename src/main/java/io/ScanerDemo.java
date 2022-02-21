package io;

import java.io.BufferedReader;
import java.io.File;

import java.io.IOException;
import java.util.Locale;
import java.util.Scanner;

public class ScanerDemo {
    public static void main(String[] args) {
        try(
                Scanner scanner = new Scanner(new File("src/main/resources/sourceDouble.txt"));
                )
        {
            scanner.useLocale(Locale.GERMAN);
            while (scanner.hasNext()){
                if (scanner.hasNextDouble()){
                    double broj = scanner.nextDouble();
                    System.out.println(broj);
                } else {
                    scanner.next();
                }
            }
        }catch (IOException e){
            System.err.println(e.getMessage());
        }
    }
}
