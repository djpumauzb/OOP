package Seminar.sem3.tsk2_iterable;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        Student student1 = new Student(4, "Arsen", "Arsenev", "Arsenovich");
        Student student2 = new Student(4, "Bobr", "Curwa", "Yaperdoz");
        Student student3 = new Student(4, "Chipi", "Chipi", "Chapa");
        Student student4 = new Student(4, "Petr", "Kalashnikov", "Vladislavovich");

        List<Student> studentList = new ArrayList<>();

        StudentGroup studentGroup = new StudentGroup(studentList);
        studentGroup.addStudent(student1);
        studentGroup.addStudent(student2);
        studentGroup.addStudent(student3);
        studentGroup.addStudent(student4);

        for (Student student : studentGroup) {
            System.out.println(student);
        }
    }
}
