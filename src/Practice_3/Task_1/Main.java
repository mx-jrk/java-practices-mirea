package Practice_3.Task_1;

public class Main {
    public static void main(String[] args) {
        //1. Создайте объекты класса Double, используя методы valueOf().
        Double num1 = Double.valueOf(12.76);
        Double num2 = Double.valueOf(12);
        System.out.println(num1 + " " + num2);

        //2. Преобразовать значение типа String к типу double. Используем метод Double.parseDouble().
        Double num3 = Double.parseDouble("1.3");
        System.out.println(num3);

        //3. Преобразовать объект класса Double ко всем примитивным типам.
        System.out.println(((int) 1.2) + " " +
                ((float) 1.2) + " " +
                (String.valueOf(1.2)));

        //4. Вывести значение объекта Double на консоль.
        System.out.println(num1);

        //5. Преобразовать литерал типа double к строке: String d = Double.toString(3.14);
        String num4 = Double.toString(3.14);
        System.out.println(num4);
    }
}
