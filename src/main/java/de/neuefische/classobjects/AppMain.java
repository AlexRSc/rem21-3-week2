package de.neuefische.classobjects;

import de.neuefische.classobjects.model.Student;

public class AppMain {
    public static void main(String[] args) {
        Student student = new Student("Peter", "Lustig", 1);
        System.out.println(student.getFirstName() + " " + student.getLastName() + " " + student.getId());
        String studentOutput = student.toString();
        System.out.println(studentOutput);
        Student student2 = new Student("blub", "blib", 200);
        studentOutput = student2.toString();
        System.out.println(studentOutput);
        }

    }

