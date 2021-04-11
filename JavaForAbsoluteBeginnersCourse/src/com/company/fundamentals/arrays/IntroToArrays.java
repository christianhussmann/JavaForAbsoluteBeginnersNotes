package com.company.fundamentals.arrays;

public class IntroToArrays {
    public static void main(String[] args) {
    //In this example we would like to pick out the number 7.
    //The code here is sorted into an index so if we want to call out our 7, we need to write (b) because its in the array that is called b.
    //After we have announced our array, we need to pick the index in which our 7 stands in. Which is index number 3 we then write (b[3]).
    //So after we have done that we should now get our 7  printed.
        int[] nums = {75, 29, 350, 7, 4192};
        System.out.println(nums[3]);

        //If we want to print all in our array we can use a for-loop.
        /*
        for(int i = 0; i < 5; i++){
            System.out.println(b[i]);
        }
        */


        //but we can make the code over us, better by instead using nums.length.
        /*
        for (int i = 0; i < nums.length; i++){
            System.out.println(nums[i]);
        }
        */


        //We can also sort some of the numbers out if we want by doing this:
        /*
        for(int i = 0; i < nums.length; i++){
            if (nums[i] > 100){
                System.out.println(nums[1]);
            }
        }
        */


        //If we want to make a counter that counts all the numbers over 100 we can simply make a variable that is called count, and that starts on 0.
        /*
        int count = 0;

        for(int i = 0; i < nums.length; i++){
            if (nums[i] > 100){
                count++;
            }
        }
        System.out.println("Number of values greater than 100: " + count);
        */


        //We can also make the program add all our numbers in our array together, and then make it divide it with how many numbers there is in the array.
        int [] numbers = {75, 29, 350, 7, 204, 88, 67};

        int counter = 0;
        int sumOfNumbers = 0;

        for (int i = 0; i < nums.length; i++){
            //Count all numbers over 100
            if (numbers[i] > 100){
                counter++;
            }

            //add up all numbers
            sumOfNumbers = sumOfNumbers + numbers[i];

        }
        System.out.println("Number of values greater than 100: " + counter);
        double mean = (double)sumOfNumbers / numbers.length;
        System.out.println("Mean: " + mean);
    }
}
