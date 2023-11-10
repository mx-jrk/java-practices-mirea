package Practice_25.Task_3;

import java.util.Scanner;
import java.util.regex.Pattern;

public class IPChecker {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String regex = "^(25[0-5]|2[0-4][0-9]|[01]?[0-9][0-9]?)\\.(25[0-5]|2[0-4][0-9]|[01]?[0-9][0-9]?)\\.(25[0-5]|2[0-4][0-9]|[01]?[0-9][0-9]?)\\.(25[0-5]|2[0-4][0-9]|[01]?[0-9][0-9]?)$";
        Pattern pattern = Pattern.compile(regex);

        System.out.print("Введите строку: ");
        String input = sc.nextLine();
        if (pattern.matcher(input).matches()) {
            System.out.println("Введенная строка является IPv4 адресом");
        } else {
            System.out.println("Введенная строка не является IPv4 адресом");
        }
    }
}