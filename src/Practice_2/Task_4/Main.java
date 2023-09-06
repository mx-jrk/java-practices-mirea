package Practice_2.Task_4;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        short action;

        Shop shop = new Shop("myShop");

        String title;
        int cost;
        Computer computer;

        while (true) {
            System.out.println("Введите 1 для того, чтобы добавить компьютер." +
                    "\nВведите 2 для того, чтобы удалить компьютер." +
                    "\nВведите 3 для того, чтобы найти компьютер по стоимости." +
                    "\nВведите 4 для того, чтобы найти компьютер по имени." +
                    "\nВведите 0 для того, чтобы выйти.");
            if ((action = scanner.nextByte()) == 0) break;

            switch (action) {
                case 1:
                    System.out.println("Введите название компьютера: ");
                    title = scanner.next();

                    System.out.println("Введите цену компьютера");
                    cost = scanner.nextInt();

                    shop.addComputer(title, cost);
                    System.out.println("Компьютер добавлен");
                    break;
                case 2:
                    System.out.println("Введите название компьютера: ");
                    title = scanner.next();

                    shop.deleteComputer(title);
                    System.out.println("Компьютер удалён");
                    break;
                case 3:
                    System.out.println("Введите цену компьютера");
                    cost = scanner.nextInt();

                    computer = shop.findComputerByCost(cost);
                    if (computer == null) System.out.println("Компьютер по установленной цене не найден");
                    else {
                        System.out.println("Найден компьютер в вашей ценовой категории: " +
                                "\nНазвание: " + computer.getTitle() +
                                "\nЦена: " + computer.getCost());
                    }
                    break;
                case 4:
                    System.out.println("Введите название компьютера: ");
                    title = scanner.next();

                    computer = shop.findComputerByTitle(title);
                    if (computer == null) System.out.println("Компьютер по данному названию не найден");
                    else {
                        System.out.println("Найден компьютер по вашему названию: " +
                                "\nНазвание: " + computer.getTitle() +
                                "\nЦена: " + computer.getCost());
                    }
            }
        }
    }
}
