package utils;
import models.Person;
import models.Student;
import models.Teacher;

import java.io.File;
import java.io.FileNotFoundException;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class FileScanerUtil {

    public static List<Person> loadData() throws FileNotFoundException {

        ArrayList<File> data = new ArrayList<>();
        data.add(new File("src/student.txt"));
        data.add(new File("src/teachers.txt"));
        List<Person> persons = new ArrayList<>();

        for (File file : data) {

            if(file.getPath().equals("src\\student.txt")){
                Scanner scanner = new Scanner(file);
                while (scanner.hasNext()) {
                    String name = scanner.next();
                    String surname = scanner.next();
                    int age = scanner.nextInt();
                    boolean gender = scanner.next().equals("Male");

                    List<Integer> grades = new ArrayList<>();
                    while (scanner.hasNextInt()) {
                        grades.add(scanner.nextInt());
                    }

                    Student student = new Student(
                            name, surname, age, gender, grades
                    );

                    persons.add(student);
                }
            }
            else if (file.getPath().equals("src\\teachers.txt")){
                Scanner scanner = new Scanner(file);
                while (scanner.hasNext()) {
                    String name = scanner.next();
                    String surname = scanner.next();
                    int age = scanner.nextInt();
                    boolean gender = scanner.next().equals("Male");


                    String subject = scanner.next();
                    int yearsOfExperience = scanner.nextInt();
                    int salary = scanner.nextInt();

                    Teacher teacher = new Teacher(name, surname, age, gender, subject, yearsOfExperience, salary);
                    persons.add(teacher);
                }
            }

        }

        return persons;
    }


}
