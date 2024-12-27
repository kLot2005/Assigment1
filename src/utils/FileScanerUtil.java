package utils;
import models.Student;
import models.Teacher;

import java.io.File;
import java.io.FileNotFoundException;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class FileScanerUtil {

    public static List<Student> loadStudents() throws FileNotFoundException {

        File file = new File("src/student.txt");
        Scanner scanner = new Scanner(file);
        List<Student> students = new ArrayList<>();

        while (scanner.hasNext()) {

            String name = scanner.next();
            String surname = scanner.next();
            int age = scanner.nextInt();
            boolean gender = scanner.next().equals("Male");

            List<Integer> grades = new ArrayList<>();

            for (String grade : scanner.nextLine().split(" ")) {
                if (grade.equalsIgnoreCase("")){
                    continue;
                }
                grades.add(Integer.parseInt(grade));
            }

            Student student = new Student(
                    name, surname, age, gender, grades
            );
            students.add(student);
        }
    scanner.close();
    return students;
    };

    public static List<Teacher> loadTeachers() throws FileNotFoundException {

        File file = new File("src/teachers.txt");
        Scanner scanner = new Scanner(file);
        List<Teacher> teachers = new ArrayList<>();

        while (scanner.hasNext()) {

            String name = scanner.next();
            String surname = scanner.next();
            int age = scanner.nextInt();
            boolean gender = scanner.next().equals("Male");

            String subject = scanner.next();
            int yearsOfExperience = scanner.nextInt();
            int salary = scanner.nextInt();

            Teacher teacher = new Teacher(name, surname, age, gender, subject, yearsOfExperience, salary);
            teachers.add(teacher);
        }
        scanner.close();
        return teachers;
    }


}
