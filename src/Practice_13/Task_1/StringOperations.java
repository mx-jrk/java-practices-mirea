package Practice_13.Task_1;

public class StringOperations {
    public static void main(String[] args) {
        //1
        String string = "I like Java!!!";

        //2
        System.out.println(string.charAt(string.length() - 1));

        //3
        System.out.println(string.endsWith("!!!"));

        //4
        System.out.println(string.startsWith("I like"));

        //5
        System.out.println(string.contains("Java"));

        //6
        System.out.println(string.indexOf("Java"));

        //7
        System.out.println(string.replace('a', 'o'));

        //8
        System.out.println(string.toUpperCase());

        //9
        System.out.println(string.toLowerCase());

        //10
        System.out.println(string.substring(string.indexOf("Java"), string.indexOf("!!!")));


    }
}
