package com.company.fundamentals.loops;

public class BreakAndContinue {
    //By using the break statement we only allow it to go up to 3, in this example.

    public static void main(String[] args) {
        for (int i = 1; i <= 5; i++) {
            if (i == 4) {
                break;
            }
            System.out.println(i);
        }
    }
}

    //By using the continue statement we allow the program to count up to 2 and then skip number 3 and then continue to count up to 5.

    /* public static void main(String[] args) {
        for (int i = 1; i <= 5; i++) {
            if(i == 4) {
                continue;
            }
            System.out.println(i);
        }

}
     */
