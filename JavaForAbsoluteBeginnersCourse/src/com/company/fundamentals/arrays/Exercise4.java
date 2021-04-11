package com.company.fundamentals.arrays;

import java.util.Scanner;

public class Exercise4 {
    public static void main(String[] args) {
        //Exercise 4
        //
        //Write a program which asks the user to enter their top five favourite foods and store their answers in a string array.
        //However, create the array so it can only hold a maximum of three strings.
        //After the user enters the third item, print “No more memory available.”, then print out the contents of the array.
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter your top five favourite foods.\n");

        String[] foods = new String[3];
        for (int i = 0; i < foods.length; i++) {
            System.out.print("Food " + (i + 1) + ": ");
            foods[i] = scanner.nextLine();
        }
        System.out.println("No more memory available.\n");

        System.out.println("Your favourite foods are: ");
        for (int i = 0; i < foods.length; i++) {
            System.out.println(" - " + foods[i]);
        }
    }
}
