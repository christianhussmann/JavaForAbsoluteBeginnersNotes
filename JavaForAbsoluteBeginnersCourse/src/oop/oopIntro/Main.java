package oop.oopIntro;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Thing thing = new Thing();
        thing.num = 5;
        thing.word = "Hello";

        Thing thing2 = new Thing();
        thing2.num = 21;
        thing2.word = "whatever";

        System.out.println(thing.num + thing2.num);

        thing.foo();
        thing2.foo();
    }

}
