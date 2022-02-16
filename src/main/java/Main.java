import io.Reader;
import javax.swing.*;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Halo...");
        int number = 23;

        int result = number/0;
        System.out.println("Unesi ime fajla:");
        String imeFajla = new Scanner(System.in).nextLine();

        try{
            readFile(imeFajla);
        }catch (FileNotFoundException exception){
            JOptionPane.showMessageDialog(null, exception.getMessage());
        }



        System.out.println("Učitali smo fajl..");
    }

    static void readFile(String name) throws FileNotFoundException{

    }
}
