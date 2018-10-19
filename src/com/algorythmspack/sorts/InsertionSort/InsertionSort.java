


package com.algorythmspack.sorts.InsertionSort;


import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

/**

 * Created on 19.10.2018, 13:55:38
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
        /** i - sepatated marker*/
        for (int i = 0; i < nElems; i++) {
            //** copy marked elem*/
            int temp = array[i];
            //** start moving from i*/
            j = i;
            //** while not found smaller elem*/
            while(j>0 && array[j-1] >=temp){
                //** move elem to the right*/
                array[j] = array[j-1];
                //** move to the left*/
                --j;
            }
            //** insert marked elem*/
            array[j] = temp;
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