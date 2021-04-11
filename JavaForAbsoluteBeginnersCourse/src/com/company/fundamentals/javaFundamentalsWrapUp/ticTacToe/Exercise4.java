package com.company.fundamentals.javaFundamentalsWrapUp.ticTacToe;

import java.util.Scanner;

public class Exercise4 {
    public static void main(String[] args) {
        //Exercise 4
        //
        //If you have not already done so, modify Exercise 3 so the program guesses your number in the least amount of steps.

        System.out.println("\n### Guess My Number Game ###\n");

        System.out.println("--- Rules ---");
        System.out.println("Think of a number from 1 to 100 and I'll try to guess it.");
        System.out.println("Enter \"higher\" if my guess is too low.");
        System.out.println("Enter \"lower\" if my guess is too high.");
        System.out.println("Enter \"correct\" if I get it right.");

        Scanner scanner = new Scanner(System.in);
        String input;

        int min = 1;
        int max = 100;
        int guess = 50;

        while (true) {
            System.out.println("\nI guess " + guess + ".");
            System.out.print("Your response: ");
            input = scanner.next();

            if (input.equals("higher")) {
                min = guess + 1;
            } else if (input.equals("lower")) {
                max = guess - 1;
            } else if (input.equals("correct")) {
                System.out.println("\n" + guess + ", lol to easy!");
                break;
            }

            guess = (min + max) / 2;

            if (min == max + 1) {
                System.out.println("\nThat's not possible. Let's try again.");
                min = 1;
                max = 100;
                guess = 50;
            }
        }
    }
}
