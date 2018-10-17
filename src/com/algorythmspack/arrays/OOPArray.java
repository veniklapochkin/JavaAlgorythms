package com.algorythmspack.arrays;

/**
 *
 * @author Vladislav_Borisov
 */
public class OOPArray {

    private int[] array;
    private int nElems; // amount of elements

    public OOPArray(int max) {
        array = new int[max];
        nElems = 0;
    }

    public boolean find(int searchKey) {
        int i;
        for (i = 0; i < nElems; i++) {
            if (array[i] == searchKey) {
                break;
            }
        }

        if (i == nElems) // find last elemement
        {
            return false;   // yes
        } else {
            return true;    // no
        }
    }

    public void insert(int value) {
        array[nElems] = value;
        nElems++;
        
    }

    public boolean delete(int value) {
        int i;
        for (i = 0; i < nElems; i++) { // search element
            if (value == array[i]) {
                break;
            }
        }
        if (i == nElems) {
            return false;
        } else // value found
        {
            for (int k = i; k < nElems; k++) { // shift of elements
                array[k] = array[k + 1];
            }
        }
        nElems--;
        return true;
    }
    public void getMax() {
        int maxValue = 0;
        for (int i = 0; i < nElems; i++) {
            if (array[i] > maxValue) {
                maxValue = array[i];
            }
        }
        System.out.println("Max value of array: " + maxValue);
    }

    public void isEmpty() {
        if (array.length == 0) {
            System.out.println("Array is Empty");
        } else {
            System.out.println("Array of " + array.length + " elemets");
        }
    }
    public boolean noDup(){
        for (int i = 0; i < nElems; i++) {
            for (int j = i+1; j < nElems; j++) {
                if(i!=j &&array[i] == array[j]){
                    delete(array[i]);
                    
                    return true;
                }
            }
        }
        return false;
    }
    public void display() {
        for (int i = 0; i < nElems; i++) {
            System.out.print(array[i] + " ");
            System.out.println("");
        }
    }
}

class Array {

    public static void main(String[] args) {
        int maxSize = 100;
        OOPArray array = new OOPArray(maxSize);

        array.isEmpty();

        array.insert(0);
        array.insert(1);
        array.insert(2);
        array.insert(3);
        array.insert(3);
        array.insert(5);
        array.insert(6);
        array.insert(7);
        array.insert(8);
       
        array.noDup();
        array.getMax();
        array.display();

        int searchKey = 34;
        if (array.find(searchKey)) {
            System.out.println("Found " + searchKey);
        } else {
            System.out.println("Can't find " + searchKey);
        }

        array.delete(4);
        array.delete(5);
        array.delete(8);

        array.getMax();
        array.display();
    }
}
