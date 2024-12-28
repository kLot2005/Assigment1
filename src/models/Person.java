package models;
import models.School;
public class Person {

    private String name;
    private String surname;

    private boolean gender = true;
    private int age;


    public Person(String name, String surname, boolean gender, int age){
        this.name = name;
        this.surname = surname;
        this.gender = gender;
        this.age = age;
    }


    @Override
    public String toString() {
        return "Hi, I am " + name + " " + surname + ", a " + age + " years old. " + (gender ? "Male. " : "Female. ");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public boolean isGender() {
        return gender;
    }

    public void setGender(boolean gender) {
        this.gender = gender;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
