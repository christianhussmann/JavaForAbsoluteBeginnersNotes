package com.company.fundamentals.guestListProgram;

import java.util.Scanner;

public class SimpleGuestListProgram {
    static String[] guests = new String[10];
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {


        insertTestNames();

        do {
            displayGuests();
            displayMenu();
            int option = getOption();

            if (option == 1) {
                addGuest();

            }
            else if (option == 2){
                insertGuest();
            }

            else if (option == 3){
                renameGuest();
            }
            else if (option == 4) {
                removeGuest();


            } else if (option == 5) {
                System.out.println("Exiting...");
                break;
            }
        } while (true);
    }

    static void displayGuests() {
        System.out.println("_________________________________________________________________\n - Guests -\n");
        boolean isEmpty = true;
        for (int i = 0; i < guests.length; i++) {
            // condition ? a : b
            if (guests[i] != null) {
                System.out.println((i + 1) + ". " + guests[i]);
                isEmpty = false;
            }
        }
        if (isEmpty) {
            System.out.println("Guest list is empty.");
        }
    }

    static void displayMenu() {
        System.out.println("_________________________________________________________________\n - Menu -\n");
        System.out.println();
        System.out.println("1 - Add Guest");
        System.out.println("2 - Insert Guest");
        System.out.println("3 - Rename Guest");
        System.out.println("4 - Remove Guest");
        System.out.println("5 - Exit");

    }

    static int getOption() {
        System.out.print("Option: ");
        int option = scanner.nextInt();
        scanner.nextLine();
        System.out.println();
        return option;
    }

    static void addGuest() {
        for (int i = 0; i < guests.length; i++) {
            if (guests[i] == null) {
                System.out.print("Name: ");
                guests[i] = scanner.nextLine();
                break;
            }
        }
    }

    static void insertGuest(){
        System.out.println("Number: ");
        int number = scanner.nextInt();
        scanner.nextLine();

        if (number >= 1 && number <= 10 && guests[number - 1] != null) {


            System.out.println("Name: ");
            String name = scanner.nextLine();

            for (int i = guests.length - 1; i > number - 1; i--){
                guests[i] = guests[i - 1];
            }

            guests[number - 1] = name;
        } else {
            System.out.println("\nError: there is no guest with that number!");
        }
    }



    static void renameGuest() {
        System.out.println("Number: ");
        int number = scanner.nextInt();
        scanner.nextLine();

        if (number >= 1 && number <= 10 && guests[number - 1] != null) {


            System.out.println("Name: ");
            String name = scanner.nextLine();

            guests[number - 1] = name;
        } else {
            System.out.println("\nError: there is no guest with that number!");
        }
    }


    static void removeGuest() {
        System.out.print("Number: ");
        int number = scanner.nextInt();

        if (number >= 1 && number <= 10 && guests[number - 1] != null) {
            guests[number - 1] = null;

            String[] temporary = new String[guests.length];
            int temporaryIndex = 0;
            for (int i = 0; i < guests.length; i++) {
                if (guests[i] != null) {
                    temporary[temporaryIndex] = guests[i];
                    temporaryIndex++;
                }
            }
            guests = temporary;
        } else {
            System.out.println("\nError: there is no guest with that number!");
        }
    }



    static void insertTestNames(){
        guests[0] = "Jacob";
        guests[1] = "Edward";
        guests[2] = "Rose";
        guests[3] = "Molly";
        guests[4] = "Christopher";
    }
}




