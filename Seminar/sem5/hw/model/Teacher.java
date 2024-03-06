package Seminar.sem5.hw.model;

public class Teacher extends User {

    private int teacherId;

    public Teacher(String firstName, String secondName, String lastName, Integer dateOfBirth, Integer teacherId) {
        super(firstName, secondName, lastName, dateOfBirth);
        this.teacherId = teacherId;
    }

    public int getTeacherId() {
        return teacherId;
    }

    @Override
    public String toString() {
        return "Teacher [teacherId=" + teacherId + " " + super.toString() + "]";
    }

}
