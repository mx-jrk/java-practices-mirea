package Practice_11.Task_1;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

public class DeveloperTaskTime {
    private final String name;

    private final Date tStart;

    private final Date tEnd;

    private final SimpleDateFormat sdf;
    public DeveloperTaskTime(String name, int year, int month, int day, int hour, int minute, int second) {
        this.name = name;

        Calendar calendar = Calendar.getInstance();
        calendar.set(Calendar.YEAR, year);
        calendar.set(Calendar.MONTH, month);
        calendar.set(Calendar.DAY_OF_MONTH, day);
        calendar.set(Calendar.HOUR, hour);
        calendar.set(Calendar.MINUTE, minute);
        calendar.set(Calendar.SECOND, second);

        this.tStart = calendar.getTime();

        this.tEnd = new Date();

        sdf = new SimpleDateFormat("yyyy MMMM dd HH:mm:ss");
    }

    public String getName() {
        return name;
    }

    public String gettStart() {
        return sdf.format(tStart);
    }

    public String gettEnd() {
        return sdf.format(tEnd);
    }


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Отметка о завершении задачи");

        System.out.println("Введите имя разработчика");
        String name = scanner.nextLine();

        System.out.println("Введите данные о начале выполнения задачи");

        System.out.print("Введите год начала: ");
        int year = scanner.nextInt();

        System.out.print("\nВведите месяц начала: ");
        int month = scanner.nextInt();

        System.out.print("\nВведите день начала: ");
        int day = scanner.nextInt();

        System.out.print("\nВведите час начала: ");
        int hour = scanner.nextInt();

        System.out.print("\nВведите минуту начала: ");
        int minute = scanner.nextInt();

        System.out.print("\nВведите секунду начала: ");
        int second = scanner.nextInt();

        DeveloperTaskTime developer = new DeveloperTaskTime(name, year, month, day, hour, minute, second);

        System.out.println("\nИнформация о задаче");

        System.out.println("Имя: " + developer.getName());
        System.out.println("Время начала задачи: " + developer.gettStart());
        System.out.printf("Время окончания задачи: " + developer.gettEnd());
    }
}
