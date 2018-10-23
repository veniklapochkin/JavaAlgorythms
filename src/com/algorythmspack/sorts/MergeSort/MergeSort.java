


package com.algorythmspack.sorts.MergeSort;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

/**

 * Created on 23.10.2018, 19:17:01
 * @author Vladislav_Borisov
 */
public class MergeSort {
    private int[] array;
    private int nElems; // amount of elements

    public MergeSort(int max) {
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
     public void mergeSort()
     {
         int[] workSpace = new int[nElems];
         recMergeSort(workSpace, 0, nElems-1);
         System.out.print("Sorted array: ");
     }
    public void recMergeSort(int [] workSpace, int lowerBound, int upperBound){
        if (lowerBound == upperBound) {
            return;
        }
        else{
            int mid = (lowerBound+upperBound)/2;
            recMergeSort(workSpace, lowerBound, mid);
            recMergeSort(workSpace, mid+1, upperBound);
            merge(workSpace, lowerBound,mid+1,upperBound);
        }
    }
    
    public void merge(int[] workSpace, int lowPtr, int highPtr, int upperBound){
        int j =0;
        int lowerBound = lowPtr;
        int mid = highPtr -1;
        int n = upperBound - lowerBound +1;
        
        while(lowPtr <= mid && highPtr <= upperBound)
            if (array[lowPtr] < array[highPtr]) {
                workSpace[j++]=array[lowPtr++];
            }
            else
                workSpace[j++] = array[highPtr++];
        while(lowPtr <= mid)
            workSpace[j++] = array[lowPtr++];
        while(highPtr <= upperBound)
            workSpace[j++] = array[highPtr++];
        for (int i = 0; i < n; i++) {
            array[lowerBound+i] = workSpace[i];
        }
    }
}

class MergeSortApp{
    public static void main(String[] args) {
        System.out.print("Enter the number of the array: ");

        Scanner scan = new Scanner(System.in);
        int maxSize = scan.nextInt();
        Random random = new Random();
        
        MergeSort array = new MergeSort(maxSize);
        
        //**Generate random array*/
        for (int i = 0; i < maxSize; i++) {
            int randNum = random.nextInt(maxSize);
            array.insert(randNum);
        }
        
        System.out.print("Source array: ");
        array.display();
        
        array.mergeSort();
        
        array.display();
    }
}