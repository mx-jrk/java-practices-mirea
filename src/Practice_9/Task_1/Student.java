package Practice_9.Task_1;

import java.util.Arrays;

public class Student {
    private int iDNumber;
    private String name;

    private int GPA;

    public Student(int iDNumber, String name, int GPA) {
        this.iDNumber = iDNumber;
        this.name = name;
        this.GPA = GPA;
    }

    public int getGPA() {
        return GPA;
    }

    public int getIDNumber() {
        return iDNumber;
    }

    public String getName() {
        return name;
    }

    public static void insertionSort(Student[] students) {
        int n = students.length;

        for (int i = 1; i < n; i++) {
            Student key = students[i];
            int j = i - 1;

            while (j >= 0 && students[j].getIDNumber() > key.getIDNumber()) {
                students[j + 1] = students[j];
                j = j - 1;
            }

            students[j + 1] = key;
        }
    }

    public static void main(String[] args) {
        Student[] students = {
                new Student(3, "Alice", 5),
                new Student(1, "Bob", 3),
                new Student(2, "Charlie", 4),
        };

        for (Student student : students) {
            System.out.println("ID: " + student.getIDNumber() + ", Name: " + student.getName());
        }

        insertionSort(students);

        System.out.println();

        for (Student student : students) {
            System.out.println("ID: " + student.getIDNumber() + ", Name: " + student.getName());
        }
    }
}
