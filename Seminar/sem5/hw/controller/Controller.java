package Seminar.sem5.hw.controller;

import Seminar.sem5.hw.view.StudentView;
import Seminar.sem5.hw.view.StudyGroupView;
import Seminar.sem5.hw.model.Student;
import Seminar.sem5.hw.model.Teacher;
import Seminar.sem5.hw.model.TypeUser;
import Seminar.sem5.hw.model.User;
import Seminar.sem5.hw.service.DataService;
import Seminar.sem5.hw.service.StudyGroupService;

import java.util.List;

public class Controller {
    private final DataService dataService = new DataService();
    private final StudentView studentView = new StudentView();
    private final StudyGroupView groupView = new StudyGroupView();
    private final StudyGroupService groupService = new StudyGroupService();

    public void createStudent(String firstName, String secondName, String lastName, Integer dateOfBirth) {
        dataService.create(firstName, secondName, lastName, dateOfBirth, TypeUser.STUDENT);
    }

    public void createTeacher(String firstName, String secondName, String lastName, Integer dateOfBirth) {
        dataService.create(firstName, secondName, lastName, dateOfBirth, TypeUser.TEACHER);
    }

    public void createStudyGroup(Integer teacherId, List<Integer> studentId) {
        Teacher teacher = dataService.getTeacherById(teacherId, dataService.getTeacherList());
        List<Student> students = dataService.getStudentListById(studentId);
        groupService.createStudyGroup(teacher, students);
    }

    public void printAllUsers() {
        for (User user : dataService.getUsers()) {
            System.out.println(user);
        }
    }

    public void printAllStudents() {
        List<Student> studentList = dataService.getAllStudents();
        for (Student student : studentList) {
            studentView.printOnConsole((Student) student);
        }
    }

    public void getStudyGroup() {
        groupView.printOnConsole(groupService.getStudyGroup());
    }
}
