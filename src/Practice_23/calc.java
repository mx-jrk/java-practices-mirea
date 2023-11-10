package Practice_23;

import java.util.Scanner;

public class calc {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int x = scanner.nextInt();
        // Создание выражения x^2 - 2x + 1
        Expression expression = new Subtract(
                new Subtract(
                        new Multiply(new Variable("x"), new Variable("x")),
                        new Multiply(new Const(2), new Variable("x"))
                ),
                new Const(-1)
        );

        // Проверка значения выражения для x, переданного в командной строке
        try {
            int result = expression.evaluate(x);
            System.out.println("Result: " + result);
        } catch (NumberFormatException e) {
            System.out.println("Invalid input for x. Please provide an integer.");
        }

    }
}
