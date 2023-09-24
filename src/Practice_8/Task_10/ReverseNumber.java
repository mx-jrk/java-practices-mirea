package Practice_8.Task_10;

public class ReverseNumber {
    public static int reverseNumber(int n, int newNum){
        if (n <= 0) return newNum;
        newNum = newNum*10 + n % 10;
        n /= 10;
        return reverseNumber(n, newNum);
    }

    public static void main(String[] args) {
        System.out.println(reverseNumber(1234, 0));
    }
}
