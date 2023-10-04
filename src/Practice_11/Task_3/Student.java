package Practice_11.Task_3;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

public class Student {
    private final int iDNumber;
    private final String name;
    private final double GPA;

    private final Date birthday;

    private String formatedBirthday;

    public Student(int iDNumber, String name, double GPA, int year, int month, int day) {
        this.iDNumber = iDNumber;
        this.name = name;
        this.GPA = GPA;

        Calendar calendar = Calendar.getInstance();
        calendar.set(Calendar.YEAR, year);
        calendar.set(Calendar.MONTH, month);
        calendar.set(Calendar.DAY_OF_MONTH, day);
        this.birthday = calendar.getTime();
    }

    @Override
    public String toString() {
        return "Студент {" +
                "ID: " + iDNumber +
                ", Имя: '" + name + '\'' +
                ", Средний балл: " + GPA +
                ", День рождения: " + formatedBirthday +
                '}';
    }

    public void setFormatedBirthday(String dateFormat) {
        SimpleDateFormat sdf = new SimpleDateFormat(dateFormat);
        formatedBirthday = sdf.format(birthday);
    }


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите имя студента: ");
        String name = scanner.nextLine();

        System.out.print("\nВведите средний балл студента: ");
        double GPA = scanner.nextDouble();

        System.out.println("\nВведите дату рождения студента");

        System.out.print("Введите год: ");
        int year = scanner.nextInt();

        System.out.print("\nВведите месяц: ");
        int month = scanner.nextInt();

        System.out.println("\nВведите день: ");
        int day = scanner.nextInt();

        Student student = new Student(1, name, GPA, year, month, day);

        System.out.println("""
                Введите формат даты
                1 - короткий
                2 - срдений
                3 - полный   
                """);
        int formatType = scanner.nextInt();
        switch (formatType){
            case 1 -> {
                student.setFormatedBirthday("dd.MM.yy");
            }
            case 2 -> {
                student.setFormatedBirthday("dd MMMM yyyy");
            }
            case 3 -> {
                student.setFormatedBirthday("EEEE, dd MMMM yyyy");
            }
        }

        System.out.println(student);
    }
}