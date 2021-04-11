package com.company.fundamentals.methods;

public class PassingAndReturningData {
    public static void main(String[] args) {
        System.out.println(coneVolume(4,5));
    }

    public static double coneVolume(double radius, double height){
        return Math.PI * radius * radius * height / 3;
    }
}
