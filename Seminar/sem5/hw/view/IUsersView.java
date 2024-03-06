package Seminar.sem5.hw.view;

import java.util.List;

import Seminar.sem5.hw.model.User;

public interface IUsersView<T extends User> {

    public void printOnConsole(T user);

    public void printOnConsoleArray(List<T> user);

}
