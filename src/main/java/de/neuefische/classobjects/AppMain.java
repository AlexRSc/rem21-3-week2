package de.neuefische.classobjects;

import de.neuefische.classobjects.model.Student;
import de.neuefische.classobjects.model.StudentDB;

public class AppMain {
    public static void main(String[] args) {
        Student student = new Student("Peter", "Lustig", 1);
        Student[] studentarray= new Student[3];
        studentarray[0]=new Student("pew", "pow", 2);
        studentarray[1]=new Student("Har", "Hur", 3);
        studentarray[2]=new Student("uff", "ouf", 4);
        StudentDB database = new StudentDB(studentarray);
        database.list();
    }

    }

