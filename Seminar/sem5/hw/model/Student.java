package Seminar.sem5.hw.model;

public class Student extends User {

    private int studentId;

    public Student(String firstName, String secondName, String lastName, Integer dateOfBirth, Integer studentId) {
        super(firstName, secondName, lastName, dateOfBirth);
        this.studentId = studentId;
    }

    public int getStudentId() {
        return studentId;
    }

    @Override
    public String toString() {
        return "Student [studentId=" + studentId + " " + super.toString() + "]";
    }
}
