import models.School;
import models.Student;
import models.Teacher;
import utils.FileScanerUtil;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.List;


public class Main {
    public static void main(String[] args) throws FileNotFoundException {

        School school = new School("school");
        List<Student> students = FileScanerUtil.loadStudents();
        List<Teacher> teachers = FileScanerUtil.loadTeachers();
//надо исправить
        for (Student student : students) {
            school.addPerson(student);
            double gpa = student.calculateGpa();
            System.out.println(student.getName() + " " + gpa);
        }

        for (Teacher teacher : teachers) {
            school.addPerson(teacher);
            if (teacher.getYearsOfExperience() > 10){
                teacher.giveRaise(10);
            }
        }

        System.out.println(school);

    }
}
