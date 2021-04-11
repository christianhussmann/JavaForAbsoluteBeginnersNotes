package oop.dataStuctures;

public class Main {
    public static void main(String[] args) {
        Employee emp = new Employee();
        Employee emp2 = new Employee();
        Employee emp3 = new Employee();

        emp.name = "Jeff";
        emp.age = 32;
        emp.jobTitle = "Construction Worker";

        emp2.name = "Sarah";
        emp2.age = 28;
        emp2.jobTitle = "IT Specialist";

        emp3.name = "Bill";
        emp3.age = 37;
        emp3.jobTitle = "Project Manager";

        bar(emp3);

    }

    static void bar (Employee e){
        System.out.println(e.name + " is " + e.age + " Years old and is a " + e.jobTitle);
    }
}
