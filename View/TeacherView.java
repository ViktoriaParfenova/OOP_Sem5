package View;

import Controller.Controller;

public class TeacherView {
    protected Controller controller;
    public TeacherView(Controller controller){
        this.controller = controller;
    }
    public void readTeacher(){
        System.out.println(controller.Read("teacher"));
    }

    @Override
    public String toString() {
        return "TeacherView{" +
                "controller=" + controller +
                '}';
    }
}
