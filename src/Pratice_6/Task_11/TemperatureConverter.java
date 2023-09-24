package Pratice_6.Task_11;

public  class TemperatureConverter implements Convertable{

    @Override
    public double convertFromCelsiusToFahrenheit(double celsius) {
        return (celsius * 9/5) + 32;
    }

    @Override
    public double convertFromCelsiusToKelvin(double celsius) {
        return celsius + 273.15;
    }

    public static void main(String[] args) {
        TemperatureConverter converter = new TemperatureConverter();

        System.out.println(converter.convertFromCelsiusToFahrenheit(32));
        System.out.println(converter.convertFromCelsiusToKelvin(25));
    }
}
