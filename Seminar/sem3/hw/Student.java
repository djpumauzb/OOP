package Seminar.sem3.hw;

public class Student implements Comparable<Student> {
    public Long studentId;
    protected String firstName;
    protected String secondName;
    protected String lastName;

    public Student(Long studentId, String firstName, String secondName, String lastName) {
        this.studentId = studentId;
        this.firstName = firstName;
        this.secondName = secondName;
        this.lastName = lastName;
    }

    @Override
    public String toString() {
        return "StudentID" +
                studentId +
                ": " + firstName +
                " " + secondName +
                " " + lastName;
    }

    @Override
    public int compareTo(Student o) {
        if (this.studentId > o.studentId)
            return 1;
        else if (this.studentId < o.studentId)
            return -1;
        else
            return 0;
        //return this.studentId.compareTo(o.studentId);
    }
}
