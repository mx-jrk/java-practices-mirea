package Practice_2.Task_10;

import java.util.Scanner;

public class HowMany {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String sentence = scanner.nextLine();

        //Variant 1
        System.out.println(sentence.split(" ").length);

        //Variant 2
        int spacesCount = 0;
        for (int i = 0; i < sentence.length(); i++){
            if (sentence.charAt(i) == ' ') spacesCount++;
        }

        System.out.println(++spacesCount);
    }
}
