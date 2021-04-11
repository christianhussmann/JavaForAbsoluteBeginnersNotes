package com.company.fundamentals.userinput;

import java.util.Scanner;

public class Exercise2 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Restaurant Bill calculator\n");

        System.out.print("Enter bill total: DKK");

        double bill = scanner.nextDouble();

        System.out.print("Enter number of people: ");
        int people = scanner.nextInt();

        double eachPay = bill / people;

        System.out.format("A bill of DKK%.2f split between " + people + " people comes to approximately DKK%.2f each", bill,eachPay);
    }
}
