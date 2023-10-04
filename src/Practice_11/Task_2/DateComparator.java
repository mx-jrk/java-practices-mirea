package Practice_11.Task_2;

import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

public class DateComparator {
    private final Date currentDate;

    private final Date enteredDate;

    public DateComparator(int year, int month, int day, int hour, int minute, int second) {
        Calendar calendar = Calendar.getInstance();
        calendar.set(Calendar.YEAR, year);
        calendar.set(Calendar.MONTH, month);
        calendar.set(Calendar.DAY_OF_MONTH, day);
        calendar.set(Calendar.HOUR, hour);
        calendar.set(Calendar.MINUTE, minute);
        calendar.set(Calendar.SECOND, second);

        this.enteredDate = calendar.getTime();

        this.currentDate = new Date();
    }

    public void compareDates(){
        if (enteredDate.after(currentDate)) System.out.println("Введённая дата позднее системной");
        else if (enteredDate.before(currentDate)) System.out.println("Системная дата позднее введённой");
        else System.out.println("Системная и введённая даты равны");
    }


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите вашу дату");

        System.out.print("Введите год: ");
        int year = scanner.nextInt();

        System.out.print("\nВведите месяц: ");
        int month = scanner.nextInt();

        System.out.print("\nВведите день: ");
        int day = scanner.nextInt();

        System.out.print("\nВведите час: ");
        int hour = scanner.nextInt();

        System.out.print("\nВведите минуту: ");
        int minute = scanner.nextInt();

        System.out.print("\nВведите секунду: ");
        int second = scanner.nextInt();

        DateComparator dateComparator = new DateComparator( year, month, day, hour, minute, second);

        dateComparator.compareDates();
    }
}
