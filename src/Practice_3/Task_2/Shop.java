package Practice_3.Task_2;

import java.util.ArrayList;
import java.util.Scanner;

public class Shop {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите дейтсвующий курс доллара");
        CurrencyConverter dollar = new CurrencyConverter(new Currency("USD", scanner.nextDouble()));

        System.out.println("Введите дейтсвующий курс евро");
        CurrencyConverter euro = new CurrencyConverter(new Currency("EUR", scanner.nextDouble()));

        short action;
        double cost;
        while (true){
            System.out.println("Введите стоимость товара в рублях");
            cost = scanner.nextDouble();

            System.out.println("""
                    Введите 1 для перевода в доллары
                    Введите 2 для перевода в евро
                    Введите 0 для выхода
                    """);
            if ((action = scanner.nextByte()) == 0) break;

            switch (action){
                case 1 -> {
                    System.out.println(dollar.convert(cost));
                }
                case 2 -> {
                    System.out.println(euro.convert(cost));
                }
            }
        }

        String name;
        double salary;
        Report employees = new Report(new ArrayList<>());
        while (true){
            System.out.println("""
                    Введите 1, чтобы добавить работника
                    Введите 0 для завершения процесаа
                    """);

            if ((scanner.nextByte()) == 0) break;
            scanner.nextLine();

            System.out.println("Введите имя сотрудника");
            name = scanner.nextLine();

            System.out.println("Введите зарплату сотрудника");
            salary = scanner.nextDouble();

            employees.addEmployee(new Employee(name, salary));
        }

        employees.printEmployees();
    }
}
