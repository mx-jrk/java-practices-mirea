package Practice_20.Task_4;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class MinMaxGeneric <T extends List<Number>>{
    private final T list1;

    private final T list2;

    public MinMaxGeneric(T list1, T list2) {
        this.list1 = list1;
        this.list2 = list2;
    }

    public void printMinAndMaxUnit(){
        if (list1.isEmpty()) return;
        double minUnit = list1.get(0).doubleValue();
        double maxUnit = list1.get(0).doubleValue();

        for (Number unut : list1) {
            minUnit = Math.min(minUnit, unut.doubleValue());
            maxUnit = Math.max(maxUnit, unut.doubleValue());
        }

        if (list2.isEmpty()){
            System.out.println("Максимальный элемент среди двух списков: " + maxUnit +
                    "\nМинимальный элемент среди двух списков: " + minUnit);
            return;
        }

        for (Number unut : list2) {
            minUnit = Math.min(minUnit, unut.doubleValue());
            maxUnit = Math.max(maxUnit, unut.doubleValue());
        }

        System.out.println("Максимальный элемент среди двух списков: " + maxUnit +
                "\nМинимальный элемент среди двух списков: " + minUnit);
    }

    public static void main(String[] args) {
        List<Number> list1 = new ArrayList<>();
        list1.add(10);
        list1.add(5);
        list1.add(8);

        List<Number> list2 = new ArrayList<>();
        list2.add(4.3);
        list2.add(9.9);
        list2.add(2.4);

        MinMaxGeneric<List<Number>> minMaxGeneric = new MinMaxGeneric<>(list1, list2);
        minMaxGeneric.printMinAndMaxUnit();
    }
}
