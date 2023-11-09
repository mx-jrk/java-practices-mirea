package Practice_21.Task_1to4;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;

public class DynamicArray<T> {
    private T[] array;

    public DynamicArray(T[] array) {
        this.array = array;
    }

    public List<T> arrayToList() {
        List<T> list = new ArrayList<>();
        for (T element : array) {
            list.add(element);
        }
        return list;
    }
    public T getElement(int index) {
        return array[index];
    }

    public static void main(String[] args) {
        Integer[] intArray = {1, 2, 3, 4, 5};
        Double[] doubleArray = {1.1, 2.2, 3.3, 4.4, 5.5};
        String[] stringArray = {"Hello", "World", "Java", "Programming", "Language"};

        DynamicArray<Integer> intDynamicArray = new DynamicArray<>(intArray);
        DynamicArray<Double> doubleDynamicArray = new DynamicArray<>(doubleArray);
        DynamicArray<String> stringDynamicArray = new DynamicArray<>(stringArray);

        System.out.println(intDynamicArray.getElement(2)); // выводит элемент массива intArray с индексом 2
        System.out.println(doubleDynamicArray.getElement(3));
        System.out.println(stringDynamicArray.getElement(1));

        List<String> fileList = stringDynamicArray.arrayToList();
        System.out.println(fileList.subList(0, 5)); // выводит первые 5 элементов списка
    }
}