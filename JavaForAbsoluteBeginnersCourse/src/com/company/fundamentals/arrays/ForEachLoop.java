package com.company.fundamentals.arrays;

public class ForEachLoop {
    public static void main(String[] args) {
        double[] theArraylist = new double[]{25.92, 1.34, -76.24, 833.11, 76.884};

        //This is done with a for-loop
        /*
        for(int i = 0; i < da.length; i++) {
            double e = da[i];
            System.out.println(e);
        }
        */

        //if we instead want a for-each loop instead we just need to do this instead:
        for(double element : theArraylist) {
            System.out.println(element);
        }
    }
}
