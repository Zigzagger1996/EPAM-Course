/**
 * Created by Zigzagger on 14.04.2017.
 */
public class View implements GlobalConst {
    public static final String START_GAME_MESSAGE = "The Game is begin !";
    public static final String DECISION_MESSAGE = "And your decision is...";
    public static final String WIN_MESSAGE = "You are right!";
    public static final String WIN_MESSAGE_1_LVL_1 = "You are *u*k*ng lucky #@2#$!*&@# !!!";
    public static final String WIN_MESSAGE_2_LVL_1 = "Ha-ha, bad luck man!";
    public static final String WIN_MESSAGE_3_LVL_1 = "Gg Wp - Gl Hf !";
    public static final String BIG_NUMBER_MESSAGE = "Nice try, but your number is bigger than my number!";
    public static final String SMALL_NUMBER_MESSAGE_LVL_1 = "Sorry honey, your number is smaller than my number!";
    public static final String INCORECT_INPUT = "Wrong! YOu need to put just integer number, try again:";



    public void rangeOfGame(int minRange, int maxRange) {
        System.out.println("Lets start. You need to guess my number, it's easy! The range of number is from "+ minRange +" to " + maxRange);
    }

    public void rangeOfGame() {
        System.out.println("Lets start. You need to guess my number, it's easy! The range of number is from "+ minNumber +" to " + maxNumber);
    }

    public void statisticMethod(int numberOfTry) {
        System.out.println("Generally you'w done " + numberOfTry + " trying");
    }

    public void userDecisionsPrint(int[] userDecisions, int numberOfTry){
        for (int i = 1; i < numberOfTry; i++) {
            System.out.println("Your " + i + " decision:" + userDecisions[i]);
        }
    }

    public void userProgres(int minUserNumber, int maxUserNumber){
        System.out.println("True number location is: " + minUserNumber + " and " + maxUserNumber);
    }

    public void printMessage(String message) {
        System.out.println(message);
    }

}
