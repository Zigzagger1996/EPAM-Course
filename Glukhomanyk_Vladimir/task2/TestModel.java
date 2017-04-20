import org.junit.Test;

import static junit.framework.TestCase.assertEquals;
import static junit.framework.TestCase.fail;
import static junit.framework.TestCase.format;

/**
 * Created by Zigzagger on 14.04.2017.
 */
public class TestModel {

    @Test
    public void testNumberOfTryCounter(){
        int numberOfTry = 1;
        int expectedNumberOfTry = 2;
        numberOfTry++;
        assertEquals( expectedNumberOfTry, numberOfTry);
    }

    @Test
    public void testRand(){
        int min, max;
        int expectedNumber;
        int randomNumber;
        min = 0;
        max = 0;
        expectedNumber = 0;
        randomNumber = min + (int)(Math.random() * (max - min));
        assertEquals(expectedNumber, randomNumber);
    }

    @Test
    public void testRandRange(){
        int min, max;
        int[] expectedNumber = new int [50];
        min = 0;
        max = 30;
        for (int i = 0; i < 50; i++){
            expectedNumber[i] = min + (int)(Math.random() * (max - min));
            if(expectedNumber[i] > max | expectedNumber[i] < min){
                fail();
            }
        }
    }
}
