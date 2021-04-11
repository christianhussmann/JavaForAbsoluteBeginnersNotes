package com.company.fundamentals.methods;

public class ClassAndStaticMembers {

    static int x = 5;

    public static void main(String[] args) {

        System.out.println(x);
        foot();
        head();

    }

    public static void foot(){
        System.out.println(x);
        x = 20;
    }

    public static void head(){
        System.out.println(x);
    }
}
