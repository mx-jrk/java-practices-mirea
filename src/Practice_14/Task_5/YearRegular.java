package Practice_14.Task_5;

import java.util.Calendar;
import java.util.Scanner;

public class YearRegular {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите дату в формате dd/mm/yyyy:");
        String inputDate = scanner.nextLine();
        if (isValidDate(inputDate)) {
            System.out.println("Данная строка является датой в правильном формате.");
        } else {
            System.out.println("Данная строка не является датой в правильном формате.");
        }
    }
    private static boolean isValidDate(String dateStr) {
        String[] dateParts = dateStr.split("/");
        int day = Integer.parseInt(dateParts[0]);
        int month = Integer.parseInt(dateParts[1]);
        int year = Integer.parseInt(dateParts[2]);
        if (year < 1900 || year > 9999) {
            return false;
        }
        Calendar calendar = Calendar.getInstance();
        calendar.setLenient(false);
        try {
            calendar.set(year, month - 1, day);
            calendar.getTime();
            return true;
        } catch (Exception e) {
            return false;
        }
    }
}
