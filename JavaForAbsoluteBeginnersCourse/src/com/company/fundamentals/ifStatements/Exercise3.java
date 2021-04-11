package com.company.fundamentals.ifStatements;

import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

public class Exercise3 {
    public static void main(String[] args) {
        int randomNumber = ThreadLocalRandom.current().nextInt(1, 6);

        System.out.println("I'm thinking of a number from 1 to 5. try to guess it");
        System.out.print("Your guess: ");
        Scanner scanner = new Scanner(System.in);
        int guess = scanner.nextInt();

        if(guess == randomNumber){
            System.out.println("Correct! Aren’t you lucky.");
        }
        else {
            System.out.println("Hard luck! You can try again.");
            guess = scanner.nextInt();
        }
        if(guess == randomNumber){
            System.out.println("Correct! About time my friend!.");
        }
        else {
            System.out.println("Wrong again bro, you get it next time!");
        }

    }
}
