package Practice_1.Task_3;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] array = new int[n];

        int sum = 0;
        for (int i = 0; i < n; i++){
            array[i] = scanner.nextInt();
            sum += array[i];
        }

        System.out.println("Сумма элементов = " + sum);
        System.out.println("Среднее арифметическое = " + ((double)sum / (double) n));
    }
}
