/**
 * Created by Zigzagger on 14.04.2017.
 */
public class Model implements GlobalConst{

    private int numberOfTry;
    private int conceivedNumber;
    private int userDecision;
    private int minNumber;
    private int maxNumber;
    private int minUserNumber;
    private int maxUserNumber;
    public int[] userDecisions = new int[20];

    public  Model(){
        numberOfTry = 1;
        minNumber = 0;
        maxNumber = 100;
    }

    public int numberOfTryCounter(){
        numberOfTry++;
        return numberOfTry;
    }

    public int rand(int min, int max){
            this.minNumber = min;
            this.maxNumber = max;
            conceivedNumber = min + (int)(Math.random() * (max - min));
            return conceivedNumber;
    }

    public int rand(){
        conceivedNumber = GlobalConst.minNumber + (int)(Math.random() * (GlobalConst.maxNumber - GlobalConst.minNumber));
        return conceivedNumber;
    }

    public int userDecisions(int userDecision){
        userDecisions[numberOfTry] = userDecision;
        return userDecisions[numberOfTry];
    }

    public void userMinMaxDecisions(){
        minUserNumber = maxUserNumber = userDecisions[numberOfTry];
        for (int i = numberOfTry; i < userDecisions.length; i++){
            if (userDecisions[i] < minUserNumber) minUserNumber = userDecisions[i];
            if (userDecisions[i] > maxUserNumber) maxUserNumber = userDecisions[i];
        }
    }

    public void setConceivedNumber(int conceivedNumber){this.conceivedNumber = conceivedNumber;}
    public void setUserDecision(int userDecision){this.userDecision = userDecision;}
    public void setNumberOfTry(int numberOfTry){this.numberOfTry = numberOfTry;}
    public void setMinNumber(int minNumber){this.minNumber = minNumber;}
    public void setMaxNumber(int minNumber){this.minNumber = minNumber;}

    public int getConceivedNumber(){return conceivedNumber;}
    public int getUserDecision(){return userDecision;}
    public int getNumberOfTry(){return numberOfTry;}
    public int getMinNumber(){return minNumber;}
    public int getMaxNumber(){return maxNumber;}
    public int getMinUserNumber(){return minUserNumber;}
    public int getMaxUserNumber(){return maxUserNumber;}
}
