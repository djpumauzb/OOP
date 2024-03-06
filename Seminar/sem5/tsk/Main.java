package Seminar.sem5.tsk;

import Seminar.sem5.tsk.controller.Controller;

public class Main {
    public static void main(String[] args) {
        Controller controller = new Controller();
        controller.createStudent("Arsenev", "Arsen", "Arsenovich");
        controller.createStudent("Berejnev", "Vadim", "Chushpanskiy");
        
        controller.getAllStudents();

        controller.createStudent("Berejnev", "Vadim", "Chushpanskiy");
        controller.createStudent("Berejnev", "Vadim", "Chushpanskiy");
    }
}
