package Practice_9.Task_3;

import Practice_9.Task_1.Student;
import Practice_9.Task_2.SortingStudentsByGPA;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class MergeStudentsLists {
    public static List<Student> mergeSortedLists(List<Student> list1, List<Student> list2) {
        List<Student> mergedList = new ArrayList<>();

        int i = 0;
        int j = 0;

        while (i < list1.size() && j < list2.size()) {
            Student student1 = list1.get(i);
            Student student2 = list2.get(j);

            if (student1.getGPA() > student2.getGPA()) {
                mergedList.add(student1);
                i++;
            } else {
                mergedList.add(student2);
                j++;
            }
        }

        while (i < list1.size()) {
            mergedList.add(list1.get(i));
            i++;
        }

        while (j < list2.size()) {
            mergedList.add(list2.get(j));
            j++;
        }

        return mergedList;
    }

    public static void main(String[] args) {
        List<Student> list1 = new ArrayList<>();
        list1.add(new Student(3, "Alice", 5));
        list1.add(new Student(1, "Bob", 3));
        list1.add(new Student(2, "Charlie", 4));

        List<Student> list2 = new ArrayList<>();
        list2.add(new Student(3, "Tom", 5));
        list2.add(new Student(1, "John", 3));

        Collections.sort(list1, new SortingStudentsByGPA());
        Collections.sort(list2, new SortingStudentsByGPA());

        List<Student> mergedList = mergeSortedLists(list1, list2);

        for (Student student : mergedList) {
            System.out.println("Name: " + student.getName() + ", GPA: " + student.getGPA());
        }
    }
}
