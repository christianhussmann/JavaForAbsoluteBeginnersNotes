package com.company.fundamentals.userinput;

import java.util.Scanner;

public class Exercise1 {
    public static void main(String[] args) {
        //In this Exercise we use the Scanner class
        //By writing "System.in" we make the scanner scan our input.

        //Exercise 1.1
        //Make changes to the program from the lesson video so that:
        //It prints “You’ve lived x years. In another x years you’ll be 2x years old.”, where x is their age.

        //Exercise 1.2
        //Make changes to the program from the lesson video so that:
        //It informs the user of how many characters are in their name.



        Scanner scanner = new Scanner(System.in);

        System.out.print("First Name: ");
        String firstName = scanner.next();

        System.out.print("Age: ");
        int age = scanner.nextInt();

        System.out.print("Amount of money in your pocket: £");
        double money = scanner.nextDouble();

        System.out.println();

        double moneyNeeded = Math.ceil(money) - money;

        System.out.println("Your name is " + firstName + " and you are " + age + " years old.");
        System.out.println("You've lived " + age + " years. In another " + age + " years you'll be " + age * 2 + " years old.");
        System.out.format("You have £%.2f on you and need £%.2f.", money, moneyNeeded);
    }
}
