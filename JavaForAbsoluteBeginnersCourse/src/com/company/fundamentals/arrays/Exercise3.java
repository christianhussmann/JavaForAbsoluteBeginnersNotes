package com.company.fundamentals.arrays;

public class Exercise3 {
    public static void main(String[] args) {
        //Exercise 3
        //
        //Create an array of five doubles and give each element some value.
        //Calculate the sum of all the elements and print the result.
        //Calculate the mean/average of the all the elements and print that too.
        double[] intArr = new double[5];
        intArr[0] = 12.397;
        intArr[1] = 5346.3;
        intArr[2] = 90;
        intArr[3] = 6.58;
        intArr[4] = 368.11;

        double sum = 0;
        for (int i = 0; i < intArr.length; i++) {
            sum += intArr[i];
        }

        double mean = sum / intArr.length;

        System.out.println("Sum: " + sum);
        System.out.println("Mean: " + mean);
    }
}
