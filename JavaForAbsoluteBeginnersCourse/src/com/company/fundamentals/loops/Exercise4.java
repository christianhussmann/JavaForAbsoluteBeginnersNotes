package com.company.fundamentals.loops;

public class Exercise4 {
    public static void main(String[] args) {
        //Write a program which makes use of a loop to print the following output:
        //
        //0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10.

        for (int i = 0; i <= 10; i++) {
            System.out.print(i + ", ");
        }

        System.out.println("\b\b.");
    }
}
