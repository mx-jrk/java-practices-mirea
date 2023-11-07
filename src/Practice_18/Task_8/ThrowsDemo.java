package Practice_18.Task_8;

import java.util.Scanner;

public class ThrowsDemo {
    public void getKey() {
        Scanner myScanner = new Scanner(System.in);
        boolean validInput = false;
        while (!validInput) {
            try {
                System.out.print("Enter a key: ");
                String key = myScanner.next();
                printDetails(key);
                validInput = true;
            } catch (Exception e) {
                System.out.println("An error occurred: " + e.getMessage());
            }
        }
    }

    public void printDetails(String key) {
        String message = getDetails(key);
        System.out.println(message);
    }

    private String getDetails(String key) {
        if (key.equals("")) {
            throw new RuntimeException("Key set to an empty string");
        }
        return "data for " + key;
    }

    public static void main(String[] args) {
        ThrowsDemo demo = new ThrowsDemo();
        demo.getKey();
    }
}

