


package com.algorythmspack.sorts.ShellSort;

import com.algorythmspack.sorts.BubbleSort.BubbleSort;
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

/**

 * Created on 24.10.2018, 14:22:30
 * @author Vladislav_Borisov
 */
public class ShellSort {
    private int[] array;
    private int nElems;

    public ShellSort(int max) {
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
    
    public void shellSort(){
        int inner,outer;
        int temp;
        int h = 1;
        
        while(h<=nElems/3)
            h*=3 + 1;
        
        while(h>0){
            for (outer = 0; outer < nElems; outer++) {
                temp = array[outer];
                inner = outer;
                while(inner > h-1 && array[inner-h] >= temp)
                {
                    array[inner] = array[inner-h];
                    inner -= h;
                }
                array[inner] = temp;
            }
            h = (h-1)/3;
        }
                System.out.print("Sorted array: ");
                display();
    }
    
}

class Launcher {

    public static void main(String[] args) {
        System.out.print("Enter the number of the array: ");

        Scanner scan = new Scanner(System.in);
        int maxSize = scan.nextInt();
        Random random = new Random();
        
        ShellSort array = new ShellSort(maxSize);
        
        for (int i = 0; i < maxSize; i++) {
            int randNum = random.nextInt(maxSize);
            array.insert(randNum);
        }
        
        System.out.print("Source array: ");
        array.display();
        array.shellSort();

    }

}

