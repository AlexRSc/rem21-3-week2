package de.neuefische.classobjects;
import de.neuefische.classobjects.model.Student;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StudentTest {

    @Test
    @DisplayName("Testing set & getFirstName")
    public void checkingSetGetFirstName() {
        //GIVEN
        Student student = new Student("test","testy",1);
        //WHEN
        student.setFirstName("testy");
        String checkString = student.getFirstName();
        //THEN
        assertEquals(checkString, "testy");
    }

    @Test
    @DisplayName("Testing set & getLastName")
    public void checkingSetGetLastName() {
        //GIVEN
        Student student = new Student("test","testy",1);
        //WHEN
        student.setLastName("test");
        String checkString = student.getLastName();
        //THEN
        assertEquals(checkString, "test");
    }

    @Test
    @DisplayName("Testing set & getId")
    public void checkingSetGetId() {
        //GIVEN
        Student student = new Student("test","testy",1);
        //WHEN
        student.setId(5);
        int checkInt = student.getId();
        //THEN
        assertEquals(checkInt, 5);
    }
    @Test
    @DisplayName("Testing String")
    public void checkingToString() {
        //GIVEN
        Student student = new Student("test","testy",1);
        //WHEN
        String testString = student.toString();
        //THEN
        assertEquals(testString, "test testy 1");
    }
}