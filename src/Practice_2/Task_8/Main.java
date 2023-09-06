package Practice_2.Task_8;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите длину массива:");
        int n = scanner.nextInt();

        String[] array = new String[n];

        for (int i = 0; i < n; i++) {
            array[i] = scanner.next();
        }

        String flag;
        for (int i = 0; i < n / 2; i++){
            flag = array[i];
            array[i] = array[n - 1 - i];
            array[n - 1 - i] = flag;
        }

        System.out.println("Измененный массив:");
        for (String s : array) System.out.print(s + ' ');
    }
}
