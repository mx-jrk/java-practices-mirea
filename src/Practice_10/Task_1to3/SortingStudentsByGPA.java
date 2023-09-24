package Practice_10.Task_1to3;

import java.util.*;

public class SortingStudentsByGPA implements Comparator<Student> {
    private List<Student> iDNumber;

    public SortingStudentsByGPA() {
        iDNumber = new ArrayList<>();
    }

    public List<Student> getiDNumber() {
        return iDNumber;
    }

    public void setArray() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите количество студентов, которых хотите внести");
        int studentsCount = scanner.nextInt();

        String studentName, studentSurname, studentSpecialization;
        int studentCourse, studentGroup;
        double studentGPA;
        for (int i = 0; i < studentsCount; i++){
            System.out.println("Заполните данные для студента " + (i + 1));
            scanner.nextLine();

            System.out.print("Введите имя: ");
            studentName = scanner.nextLine();

            System.out.print("\nВведите фамилию: ");
            studentSurname = scanner.nextLine();

            System.out.print("\nВведите специализацию: ");
            studentSpecialization = scanner.nextLine();

            System.out.print("\nВведите курс: ");
            studentCourse = scanner.nextInt();

            System.out.print("\nВведите группу: ");
            studentGroup = scanner.nextInt();

            System.out.print("\nВведите средний балл: ");
            studentGPA = scanner.nextDouble();


            iDNumber.add(new Student(studentName, studentSurname, studentSpecialization, studentCourse, studentGroup, studentGPA));
        }
        System.out.println("Данные внесены");
    }

    @Override
    public int compare(Student student1, Student student2) {
        return Double.compare(student2.getGPA(), student1.getGPA());
    }

    public void quicksort(){
        Collections.sort(iDNumber, new SortingStudentsByGPA());
    }

    public static class SortingStudentsByCourse implements Comparator<Student> {
        @Override
        public int compare(Student student1, Student student2) {
            return Integer.compare(student1.getCourse(), student2.getCourse());
        }
    }

    public void sortByCourse(){
        Collections.sort(iDNumber, new SortingStudentsByCourse());
    }

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

    public void outArray(){
        System.out.println("Данные о всех студентах");
        for (Student student : iDNumber){
            System.out.println(student);
        }
    }

    public static void outArray(List<Student> students){
        System.out.println("Данные о всех студентах");
        for (Student student : students){
            System.out.println(student);
        }
    }


    public static void main(String[] args) {
        SortingStudentsByGPA uni1 = new SortingStudentsByGPA();
        SortingStudentsByGPA uni2 = new SortingStudentsByGPA();

        uni1.setArray();
        uni2.setArray();

        uni1.quicksort();
        uni2.sortByCourse();

        uni1.outArray();
        uni2.outArray();

        List<Student> mergedList = mergeSortedLists(uni1.getiDNumber(), uni2.getiDNumber());
        SortingStudentsByGPA.outArray(mergedList);

    }

}
