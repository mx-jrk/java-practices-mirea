package Practice_13.Task_2;

import java.util.Scanner;

public class Person {
    private final String firstName;
    private final String lastName;
    private final String patronymic;

    public Person(String firstName, String lastName, String patronymic) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.patronymic = patronymic;
    }

    public String getInitials(){
        StringBuilder initials = new StringBuilder(lastName);

        if (!firstName.isEmpty()) initials.append(" ").append(firstName.charAt(0)).append(".");

        if (!patronymic.isEmpty()) initials.append(" ").append(patronymic.charAt(0)).append(".");

        return String.valueOf(initials);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите фамилию");
        String lastName = scanner.nextLine();
        while (lastName.isEmpty()){
            System.out.println("Фамилия должна быть заполнена");
            lastName = scanner.nextLine();
        }

        System.out.println("Введите имя");
        String firstName = scanner.nextLine();

        System.out.println("Введите отчество");
        String patronymic = scanner.nextLine();

        System.out.println((new Person(firstName, lastName, patronymic)).getInitials());
    }
}
