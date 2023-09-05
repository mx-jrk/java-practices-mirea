package Practic_1.Task_6;

public class Main {
    public static void main(String[] args) {
        double sum = 0.0;

        for (int i = 1; i <= 10; i++) {
            sum += 1.0 / i;
            System.out.printf("%.3f%n", sum);
        }
    }
}
