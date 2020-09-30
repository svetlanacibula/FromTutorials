package Lesson6;

import java.util.Random;
import java.util.Scanner;

public class GuessingGameTwo {
    public static void main(String[] args) {
        Random random = new Random();
        int hiddenNumber = random.nextInt(100);

        Scanner keyboard = new Scanner(System.in);

        int guess;

        do {

            System.out.print("Enter a guess: ");

            guess = keyboard.nextInt();

            if (guess == hiddenNumber)

                System.out.println("Guess is correct!");

            else if (guess < hiddenNumber)

                System.out.println("Your guess is smaller than the hidden number.");

            else

                System.out.println("Your guess is greater than the hidden number.");
        } while (guess != hiddenNumber);

    }
}