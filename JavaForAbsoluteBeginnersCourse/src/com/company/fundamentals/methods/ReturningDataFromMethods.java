package com.company.fundamentals.methods;

public class ReturningDataFromMethods {
    public static void main(String[] args) {
        foo(3);
        System.out.println(bar());
    }

    public static void foo(int a) {
        if (a < 5){
            return;
        }
        System.out.println(a);
    }

    public static double bar() {
        return 69;
    }
}
