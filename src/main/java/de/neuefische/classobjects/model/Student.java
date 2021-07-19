package de.neuefische.classobjects.model;

import java.util.Objects;

public class Student {
    private String firstName;
    private String lastName;
    private int id;
    public Student(String firstName, String lastName, int id){
        setFirstName(firstName);
        setLastName(lastName);
        setId(id);
    }

    public String getFirstName() {
        return firstName;
    }
    public void setFirstName(String firstName){
        this.firstName=firstName;
    }
    public String getLastName()  {
        return lastName;
    }
    public void setLastName(String lastName) {
        this.lastName=lastName;
    }
    public int getId() {
        return id;
    }
    public void setId(int id){
        this.id=id;
    }
    @Override
    public String toString(){
        String studentString = firstName + " " + lastName + " " + id;
        return studentString;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return id == student.id && firstName.equals(student.firstName) && lastName.equals(student.lastName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(firstName, lastName, id);
    }
}
