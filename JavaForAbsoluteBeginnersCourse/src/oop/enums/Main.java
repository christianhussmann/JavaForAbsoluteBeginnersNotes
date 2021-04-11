package oop.enums;


public class Main {
    public static void main(String[] args) {

        whichSeason(Month.AUGUST);
    }
    public static void whichSeason(Month month){
        switch (month){
            case DECEMBER, JANURARY, FEBUARY:
                System.out.printf("%s is in the winter season.\n", month);
                break;
            case MARCH, APRIL, MAY:
                System.out.printf("%s is in the spring season.\n", month);
                break;
            case JUNY, JULY, AUGUST:
                System.out.printf("%s is in the summer season.\n", month);
                break;
            case SEPTEMBER, OKTOBER, NOVEMBER:
                System.out.printf("%s is in the autumn season.\n", month);
                break;

        }
    }
}
