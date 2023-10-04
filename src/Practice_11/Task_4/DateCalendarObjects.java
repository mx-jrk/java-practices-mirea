package Practice_11.Task_4;

import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

public class DateCalendarObjects {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите год");
        int year = scanner.nextInt();

        System.out.println("Введите месяц");
        int month = scanner.nextInt();

        System.out.println("Введите день");
        int dayOfMonth = scanner.nextInt();

        System.out.println("Введите часы");
        int hours = scanner.nextInt();

        System.out.println("Введите минуты");
        int minutes = scanner.nextInt();

        Calendar calendar = Calendar.getInstance();
        calendar.set(Calendar.YEAR, year);
        calendar.set(Calendar.MONTH, month - 1);
        calendar.set(Calendar.DAY_OF_MONTH, dayOfMonth);
        calendar.set(Calendar.HOUR_OF_DAY, hours);
        calendar.set(Calendar.MINUTE, minutes);
        Date date = calendar.getTime();

        System.out.println("Объект Date: " + date);

        System.out.println("Объект Calendar: " + calendar.getTime());
    }
}
