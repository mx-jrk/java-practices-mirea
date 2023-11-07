package Practice_19.Task_2;

import java.util.ArrayList;

public class SortingStudentsByGPAView {
    public void printArray(ArrayList<Student> Students) {
        for(Student student : Students) {
            System.out.println("Name: " + student.getName());
            System.out.println("Surname: " + student.getSurname());
            System.out.println("iDNumber: " + student.getiDNumber());
            System.out.println("GPA: " + student.getGPA());
            System.out.println();
        }
    }
}
