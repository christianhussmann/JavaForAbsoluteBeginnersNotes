package com.company.fundamentals.ifStatements;

import java.util.Scanner;

public class IfStatements {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        //If shall always be first.
        //else if shall always be after if, but inbetween else as else shall always be last.
        //The (Logical OR(||)
        //- At least one has to be true
        //true || true - true
        //true || false - true
        //false || true - true
        //false || false - false

        System.out.println("Welcome to SuperFast Rollercoaster!");
        System.out.print("Please enter your height in centimetres: ");
        int height = scanner.nextInt();

        if(height < 130 || height > 210){
            System.out.println("Sorry you do not meet the height requirements.");
        }
        else {
            System.out.println("Height accepted. Go ahead ma man");
        }
        //Instead of doing the method like shown below,
        // you can instead combine them and make as listed above by using ||.

        /*
        if(height < 130){
            System.out.println("Sorry midget, you cant get in.");
        }

        else if( height > 210){
            System.out.println("Sorry, you're too tall..");

        }
        else {
            System.out.println("Height accepted. Go ahead ma man");
        }
         */
    }
}
