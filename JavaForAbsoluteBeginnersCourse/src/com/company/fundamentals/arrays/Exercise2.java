package com.company.fundamentals.arrays;

public class Exercise2 {
    public static void main(String[] args) {
        //Exercise 2
        //
        //Use a loop to populate an array with integers from 1 to 20. Use another loop to print the contents of the array (the elements) backwards.

        int[] intArr = new int[30];

        for (int i = 0; i < intArr.length; i++) {
            intArr[i] = i + 1;
        }

        for (int i = intArr.length - 1; i >= 0; i--) {
            System.out.println(intArr[i]);
        }
    }
}
