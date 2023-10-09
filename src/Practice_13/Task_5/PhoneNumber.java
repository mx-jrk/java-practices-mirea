package Practice_13.Task_5;

import java.util.Scanner;

public class PhoneNumber {
   private String countryCode;

   private String number;

    public PhoneNumber(String phoneNumber) {
        countryCode = phoneNumber.substring(0, phoneNumber.length() - 10);

        number = phoneNumber.substring(countryCode.length());
    }

    public String getFormatedPhoneNumber(){
        StringBuilder phoneNumber = new StringBuilder();

        if (countryCode.equals("8")) phoneNumber.append("+7");
        else if (countryCode.charAt(0) != '+') phoneNumber.append('+').append(countryCode);
        else phoneNumber.append(countryCode);

        phoneNumber.append(number.substring(0, 3)).append('-').append(number.substring(3, 6)).append('-').append(number.substring(6));

        return String.valueOf(phoneNumber);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println((new PhoneNumber(scanner.nextLine())).getFormatedPhoneNumber());
    }
}
