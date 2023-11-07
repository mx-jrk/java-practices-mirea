package Practice_19.Task_2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class SortingStudentsByGPA {
    private ArrayList<Student> iDNumber;

    public ArrayList<Student> getiDNumber() {
        return this.iDNumber;
    }
    public SortingStudentsByGPA() {
        iDNumber = new ArrayList<>();
    }
    public SortingStudentsByGPA(ArrayList<Student> iDNumber) {
        this.iDNumber = iDNumber;
    }

    public void setArray(ArrayList<Student> students) {
        iDNumber = students;
    }

    public void mergeSort() {
        Collections.sort(iDNumber, new Comparator<Student>() {
            @Override
            public int compare(Student student1, Student student2) {
                if (student1.getGPA() > student2.getGPA()) {
                    return -1;
                } else if (student1.getGPA() < student2.getGPA()) {
                    return 1;
                } else {
                    return 0;
                }
            }
        });
    }

    public void quicksort() {
        quicksortHelper(0, iDNumber.size() - 1);
    }

    private void quicksortHelper(int low, int high) {
        if (low < high) {
            int partitionIndex = partition(low, high);
            quicksortHelper(low, partitionIndex - 1);
            quicksortHelper(partitionIndex + 1, high);
        }
    }

    private int partition(int low, int high) {
        Student pivot = iDNumber.get(high);
        int i = low - 1;

        for (int j = low; j < high; j++) {
            if (iDNumber.get(j).getGPA() >= pivot.getGPA()) {
                i++;
                Collections.swap(iDNumber, i, j);
            }
        }

        Collections.swap(iDNumber, i + 1, high);
        return i + 1;
    }
    public Student findStudentByFullName(String fullName) throws StudentNotFoundException {
        for (Student student : iDNumber) {
            String studentFullName = student.getName() + " " + student.getSurname();
            if (studentFullName.equalsIgnoreCase(fullName)) {
                return student;
            }
        }

        throw new StudentNotFoundException("Student with the given full name was not found: " + fullName);
    }

    public static void main(String[] args) {
        SortingStudentsByGPA sortingStudents = new SortingStudentsByGPA();

        ArrayList<Student> students = new ArrayList<>();
        students.add(new Student("Igor", "Sergeev", 3, 4.5));
        students.add(new Student("Peter", "Grigoriev", 2, 4.2));
        students.add(new Student("Eugene", "Stuliev", 4, 4.8));

        sortingStudents.setArray(students);

        SortingStudentsByGPA model = new SortingStudentsByGPA(sortingStudents.getiDNumber());
        SortingStudentsByGPAView view = new SortingStudentsByGPAView();

        SortingStudentsByGPAController controller = new SortingStudentsByGPAController(model, view);

        sortingStudents.mergeSort();

        System.out.println("Sorted list of students by grade point average using merge sorting:");
        controller.updateView();

        sortingStudents.setArray(students);
        sortingStudents.quicksort();

        System.out.println("Sorted list of students by grade point average using quick sort:");
        controller.updateView();

        // Поиск студента по ФИ
        try {
            Student foundStudent = sortingStudents.findStudentByFullName("123 Stuliev");
            System.out.println("Found student:");
            System.out.println("Name: " + foundStudent.getName());
            System.out.println("Surname: " + foundStudent.getSurname());
            System.out.println("iDNumber: " + foundStudent.getiDNumber());
            System.out.println("GPA: " + foundStudent.getGPA());
        } catch (StudentNotFoundException e) {
            System.out.println(e.getMessage());
        }
    }
}