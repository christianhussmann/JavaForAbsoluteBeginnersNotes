package schoolNotes.JavaCollections;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.LinkedList;
import java.util.List;

public class Main {
    public static void main(String[] args) {


        //Make a class called PersonManager and another class called Person with id, name and birthDate (datatype: LocalDate). Let the PersonManager hold a List of Person. Make getters and setters for the List. The List must be the generic List interface.
        //
        //Make the PersonManager class a singleton.
        //
        //Make methods on the PersonManager to add either a List of Persons (addPersons) or a single Person (addPerson). Overload the addPersons method to be able to take an arbitrary amount of Persons like this:
        //
        //public void addPersons (Person… p){
        //
        //FIXME: loop through p and add...
        PersonManager personManager = PersonManager.getInstance();

        Person p1 = new Person(1, "Jens", LocalDate.of(1991, 5, 20));
        Person p2 = new Person(2,"Jonas", LocalDate.of(1990, 5, 20));
        Person p3 = new Person(3,"Julian", LocalDate.of(2002, 5, 20));
        Person p4 = new Person(4,"Christian", LocalDate.of(1997, 5, 20));
        Person p5 = new Person(5, "Trine", LocalDate.of(1995, 5, 20));

        personManager.addPersons(p1);
        personManager.addPersons(p2);
        personManager.addPersons(p3);
        personManager.addPersons(p4);
        personManager.addPersons(p5);

        System.out.println("Exercise 1-2");
        for (Person p: personManager.getPersonList()) {
            System.out.println(p);
        }

        System.out.println(" ");
        System.out.println("First person - Exercise 3");
        for (int i = 0; i < 1; i++) {
            System.out.println(personManager.getNextPerson());
        }

        System.out.println(" ");
        System.out.println("Exercise 4");
        for (int i = 0; i < 1; i++) {
            System.out.println(personManager.getNextPerson());
        }

    }

}
