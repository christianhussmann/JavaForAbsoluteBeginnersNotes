package com.company.fundamentals.loops;

import java.util.Scanner;

public class Exercise3 {
    public static void main(String[] args) {
        //Exercise 3
        //
        //Write a program which asks the user for a password. Make the password “shark50”. Each time the user enters the password incorrectly,
        // prompt them for a password again. When the user enters the password correctly, print “ACCESS APPROVED”.

        Scanner scanner = new Scanner(System.in);
        String input;

        do {
            System.out.print("Enter Password: ");
            input = scanner.next();
        } while (!input.equals("shark50"));

        System.out.println("ACCESS APPROVED");
    }
}
