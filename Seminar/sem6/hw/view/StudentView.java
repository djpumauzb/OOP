package Seminar.sem6.hw.view;

import java.util.List;
import java.util.logging.Logger;

import Seminar.sem4.tsk.data.Student;
import Seminar.sem4.tsk.data.StudentGroup;

public class StudentView implements UserView<Student>{

    Logger logger = Logger.getLogger(StudentView.class.getName());

    @Override
    public void sendOnConsole(List<Student> students) {
        for(Student user: students){
            logger.info(user.toString());
        }
    }

    public void sendOnConsoleUserGroup(StudentGroup studentGroup){
        logger.info(studentGroup.toString());
    }

}
