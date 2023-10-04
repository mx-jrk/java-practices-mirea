package Practice_11.Task_5;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class ArrayVsLinked {
    public static void main(String[] args) {
        int n = 100000;

        //Замер времени вставки

        List<Integer> arrayList = new ArrayList<>();

        long startTime = System.nanoTime();
        for (int i = 0; i < n; i++) {
            arrayList.add(i);
        }
        long endTime = System.nanoTime();
        long arrayListInsertionTime = endTime - startTime;

        List<Integer> linkedList = new LinkedList<>();

        startTime = System.nanoTime();
        for (int i = 0; i < n; i++) {
            linkedList.add(i);
        }
        endTime = System.nanoTime();
        long linkedListInsertionTime = endTime - startTime;

        //Замер вермени удаления

        startTime = System.nanoTime();
        for (int i = 0; i < n; i++) {
            arrayList.remove(arrayList.size() - 1);
        }
        endTime = System.nanoTime();
        long arrayListDeletionTime = endTime - startTime;

        startTime = System.nanoTime();
        for (int i = 0; i < n; i++) {
            linkedList.remove(linkedList.size() - 1);
        }
        endTime = System.nanoTime();
        long linkedListDeletionTime = endTime - startTime;

        // Замер времени поиска
        int target = n / 2;
        startTime = System.nanoTime();
        arrayList.contains(target);
        endTime = System.nanoTime();
        long arrayListSearchTime = endTime - startTime;

        startTime = System.nanoTime();
        linkedList.contains(target);
        endTime = System.nanoTime();
        long linkedListSearchTime = endTime - startTime;

        System.out.println("ArrayList вставка: " + arrayListInsertionTime + " нс");
        System.out.println("LinkedList вставка: " + linkedListInsertionTime + " нс");
        System.out.println("ArrayList удаление: " + arrayListDeletionTime + " нс");
        System.out.println("LinkedList удаление: " + linkedListDeletionTime + " нс");
        System.out.println("ArrayList поиск: " + arrayListSearchTime + " нс");
        System.out.println("LinkedList поиск: " + linkedListSearchTime + " нс");
    }
}
