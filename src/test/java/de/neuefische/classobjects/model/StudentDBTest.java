package de.neuefische.classobjects.model;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StudentDBTest {

    @Test
    @DisplayName("Testing Listing Items")
    public void checkListStudents() {
        //GIVEN
        Student[] studentarray= new Student[3];
        studentarray[0]=new Student("pew", "pow", 2);
        studentarray[1]=new Student("Har", "Hur", 3);
        studentarray[2]=new Student("uff", "ouf", 4);
        StudentDB database = new StudentDB(studentarray);
        //WHEN
        Student[] compare = database.list();
        boolean compareFirstArray = compare[0].equals(studentarray[0]);
        boolean compareSecondArray =compare[1].equals(studentarray[1]);
        boolean compareThirdArray =compare[2].equals(studentarray[2]);
        //THEN
        assertTrue(compareFirstArray&&compareSecondArray&&compareThirdArray);
    }

    @Test
    @DisplayName("Testing String return of all Students")
    public void checktoString() {
        //GIVEN
        Student[] studentarray= new Student[3];
        studentarray[0]=new Student("pew", "pow", 2);
        studentarray[1]=new Student("Har", "Hur", 3);
        studentarray[2]=new Student("uff", "ouf", 4);
        StudentDB database = new StudentDB(studentarray);
        //WHEN
        String compare = database.toString();
        String result= "pew pow 2\nHar Hur 3\nuff ouf 4\n";
        //THEN
        assertEquals(result, compare);
    }

}