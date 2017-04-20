package ua.kpi.tef;

import java.util.Scanner;

/**
 * Created by User on 17.03.2016.
 */
public class Controller {

    // Constructor
    Model model;
    View view;

    public Controller(Model model, View view) {
        this.model  = model;
        this.view = view;
    }

    // The Work method
    public void processUser() {
        Scanner sc = new Scanner(System.in);

        view.printMessage(view.INPUT_TRUE_MESSAGE);
        view.messageFormation(view.saveString(inputMessageWithScanner(sc, view.HELLO_WORD, view.INPUT_FIRST_WORD)),
                              view.saveString(inputMessageWithScanner(sc, view.WORLD_WORD, view.INPUT_SECOND_WORD)));
    }

    // The Utility methods
    public String inputMessageWithScanner(Scanner sc, String trueWord, String task) {
        view.printMessage(task);
        view.saveString(sc.nextLine());
            while (!view.getString().equals(trueWord)) {
                view.printMessage(view.WRONG_INPUT_MESSAGE + task);
                view.saveString(sc.nextLine());
            }
        return view.getString();
    }
}
