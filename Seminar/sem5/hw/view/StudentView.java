package Seminar.sem5.hw.view;

import java.util.List;

import Seminar.sem5.hw.model.Student;


public class StudentView implements IUsersView<Student> {

    @Override
    public void printOnConsole(Student user) {
        System.out.println(user);
    }

    @Override
    public void printOnConsoleArray(List<Student> users) {
        for (Student student : users) {
            System.out.println(student);
        }
    }    
}
