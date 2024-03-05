package Seminar.sem4.hw;

public class Student extends User implements Comparable<Student>{
    private Long studentId;

    public Student(Long studentId, String firstName, String secondName, String lastName) {
        super(firstName, secondName, lastName);
        this.studentId = studentId;
    }

    @Override
    public String toString() {
        return "Student{" +
                "studentId=" + studentId +
                ", firstName='" + firstName + '\'' +
                ", secondName='" + secondName + '\'' +
                ", lastName='" + lastName + '\'' +
                '}';
    }

    @Override
    public int compareTo(Student o) {
        if (this.studentId > o.studentId)
            return 1;
        else if (this.studentId < o.studentId)
            return -1;
        else
            return 0;
    }
}
