package oop.composition;

public class Main {
    public static void main(String[] args) {
        Student student = new Student();
        student.setName("Joe Bidden");
        student.setDateOfBirth("20/05/1997");
        student.hasStudentHousing(true);
        student.setCourse(new Course());
        /*
        student.getCourse().setTitle("Computer Science");
        student.getCourse().setLevel("Undergraduate");
        student.getCourse().setStartDate("07/09/2021");
        */

        //Instead of the written code above we can do like this instead.
        Course c = student.getCourse();
        c.setTitle("Computer Science");
        c.setLevel("Undergraduate");
        c.setStartDate("07/09/2021");


        System.out.println("Name: " + student.getName());
        System.out.println("Date of birth: " + student.getDateOfBirth());
        System.out.println("Housing: " + (student.hasStudentHousing() ? "yes" : "no"));
        System.out.println("The student: " + student.getName() + "is enrolled on the " + student.getCourse().getTitle() + "course due to start on " + student.getCourse().getStartDate());
    }
}

