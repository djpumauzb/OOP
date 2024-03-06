package Seminar.sem5.hw;

import java.util.ArrayList;
import java.util.Arrays;

import Seminar.sem5.hw.controller.Controller;

public class Main {
    public static void main(String[] args) {
        Controller controller = new Controller();

        controller.createStudent("11", "22", "33", 1900);
        controller.createStudent("22", "22", "33", 1900);
        controller.createStudent("33", "22", "33", 1900);

        controller.printAllStudents();

        controller.createTeacher("aaa", "zzz", "qqq", 1850);

        controller.printAllUsers();

        controller.createStudyGroup(1, new ArrayList<>(Arrays.asList(1, 2)));

        controller.getStudyGroup();
    }
}
