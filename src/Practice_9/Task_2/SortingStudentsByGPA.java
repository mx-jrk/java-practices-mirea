package Practice_9.Task_2;

import Practice_9.Task_1.Student;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class SortingStudentsByGPA implements Comparator<Student> {
    @Override
    public int compare(Student student1, Student student2) {
        return Integer.compare(student2.getGPA(), student1.getGPA());
    }

    public static void main(String[] args) {
        List<Student> students = new ArrayList<>();
        students.add(new Student(3, "Alice", 5));
        students.add(new Student(1, "Bob", 3));
        students.add(new Student(2, "Charlie", 4));

        Collections.sort(students, new SortingStudentsByGPA());

        for (Student student : students) {
            System.out.println("Name: " + student.getName() + ", GPA: " + student.getGPA());
        }
    }
}
