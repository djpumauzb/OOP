package Seminar.sem5.tsk.controller;

import Seminar.sem5.tsk.view.StudentView;
import Seminar.sem5.tsk.model.TypeUser;
import Seminar.sem5.tsk.service.DataService;

public class Controller {
    DataService dataService = new DataService();

    StudentView studentView = new StudentView();

    public void createStudent(String firstName, String secondName, String lastName) {
        dataService.create(firstName, secondName, lastName, TypeUser.STUDENT);
    }

    public void getAllStudents() {
        studentView.printOnConsoleArray(dataService.getAllStudents());
    }
}
