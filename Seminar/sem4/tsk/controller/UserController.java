package Seminar.sem4.tsk.controller;

import java.time.LocalDate;

import Seminar.sem4.tsk.data.User;

public interface UserController<T extends User>{
    void create(String firstName, String secondName, String patronymic, LocalDate dateOfBirth);
}
