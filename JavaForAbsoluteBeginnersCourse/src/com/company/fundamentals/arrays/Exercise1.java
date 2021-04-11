package com.company.fundamentals.arrays;

public class Exercise1 {
    public static void main(String[] args) {
        //Exercise 1
        //
        //Create an integer array of 10 elements and give each element an arbitrary value. Print out the entire array using a loop.

        int[] intArray = new int[10];
        intArray[0] = 45;
        intArray[1] = 2351;
        intArray[2] = 31554;
        intArray[3] = 13123;
        intArray[4] = 1431;
        intArray[5] = 4414;
        intArray[6] = 13;
        intArray[7] = 143;
        intArray[8] = 141;
        intArray[9] = 567;

        for (int i = 0; i < intArray.length; i++) {
            System.out.println(intArray[i]);
        }
    }
}
