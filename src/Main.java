import models.Person;
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
        school.setMembers(FileScanerUtil.loadData());

        System.out.println("+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");
        System.out.println("Тест метода giveRaise(): ");
        for (Person person : school.getMembers()) {
            if (person instanceof Teacher teacher) {
                if (teacher.getYearsOfExperience() > 10){
                    System.out.print(teacher.getName() + " зарплата было: " + teacher.getSalary());
                    teacher.giveRaise(10);
                    System.out.println(", зарплата стало: " + teacher.getSalary());
                }
            }
        };
        System.out.println("+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");

        System.out.println("Тест метода calculateGpa(): ");
        for ( Person person : school.getMembers()) {
            if (person instanceof Student student) {
                System.out.println(student.getName() + "'s GPA: " + student.calculateGpa());

            }
        }
        System.out.println("+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");
        System.out.println("Список: ");
        System.out.println(school);
    }
}
