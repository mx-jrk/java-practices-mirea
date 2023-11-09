package Practice_20.Task_4;

public class GenericCalc {
    public <T extends Number> double sum(T num1, T num2) {
        return num1.doubleValue() + num2.doubleValue();
    }

    public <T extends Number> double multiply(T num1, T num2) {
        return num1.doubleValue() * num2.doubleValue();
    }

    public <T extends Number> double divide(T num1, T num2) {
        return num1.doubleValue() / num2.doubleValue();
    }

    public <T extends Number> double subtraction(T num1, T num2) {
        return num1.doubleValue() - num2.doubleValue();
    }

    public static void main(String[] args) {
        GenericCalc calc = new GenericCalc();

        System.out.println(calc.sum(3, 3.14));
        System.out.println(calc.multiply(3, 3.14));
        System.out.println(calc.divide(3, 3.14));
        System.out.println(calc.subtraction(3, 3.14));
    }
    }


