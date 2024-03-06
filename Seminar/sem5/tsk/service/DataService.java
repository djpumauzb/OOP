package Seminar.sem5.tsk.service;

import java.util.ArrayList;
import java.util.List;

import Seminar.sem5.tsk.model.User;
import Seminar.sem5.tsk.model.Student;
import Seminar.sem5.tsk.model.Teacher;
import Seminar.sem5.tsk.model.TypeUser;

public class DataService {
    List<User> users = new ArrayList<>();

    public void create(String firstName, String secondName, String lastName, TypeUser type) {
        int id = getFreeId(type);
        if (type == TypeUser.STUDENT)
            users.add(new Student(firstName, secondName, lastName, id));
        else if (type == TypeUser.TAECHER)
            users.add(new Teacher(firstName, secondName, lastName, id));
    }

    private int getFreeId(TypeUser typeUser) {
        for (int i = users.size() - 1; i >= 0; i--) {
            User user = users.get(i);
            if (user instanceof Student && typeUser == TypeUser.STUDENT)
                return ((Student) user).getStudentId() + 1;
            if (user instanceof Teacher && typeUser == TypeUser.TAECHER)
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
}
