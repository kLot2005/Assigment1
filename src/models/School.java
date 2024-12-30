package models;

import java.util.ArrayList;
import java.util.List;

public class School {
    private List<Person> members;
    private String name;

    public School(String name) {
        this.name = name;
        members = new ArrayList<>();
    }

    public void addPerson(Person person) {
        members.add(person);
    }

    public List<Person> getMembers() {
        return members;
    }

    public void setMembers(List<Person> members) {
        this.members = members;
    }

    @Override
    public String toString() {
        StringBuilder result = new StringBuilder();
        for (Person member : members) {
            result.append(member.toString()).append("\n");
        }
        return result.toString();
    }

}
