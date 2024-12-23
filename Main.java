import Controller.Controller;
import Data.Student;
import Data.Teacher;
import View.StudentView;
import View.TeacherView;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Student student1 = new Student("Иванов", 25, "Москва", 0, 5);
        Student student2 = new Student("Сидоров", 25, "Москва", 1, 4);
        Teacher teacher1 = new Teacher("Петров", 53, "Москва", 0, new ArrayList<>(List.of("Математика")));
        Teacher teacher2 = new Teacher("Cоколов", 60, "Москва", 1, new ArrayList<>(List.of("Информатика")));


        Controller controller = new Controller();
        controller.Create(student1);
        controller.Create(student2);
        controller.Create(teacher1);
        controller.Create(teacher2);


        System.out.println("--------------------");
        StudentView studentView = new StudentView(controller);
        studentView.readStudent();
        TeacherView teacherView = new TeacherView(controller);
        teacherView.readTeacher();

    }
}