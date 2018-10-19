package com.algorythmspack.sorts.BubbleSort;


import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

/**
 *
 * Created on 19.10.2018, 11:05:45
 *
 * @author Vladislav_Borisov
 */
public class BubbleSort {

    private int[] array;
    private int nElems;

    public BubbleSort(int max) {
        array = new int[max];
        nElems = 0;
    }

    public void insert(int value) {
        array[nElems] = value;
        nElems++;
    }

    public void bubbleSort() {
        for (int i = nElems-1; i > 1; i--) {
            for (int j = 0; j < i; j++) {
                if (array[j] > array[j + 1]) {
                    swap(j, j + 1);
                }
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
        
        BubbleSort array = new BubbleSort(maxSize);
        
        for (int i = 0; i < maxSize; i++) {
            int randNum = random.nextInt(maxSize);
            array.insert(randNum);
        }
        
        System.out.print("Source array: ");
        array.display();
        array.bubbleSort();

    }

}
