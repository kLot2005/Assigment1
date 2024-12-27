package models;

import java.util.ArrayList;
import java.util.List;


public class Student extends Person {
    private static int id;
    private int studentID = id++;

    private List<Integer> grades = new ArrayList<>();

    public Student(String name, String surname, int age, boolean gender, List<Integer> grades) {
        super(name, surname, gender, age);
        this.grades = grades;
    }

    public void addGrade(int grade) {
        grades.add(grade);
    }

    public double calculateGpa() {
        double sum = 0;
        for (Integer grade : grades) {
            sum += grade;
        }
        return sum / grades.size();
    }



    @Override
    public String toString() {
        return super.toString() + "I am a student with ID " + studentID + ".";

    }
}



