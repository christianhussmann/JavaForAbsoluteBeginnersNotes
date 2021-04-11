package com.company.fundamentals.loops;

import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

public class Exercise6 {
    public static void main(String[] args) {
        //Modify the program in Exercise 5 so that once the game is won, it informs the player how many guesses it took them.
        Scanner scanner = new Scanner(System.in);

        int randomNumber = ThreadLocalRandom.current().nextInt(1, 101);
        int guess;
        int guessCount = 0;

        System.out.println("--- Guess My Number Game ---");

        do {

            System.out.print("\nGuess: ");
            guess = scanner.nextInt();
            guessCount++;

            if (guess < randomNumber) {
                System.out.println("HIGHER.");
            }
            else if (guess > randomNumber) {
                System.out.println("LOWER.");
            }
            else {
                System.out.println("CORRECT. My number was " + randomNumber + ".");
                System.out.println("You got it in " + guessCount + " guesses!");
            }

        } while (guess != randomNumber);
    }
}
