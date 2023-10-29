package Practice_14.Task_6;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class EmailRegular {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите email адрес:");
        String email = scanner.nextLine();
        if (isValidEmail(email)) {
            System.out.println("Email адрес корректный.");
        } else {
            System.out.println("Email адрес некорректный.");
        }
    }

    public static boolean isValidEmail(String email) {
        String regex = "^[A-Za-z0-9+_.-]+@[A-Za-z0-9.-]+$";
        /*
        ^[A-Za-z0-9+_.-]+ соответствует локальной части адреса,
        где допустимы буквы в верхнем и нижнем регистре, цифры, и символы "+", ".", "_", и "-".
        @ - соответствует символу "@".
        [A-Za-z0-9.-]+ соответствует доменной части адреса,
        где также допустимы буквы в верхнем и нижнем регистре, цифры, и символы ".", и "-".
        $ - обозначает конец строки.
         */
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(email);
        return matcher.matches();
    }
}
