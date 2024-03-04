package Seminar.sem3.hw;

import java.util.Iterator;
import java.util.List;

public class StudentGroupIterator implements Iterator<Student> {
    private List<Student> studentList;
    int index = 0;

    public StudentGroupIterator(StudentGroup studentGroup) {
        this.studentList = studentGroup.getStudentList();
    }

    public boolean hasNext() {
        return index < studentList.size();
    }

    public Student next() {
        if (!hasNext())
            return null;
        return studentList.get(index++);
    }

    public void remove() {
        studentList.remove(--index);
        index = 0;
    }
}
