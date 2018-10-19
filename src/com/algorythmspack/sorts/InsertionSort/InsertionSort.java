


package com.algorythmspack.sorts.InsertionSort;


import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

/**

 * Created on 19.10.2018, 13:13:39
 * @author Vladislav_Borisov
 */
public class InsertionSort {
     private int[] array;
    private int nElems;

    public InsertionSort(int max) {
        array = new int[max];
        nElems = 0;
    }

    public void insert(int value) {
        array[nElems] = value;
        nElems++;
    }

    public void insertionSort() {
        int j;
        for (int i = 0; i < nElems; i++) { // i - separator marker
            int temp = array[i];    //copy marked elem
            j = i;  // start moning from i
            while(j>0 && array[j-1] >=temp){// while not found smaller elem
                array[j] = array[j-1]; // Move element to the right
                --j; // Move to the left
            }
            array[j] = temp; // insert marked elem
        }
        System.out.print("Sorted array: ");
        display();
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

        InsertionSort array = new InsertionSort(maxSize);

        for (int i = 0; i < maxSize; i++) {
            int randNum = random.nextInt(maxSize);
            array.insert(randNum);
        }

        System.out.print("Source array: ");
        array.display();
        array.insertionSort();

    }
}
