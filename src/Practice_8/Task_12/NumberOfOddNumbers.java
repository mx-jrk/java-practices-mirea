package Practice_8.Task_12;

import java.util.Scanner;

public class NumberOfOddNumbers {
    public static void countNumberOfOddNumbers() {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        if (n > 0) {

            if (n % 2 == 1) {
                System.out.println(n);
                countNumberOfOddNumbers();
            } else {
                countNumberOfOddNumbers();
            }
        }

    }

    public static void main(String[] args) {
        countNumberOfOddNumbers();
    }
}
