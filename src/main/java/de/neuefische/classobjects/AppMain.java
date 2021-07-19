package de.neuefische.classobjects;

public class AppMain {
    public static void main(String[] args) {
        Student student = new Student("Peter", "Lustig", 1);
        System.out.println(student.getFirstName()+" "+student.getLastName()+" "+student.getId());
    }
}
