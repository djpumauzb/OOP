package Seminar.sem5.hw.service;

import java.util.ArrayList;
import java.util.List;

import Seminar.sem5.hw.model.User;
import Seminar.sem5.hw.model.Student;
import Seminar.sem5.hw.model.Teacher;
import Seminar.sem5.hw.model.TypeUser;

public class DataService {
    List<User> users = new ArrayList<>();

    public void create(String firstName, String secondName, String lastName, Integer dateOfBirth, TypeUser type) {
        int id = getFreeId(type);
        if (type == TypeUser.STUDENT) {
            Student student = new Student(firstName, secondName, lastName, dateOfBirth, id);
            users.add(student);
        } else if (type == TypeUser.TEACHER) {
            Teacher teacher = new Teacher(firstName, secondName, lastName, dateOfBirth, id);
            users.add(teacher);
        }
    }

    private int getFreeId(TypeUser typeUser) {
        for (int i = users.size() - 1; i >= 0; i--) {
            User user = users.get(i);
            if (user instanceof Student && typeUser == TypeUser.STUDENT)
                return ((Student) user).getStudentId() + 1;
            if (user instanceof Teacher && typeUser == TypeUser.TEACHER)
                return ((Teacher) user).getTeacherId() + 1;
        }
        return 1;
    }

    public List<Student> getAllStudents() {
        List<Student> students = new ArrayList<>();
        for (User user : users) {
            if (user instanceof Student)
                students.add((Student) (user));
        }
        return students;
    }

    public List<Student> getStudentListById(List<Integer> id) {
        List<Student> students = new ArrayList<>();
        for (Student student : getAllStudents()) {
            for (Integer i : id) {
                if (student.getStudentId() == i) {
                    students.add(student);
                }
            }
        }
        return students;
    }

    public List<Teacher> getTeacherList() {
        List<Teacher> studentList = new ArrayList<>();
        for (User user : users) {
            if (user instanceof Teacher) {
                studentList.add((Teacher) user);
            }
        }
        return studentList;
    }

    public Teacher getTeacherById(Integer teacherId, List<Teacher> teachers) {
        for (Teacher teacher : teachers) {
            if (teacherId.equals(teacher.getTeacherId())) {
                return teacher;
            }
        }
        return null;
    }

    public List<User> getUsers() {
        return users;
    }

}
