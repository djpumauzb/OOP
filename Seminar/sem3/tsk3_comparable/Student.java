package Seminar.sem3.tsk3_comparable;

public class Student implements Comparable<Student> {
    public Integer studentId;

    public String firstName;

    public String secondName;

    public String lastName;

    public Student(Integer studentId, String firstName, String secondName, String lastName) {
        this.studentId = studentId;
        this.firstName = firstName;
        this.secondName = secondName;
        this.lastName = lastName;
    }

    @Override
    public String toString() {
        return "Student [studentId=" + studentId +
                ", firstName=" + firstName +
                ", secondName=" + secondName +
                ", lastName=" + lastName +
                "]";
    }

    @Override
    public int compareTo(Student o) {
        //return Integer.compare(this.studentId, o.studentId);
        return studentId.compareTo(o.studentId); // even better way obj type supports CompareTo()
    }

}
