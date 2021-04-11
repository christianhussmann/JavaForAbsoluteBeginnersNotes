package oop.composition;

public class Student {

    private String name;
    private  String dateOfBirth;
    private boolean hasStudentHousing;
    private Course course;


    public String getName() {
        return name;
    }

    public Course getCourse() {
        return course;
    }

    public void setCourse(Course course) {
        this.course = course;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(String dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public boolean hasStudentHousing() {
        return hasStudentHousing;
    }

    public void hasStudentHousing(boolean hasStudentHousing) {
        this.hasStudentHousing = hasStudentHousing;
    }
}
