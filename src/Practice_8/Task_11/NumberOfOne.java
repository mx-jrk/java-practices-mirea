package Practice_8.Task_11;

import java.util.Scanner;

public class NumberOfOne {
    public static int countNumberOfOne(){
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();

        if (num == 0){
            num = scanner.nextInt();
            if (num == 0) return 0;
        }
        if (num == 1) return 1 + countNumberOfOne();
        return countNumberOfOne();
    }

    public static void main(String[] args) {
        System.out.println(countNumberOfOne());
    }
}
