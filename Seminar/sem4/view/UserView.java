package Seminar.sem4.view;

import Seminar.sem4.data.User;

import java.util.List;

public interface UserView<T extends User>{
    void sendOnConsole(List<T> list);
}
