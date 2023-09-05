package Practic_1.Task_4;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();

        if (n <= 0){
            System.out.println("Размер массива должен быть больше нуля");
        }
        else {
            int i, sum,
                    maxNum, minNum;
            int[] array;

            //While
            System.out.println("Введите " + n + " чисел. Вввод происходит через цикл while");

            sum = 0; i = 0;
            maxNum = 0; minNum = 0;
            array = new int[n];

            while (i < n) {
                array[i] = scanner.nextInt();

                if (i == 0) {
                    maxNum = array[i];
                    minNum = array[i];
                }
                else {
                    maxNum = Math.max(maxNum, array[i]);
                    minNum = Math.min(minNum, array[i]);
                }

                sum += array[i];

                i++;
            }

            System.out.println("Сумма элементов = " + sum +
                    "\nМаксимальный элемент = " + maxNum +
                    "\nМинимальный элемент = " + minNum);

            //Do while
            System.out.println("Введите " + n + " чисел. Вввод происходит через цикл do while");

            sum = 0; i = 0;
            maxNum = 0; minNum = 0;
            array = new int[n];

            do {
                array[i] = scanner.nextInt();

                if (i == 0) {
                    maxNum = array[i];
                    minNum = array[i];
                }
                else {
                    maxNum = Math.max(maxNum, array[i]);
                    minNum = Math.min(minNum, array[i]);
                }

                sum += array[i];

                i++;
            }
            while (i < n);

            System.out.println("Сумма элементов = " + sum +
                    "\nМаксимальный элемент = " + maxNum +
                    "\nМинимальный элемент = " + minNum);
        }
    }
}
