package com.company.fundamentals.arrays;

import java.util.Scanner;

public class SizesTypesAndFortuneTellers {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String[] predictions = new String[3];
        predictions[0]="A pioneer";
        predictions[1]="Loved by many";
        predictions[2]="Ver wealthy";

        System.out.println("I will predict your future. Choose 1, 2, or 3: ");
        int choice = scanner.nextInt();

        System.out.println("In your future you will be " + predictions[choice - 1]);


}
}
