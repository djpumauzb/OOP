package Seminar.sem5.hw.service;

import java.util.List;

import Seminar.sem5.hw.model.Student;
import Seminar.sem5.hw.model.StudyGroup;
import Seminar.sem5.hw.model.Teacher;

public class StudyGroupService {

    private StudyGroup studyGroup;

    public void createStudyGroup(Teacher teacher, List<Student> students) {
        this.studyGroup = new StudyGroup(teacher, students);
    }

    public StudyGroup getStudyGroup() {
        return studyGroup;
    }
}
