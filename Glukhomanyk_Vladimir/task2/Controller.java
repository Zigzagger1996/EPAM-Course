import java.util.Scanner;
/**
 * Created by Zigzagger on 14.04.2017.
 * @see 
 */
public class Controller implements GlobalConst{
    //Constants

    Model model;
    View view;

    public Controller(Model model, View view){
        this.model = model;
        this.view = view;
    }

    Scanner scanner = new Scanner(System.in);

    public void processUser() {
        view.printMessage(view.START_GAME_MESSAGE);
        userDecision();
    }

    public int userNumber(Scanner sc){
        while( ! sc.hasNextInt()) {
            view.printMessage(view.INCORECT_INPUT);
            sc.next();
        }
        return sc.nextInt();
    }

    public void userDecision() {
        model.setConceivedNumber(model.rand());
        view.rangeOfGame();
        while (true) {
            view.printMessage(view.DECISION_MESSAGE);
            model.setUserDecision(userNumber(scanner));
            model.userDecisions(model.getUserDecision());
            if (model.getUserDecision() == model.getConceivedNumber()) {
                view.printMessage(view.WIN_MESSAGE);
                view.statisticMethod(model.getNumberOfTry());
                if (model.getNumberOfTry() == 1) {
                    view.printMessage(view.WIN_MESSAGE_1_LVL_1);
                } else if (model.getNumberOfTry() > 10) {
                    view.printMessage(view.WIN_MESSAGE_2_LVL_1);
                } else if (model.getNumberOfTry() < 10) {
                    view.printMessage(view.WIN_MESSAGE_3_LVL_1);
                }
                break;
            } else if (model.getUserDecision() > model.getConceivedNumber()) {
                view.printMessage(view.BIG_NUMBER_MESSAGE);
            } else if (model.getUserDecision() < model.getConceivedNumber()) {
                view.printMessage(view.SMALL_NUMBER_MESSAGE_LVL_1);
            }

            model.numberOfTryCounter();
        }
        view.userDecisionsPrint(model.userDecisions, model.getNumberOfTry());
    }
}
