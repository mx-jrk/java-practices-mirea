package Practice_6.Task_10;

public class Computer {
    private final String model;

    private final Brand brand;

    private final Memory memory;

    private final  Monitor monitor;

    private final Processor processor;

    private final int cost;

    public Computer(String model, Brand brand, Memory memory, Monitor monitor, Processor processor, int cost) {
        this.model = model;
        this.brand = brand;
        this.memory = memory;
        this.monitor = monitor;
        this.processor = processor;
        this.cost = cost;
    }

    public String getModel(){
        return model;
    }

    @Override
    public String toString() {
        return "Computer{" +
                "\nМодель: '" + model +
                ",\n Бренд: " + brand +
                ",\n Информация об ОЗУ: " + memory +
                ",\n Информация о мониторе: " + monitor +
                ",\n Информация о процессоре" + processor +
                ",\n Стимость: " + cost +
                "}\n";
    }
}
