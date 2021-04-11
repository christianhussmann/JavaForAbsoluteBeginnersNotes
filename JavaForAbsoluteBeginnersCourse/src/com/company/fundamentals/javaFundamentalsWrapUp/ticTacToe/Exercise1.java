package com.company.fundamentals.javaFundamentalsWrapUp.ticTacToe;

import java.util.Scanner;

public class Exercise1 {
    public static void main(String[] args) {
        //You have been tasked with writing a program for a school which produces some statistics on students’ exam results.
        // The users are teachers who will input each student’s score, and any other necessary data. Store the scores in an array.
        // The program should output:
        //
        //Each student’s score and percentage for the exam
        //
        //The mean (average) score and percentage of the exam

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the maximum possible score for this exam: ");
        int maxScore = scanner.nextInt();

        System.out.print("How many students did attend the exam: ");
        int numberOfStudents = scanner.nextInt();

        int[] studentScores = new int[numberOfStudents];

        System.out.println("\nEnter each student's score.");
        for (int i = 0; i < studentScores.length; i++){
            System.out.print("Student " + (i + 1) + ": ");
            studentScores[i] = scanner.nextInt();
        }

        System.out.println("\n--- Statistics ---");

        int sum = 0;
        for (int i = 0; i < studentScores.length; i++) {
            double studentScore = studentScores[i];
            double studentPercentage = ((double)studentScores[i] / maxScore) * 100;
            System.out.println("Student " + (i + 1) + ": " + studentScore + "/" + maxScore + " (" + studentPercentage + "%)");
            sum += studentScore;
        }

        double mean = (double)sum / studentScores.length;
        double meanPercentage = (mean / maxScore) * 100;
        System.out.println("Mean: " + mean + "/" + maxScore + " (" + meanPercentage + "%)");
    }
}
