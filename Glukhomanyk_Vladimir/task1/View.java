package ua.kpi.tef;

/**
 * Created by User on 17.03.2016.
 */
public class View {
    // Text's constants
    public static final String INPUT_TRUE_MESSAGE = "Your task is write \"Hello World!\" in two words: ";
    public static final String INPUT_FIRST_WORD = "Write \"Hello\":";
    public static final String INPUT_SECOND_WORD = "Write \"World!\":";
    public static final String WRONG_INPUT_MESSAGE = "Wrong! Repeat please! ";
    public static final String HELLO_WORD = "Hello";
    public static final String WORLD_WORD = "World!";

    private String message;

    public void printMessage(String message){System.out.println(message);}

    public String saveString(String message){
        this.message = message;
        return this.message;
    }

    public String getString(){return this.message;}

    public void messageFormation(String firstWord, String secondWord){
        System.out.println("Here is your answer: " + firstWord + " " + secondWord);
    }


}
