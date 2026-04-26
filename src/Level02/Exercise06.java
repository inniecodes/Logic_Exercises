package Level02;

import java.util.*;

public class Exercise06 {
    /*
    * Write a program that makes the computer “think” of an integer number between 0 and 5
    * and asks the user to try to guess which number was chosen by the computer.
    * The program should display on the screen whether the user won or lost.
    * */
    public static String verifyNumber(int num){
        //int[] numbers = {0,1,2,3,4,5};
        Random random = new Random();
        int randomNumber = random.nextInt(6); // numbers from 0 to 5

        if ( num == randomNumber){
            return "This is the same number. You won.";
        } else {
            return "This is NOT the same number. You Lost. "+ "Number chosen by the machine: " + randomNumber;
        }
    }
}
