package com.company.fundamentals.javaFundamentalsWrapUp.ticTacToe;

public class PrimeNumbers {
    public static void main(String[] args) {

        for (int number = 2; number < 1000; number++) {
            boolean isPrime = true;

            for (int divider = 2; divider * divider <= number; divider++) {

                if (number % divider == 0) {
                    isPrime = false;
                    break;
                }
            }

            if (isPrime) {
                System.out.println(number);
            }
        }
    }
}
