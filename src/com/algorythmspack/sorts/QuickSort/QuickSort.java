package com.algorythmspack.sorts.QuickSort;

import com.algorythmspack.sorts.ShellSort.ShellSort;
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

/**
 *
 * Created on 24.10.2018, 15:57:31
 *
 * @author Vladislav_Borisov
 */
public class QuickSort {

    private int[] array;
    private int nElems;

    public QuickSort(int max) {
        array = new int[max];
        nElems = 0;
    }

    public void insert(int value) {
        array[nElems] = value;
        nElems++;
    }

    public void display() {
        System.out.println(Arrays.toString(array));
    }

    public void quickSort() {
        recQuickSort(0, nElems - 1);
        System.out.print("Sorted array: ");
        display();
    }

    public void recQuickSort(int left, int right) {
        int size = right - left + 1;
        if (size <= 3) {
            manualSort(left, right);
        } else {
            int median = medianOf3(left, right);
            int partition = partitionIt(left, right, median);
            recQuickSort(left, partition - 1);
            recQuickSort(partition + 1, right);
        }
    }

    public int medianOf3(int left, int right) {
        int center = (left + right) / 2;

        if (array[left] > array[center]) {
            swap(left, center);
        }
        if (array[left] > array[right]) {
            swap(left, right);
        }
        if (array[center] > array[right]) {
            swap(center, right);
        }
        swap(center, right - 1);
        return array[right - 1];
    }

    public void swap(int one, int two) {
        int temp = array[one];
        array[one] = array[two];
        array[two] = temp;
    }

    public int partitionIt(int left, int right, int pivot) {
        int leftPtr = left;
        int rightPtr = right - 1;

        while (true) {
            while (array[++leftPtr] < pivot);
            while (array[--rightPtr] > pivot);

            if (leftPtr >= rightPtr) {
                break;
            } else {
                swap(leftPtr, rightPtr);
            }
        }
        swap(leftPtr, right - 1);
        return leftPtr;
    }

    public void manualSort(int left, int right) {
        int size = right - left + 1;
        if (size <= 1) {
            return;
        }
        if (size == 2) {
            if (array[left] > array[right]) {
                swap(left, right);
            }
            return;
        } else {
            if (array[left] > array[right - 1]) {
                swap(left, right - 1);
            }

            if (array[left] > array[right]) {
                swap(left, right);
            }

            if (array[right - 1] > array[right]) {
                swap(right - 1, right);

            }
        }
    }
}

class Launcher {

    public static void main(String[] args) {
        System.out.print("Enter the number of the array: ");

        Scanner scan = new Scanner(System.in);
        int maxSize = scan.nextInt();
        Random random = new Random();

        QuickSort array = new QuickSort(maxSize);

        for (int i = 0; i < maxSize; i++) {
            int randNum = random.nextInt(maxSize);
            array.insert(randNum);
        }

        System.out.print("Source array: ");
        array.display();
        array.quickSort();

    }

}
