package Seminar.sem4.tsk.view;

import java.util.List;

import Seminar.sem4.tsk.data.User;

public interface UserView<T extends User>{
    void sendOnConsole(List<T> list);
}
