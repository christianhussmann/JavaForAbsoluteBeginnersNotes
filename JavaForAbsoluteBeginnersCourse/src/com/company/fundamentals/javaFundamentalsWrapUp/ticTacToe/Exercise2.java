package com.company.fundamentals.javaFundamentalsWrapUp.ticTacToe;

import java.util.Scanner;

public class Exercise2 {
    public static void main(String[] args) {
        //Write a quiz program with five true-or-false questions.
        //Display a question to the user, and ask the user to enter either true or false, then move on to the next question.
        //At the end of the quiz display the user’s score.
        //
        //Use three arrays, a String array for holding the questions, a boolean array for the answers, and another boolean array for the user’s answers.


        String[] questions = new String[] {
                "I like smelly soaks alot",
                "Is a tiger faster than a Ferrari?",
                "Im good at coding",
                "Coronavirus is dangerous",
                "Is this program awesome?"
        };

        boolean[] answers = new boolean[] {
                false,
                false,
                true,
                false,
                true
        };

        boolean[] userAnswers = new boolean[5];

        int finalScore = 0;

        Scanner scanner = new Scanner(System.in);

        for (int i = 0; i < 5; i++) {

            System.out.println("\nQuestion " + (i+1) + ": " + questions[i] + ". True or False?");
            System.out.print("Your answer: ");
            userAnswers[i] = scanner.nextBoolean();

            if (userAnswers[i] == answers[i]) {
                System.out.println("Correct!");
                finalScore++;
            }
            else {
                System.out.println("Wrong. It's " + answers[i] + ".");
            }

        }

        System.out.println("\nYour final score is " + finalScore + " out of 5.");
    }
}
