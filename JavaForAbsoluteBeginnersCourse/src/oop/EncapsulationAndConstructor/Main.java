package oop.EncapsulationAndConstructor;

public class Main {
    public static void main(String[] args) {
        Rectangle r1 = new Rectangle(7,9);
        r1.setHeight (5);
        r1.setWidth(9);
        r1.printArea();

        Rectangle r2 = new Rectangle(8,4);
        r2.setHeight(8);
        r2.setWidth (4);
        r2.printArea();

        System.out.println(r1.getHeight() + ", " + r1.getWidth());
        System.out.println(r1.getHeight() + ", " + r2.getWidth());

    }
}
