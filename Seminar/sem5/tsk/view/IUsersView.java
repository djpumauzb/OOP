package Seminar.sem5.tsk.view;

import java.util.List;

import Seminar.sem5.tsk.model.User;

public interface IUsersView<T extends User> {

    public void printOnConsole(T user);

    public void printOnConsoleArray(List<T> user);

}
