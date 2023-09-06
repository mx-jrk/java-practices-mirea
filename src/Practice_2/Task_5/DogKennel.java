package Practice_2.Task_5;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class DogKennel {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Dog> kennel = new ArrayList<>();

        short action;

        String name;
        int age;

        while (true) {
            System.out.println("""
                    Чтобы добавить собаку в питомник введите 1.
                    Чтобы удалить собаку из питомника введите 2.
                    Чтобы узнать возраст собаки в человеческих годах введите 3.
                    Чтобы выйти введите 0.
                    """);

            if ((action = scanner.nextByte()) == 0) break;

            switch (action){
                case 1 -> {
                    System.out.println("Введите имя собаки:");
                    name = scanner.next();

                    System.out.println("Введите возраст собаки:");
                    age = scanner.nextInt();

                    kennel.add(new Dog(name, age));

                    System.out.println("Собака добавлена.");
                }
                case 2 -> {
                    System.out.println("Введите имя собаки:");
                    name = scanner.next();

                    for (Dog dog : kennel) {
                        if (dog.getName().equals(name)) {
                            kennel.remove(dog);
                            break;
                        }
                    }

                    System.out.println("Собака удалена");
                }
                case 3 -> {
                    System.out.println("Введите имя собаки:");
                    name = scanner.next();
                    for (Dog dog : kennel) {
                        if (dog.getName().equals(name)) {
                            System.out.println("Возраст собаки = " + dog.getAge() +
                                    " эквивалентен " + dog.convertDogAgeToHumanAge() + " годам человека");
                        }
                    }
                }
            }
        }
    }
}
