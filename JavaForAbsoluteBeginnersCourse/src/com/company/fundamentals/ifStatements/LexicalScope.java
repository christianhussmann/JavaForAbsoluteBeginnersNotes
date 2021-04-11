package com.company.fundamentals.ifStatements;

import java.util.Scanner;

public class LexicalScope {
    public static void main(String[] args){
        int numPets = -1;

        if (true){
            Scanner scanner = new Scanner(System.in);
            System.out.println("Enter the number of pets you own: ");
            numPets = scanner.nextInt();
        }

        System.out.println("You have " + numPets + " pets.");
    }
}
