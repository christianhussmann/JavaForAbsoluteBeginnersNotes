package com.company.fundamentals.methods;

public class PassingDataToMethods {

    public static void main(String[] args) {
        int awesomeFuckingNumber;
        String awesomeName;
        String awesomeAbility;
        awesomeFuckingNumber = 69;
        awesomeName = "Christian";
        awesomeAbility = "Coding Java";
        testForPassingData(awesomeFuckingNumber, awesomeName, awesomeAbility);
    }

    public static void testForPassingData(int awesomeNumber, String awesomeName, String awesomeAbility){
        System.out.println("A awesome number is: " + awesomeNumber + "\tMy name is:\t" + awesomeName + "\tMy awesome ability is: " + awesomeAbility);

    }
}
