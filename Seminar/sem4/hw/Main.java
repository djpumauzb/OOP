package Seminar.sem4.hw;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        StudentGroup studentGroup = new StudentGroup(new ArrayList<>());
        studentGroup.studentList.add(new Student(2L, "German", "Stanislavovich", "Puzikov"));
        studentGroup.studentList.add(new Student(1L, "Artyom", "Ivanovich", "Garmash"));
        studentGroup.studentList.add(new Student(3L, "Jhon", "Man", "Weak"));
        studentGroup.studentList.add(new Student(5L, "Jhon", "Man", "Weak"));
        studentGroup.studentList.add(new Student(4L, "Jhon", "Man", "Weak"));

        List<Teacher> teacherList = new ArrayList<>();
        teacherList.add(new Teacher(11,"as", "sd", "df"));
        teacherList.add(new Teacher(24,"zx", "xc", "cv"));
        teacherList.add(new Teacher(3,"qw", "we", "er"));
        teacherList.add(new Teacher(4,"ty", "gh", "bn"));

        TeacherService teacherService = new TeacherService();
        TeacherView teacherView = new TeacherView();

        teacherView.sendOnConsole(teacherList);
        System.out.println();
        teacherService.getSortedTeacherList(teacherList);
        teacherView.sendOnConsole(teacherList);
        System.out.println();
        List<Teacher> teacherListSorted = new ArrayList<>(teacherService.getSortedTeacherListFIO(teacherList));
        teacherView.sendOnConsole(teacherListSorted);

       System.out.println(studentGroup.studentList.get(2).compareTo(studentGroup.studentList.get(1)));

       StudentGroupService servise = new StudentGroupService(studentGroup);
       System.out.println("----");
       servise.soutList(studentGroup.studentList);

       System.out.println("----");
       servise.soutList(servise.getSortedStudentGroup());

       System.out.println("----");
       servise.soutList(studentGroup.studentList);

       System.out.println("----");
       servise.soutList(servise.getSortedStudentGroupFIO());
    }
}
