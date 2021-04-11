package com.company.fundamentals.loops;

import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

public class DoWhileLoop {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String again;
        do {
            int num = ThreadLocalRandom.current().nextInt(1, 7);
            System.out.println("You rolled a " + num + ".");
            System.out.print("Roll again? y/n: ");
            again = scanner.next();
        } while (again.equals("y"));

    }
}
