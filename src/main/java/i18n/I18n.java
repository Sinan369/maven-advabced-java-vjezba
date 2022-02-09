package i18n;

import java.util.Locale;
import java.util.ResourceBundle;
import java.util.Scanner;

public class I18n {
    public static void main(String[] args) {
        System.out.println("Unesi Jezik npr en:");
        String lagnuage = new Scanner(System.in).nextLine();
        System.out.println("Unesi lokalizaciju npr UK:");
        String country = new Scanner(System.in).nextLine();
        Locale locale =new Locale(lagnuage, country);
        ResourceBundle translateMessage = ResourceBundle.getBundle("Message", locale);
        System.out.println(translateMessage.getString("greetings"));
        System.out.println(translateMessage.getString("inquiry"));
        System.out.println(translateMessage.getString("farewell"));
    }
}
