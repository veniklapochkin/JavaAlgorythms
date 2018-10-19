package com.algorythmspack.sorts.SelectionSort;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

/**
 *
 * Created on 19.10.2018, 12:38:16
 *
 * @author Vladislav_Borisov
 */
public class SelectionSort {

    private int[] array;
    private int nElems;

    public SelectionSort(int max) {
        array = new int[max];
        nElems = 0;
    }

    public void insert(int value) {
        array[nElems] = value;
        nElems++;
    }

    public void selectionSort() {
        for (int i = 0; i < nElems - 1; i++) {
            int min = i;
            for (int j = i + 1; j < nElems; j++) {
                if (array[j] < array[min]) {
                    min = j;
                }
            swap(i, min);
            }
        }
        System.out.print("Sorted array: ");
        display();
    }

    public void swap(int one, int two) {
        int temp = array[one];
        array[one] = array[two];
        array[two] = temp;
    }

    public void display() {
        System.out.println(Arrays.toString(array));
    }
}

class Launcher {

    public static void main(String[] args) {
        System.out.print("Enter the number of the array: ");

        Scanner scan = new Scanner(System.in);
        int maxSize = scan.nextInt();
        Random random = new Random();

        SelectionSort array = new SelectionSort(maxSize);

        for (int i = 0; i < maxSize; i++) {
            int randNum = random.nextInt(maxSize);
            array.insert(randNum);
        }

        System.out.print("Source array: ");
        array.display();
        array.selectionSort();

    }
}
