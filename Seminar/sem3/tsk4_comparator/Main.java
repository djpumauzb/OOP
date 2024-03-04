package Seminar.sem3.tsk4_comparator;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        Student student1 = new Student(4, "Arsen", "Arsenev", "Arsenovich");
        Student student2 = new Student(2, "Bobr", "Curwa", "Yaperdoz");
        Student student3 = new Student(3, "Chipi", "Chipi", "Chapa");
        Student student4 = new Student(1, "Petr", "Kalashnikov", "Vladislavovich");

        List<Student> studentList = new ArrayList<>();

        StudentGroup studentGroup = new StudentGroup(studentList);
        studentGroup.addStudent(student1);
        studentGroup.addStudent(student2);
        studentGroup.addStudent(student3);
        studentGroup.addStudent(student4);

        System.out.println();

        StudentGroupService service = new StudentGroupService(studentGroup);
        for (Student student : studentGroup) {
            System.out.println(student);
        }

        for (Student st : service.getSortedStudentGroup()) {
            System.out.println(st);
        }

        System.out.println();

        for (Student st : service.getSortedStudentGroup()) {
            System.out.println(st);
        }
    }
}
