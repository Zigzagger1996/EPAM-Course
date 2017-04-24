package ua.kpi.tef.view;

import java.util.Locale;
import java.util.ResourceBundle;


/**
 * Created by Zigzagger on 04.04.2017.
 */
public class View implements TextConstants{
    //методы по сборке текста
    static String MESSAGES_BUNDLE_NAME = "messages";
    static String HELLO_MESSAGE = "Lab_4, Vladimir Glukhomanyk";
    private static final String SPACE = " ";
    private static final String DOT = ".";


    StringBuilder builder = new StringBuilder();

    public void printStringBuilder (StringBuilder builder){
        System.out.println(builder);
    }

    public void printMessage (String string){
        System.out.println(string);
    }

    public void userInitials (String firstName, String secondName) {
        System.out.println(secondName + SPACE + firstName.charAt(0) + DOT);
    }

    public void userAddress (String index, String street, String homeNumber, String flatNumber, String city){
        System.out.println("\nYour city: " + city + "\nYour street: " + street
                + "\nYour index: " + index + "\nYour house number: " + homeNumber
                + "\nYour flat number: " + flatNumber);

    }
    //все строки во view !!! через stringbilder
}
