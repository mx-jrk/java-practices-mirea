package Practice_25.Task_4;

import java.util.Scanner;

public class ExpressionChecking {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String str = sc.nextLine();
        int closeCnt = 0, openCnt = 0;

        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == ')') {
                closeCnt++;
            } else if (str.charAt(i) == '(') {
                openCnt++;
            }
        }

        if (openCnt == closeCnt) {
            System.out.println("Это правильное выражение");
        } else {
            System.out.println("Это неправильное выражение");
        }

    }
}
