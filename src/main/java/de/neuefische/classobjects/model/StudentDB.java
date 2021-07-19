package de.neuefische.classobjects.model;

public class StudentDB {
    private Student[] students;

    public StudentDB(Student[] students) {
    this.students=students;}

    public Student[] list() {
        for (int i=0; i<students.length; i++){
            System.out.println(students[i].getFirstName() + " "+ students[i].getLastName()
            + " " + students[i].getId());
        }
        return students;
    }

    public String toString() {
        String studentArrayString = "";
        for (int i = 0; i < students.length; i++) {
            studentArrayString += (String) students[i].getFirstName() + " "
                    + students[i].getLastName() + " " + students[i].getId()+ "\n";
        }
        return studentArrayString;
    }
}
