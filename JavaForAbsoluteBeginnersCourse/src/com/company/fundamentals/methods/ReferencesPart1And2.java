package com.company.fundamentals.methods;

public class ReferencesPart1And2 {
    public static void main(String[] args) {
        int a = 10;
        int b = a;
        b = 20;

        int[] x = {3, 22, 4, 16, 8};

        int[] d = foo(x);
        d[4] = 35;

        System.out.println("a = " + a);
        System.out.println("b = " + b);

        System.out.println();

        for ( int i = 0; i < x.length; i++){
            System.out.println("x[" + i + "] = " + x[i]);
        }
    }

    public static int[] foo(int[] c){
        return c;
    }
}
