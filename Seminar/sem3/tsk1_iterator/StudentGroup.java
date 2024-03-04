package Seminar.sem3.tsk1_iterator;

import java.util.List;

public class StudentGroup {
    List<Student> studentList;

    public StudentGroup(List<Student> studentList) {
        this.studentList = studentList;
    }

    public void addStudent(Student student) {
        studentList.add(student);
    }
}