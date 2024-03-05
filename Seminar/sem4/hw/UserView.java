package Seminar.sem4.hw;

import java.util.List;

public interface UserView<T extends User> {
    void sendOnConsole(List<T> list);
}
