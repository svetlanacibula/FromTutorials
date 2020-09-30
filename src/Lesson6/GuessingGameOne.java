package Lesson6;

import java.util.Random;
import java.util.Scanner;

public class GuessingGameOne {
    public static void main(String[] args) {

        Scanner keyboard = new Scanner(System.in);
        Random random = new Random();

        int upperLimit = 10;
        int lowerLimit = 1;
        int myAnswer;

        do {
            int hiddenNumber = random.nextInt( upperLimit - lowerLimit + 1) + lowerLimit;
            System.out.println("I guess it's " + hiddenNumber);
            myAnswer = Integer.parseInt(keyboard.nextLine());

            if (myAnswer == 1) { //too low
                lowerLimit = hiddenNumber + 1;
            } else if (myAnswer == 2) { // too high
                upperLimit = hiddenNumber - 1;
            }
        } while (myAnswer != 0);

        System.out.println("Hurray!");

    }

}