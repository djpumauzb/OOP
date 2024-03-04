package Seminar.sem3.tsk3_comparable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class StudentGroupService {
    StudentGroup studentGroup;

    public StudentGroupService(StudentGroup studentGroup) {
        this.studentGroup = studentGroup;
    }

    public List<Student> getSortedStudentGroup() {
        List<Student> studentList = new ArrayList<>(studentGroup.studentList); // sortiravat ssilko na sort comparable
        Collections.sort(studentList);
        return studentList;
    }
}
