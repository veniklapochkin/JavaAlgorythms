
package com.algorythmspack.arrays;

/**
 *
 * @author Vladislav_Borisov
 */
public class ArrayWithBinarySearch {
    
    private int[] array;
    private int nElems; // amount of elements
    
    public ArrayWithBinarySearch(int max){ 
        array = new int[max];
        nElems = 0;
    }
    
    public int size(){return nElems;}
    
    public int find(int searchKey){ // binary search
       int lowerBound = 0;
       int upperBound = nElems - 1;
       int curIn;
       
       while(true){
           curIn = (lowerBound + upperBound) / 2;
           if(array[curIn] == searchKey)
               return curIn; // found
           else if (lowerBound > upperBound)
               return nElems; // not found
           else
           {
               if(array[curIn] < searchKey)
                   lowerBound = curIn + 1; // upper half
               else
                   upperBound = curIn - 1; //lower half
           }
       }
    }
    
    public void insert(int value){
        int j;
        for (j = 0; j < nElems; j++) {
            if(array[j] > value)
                break;
        }
        
        for (int i = nElems; i > j; i--) {
            array[i] = array[i-1];
        }
        array[j] = value;
        nElems++;
    }
    
    public boolean delete(int value){
        int j = find(value);
        if(j==nElems)
            return false;
        else
        {
            for (int i = j; i < nElems; i++) {
                array[i] = array[i+1];
            }
            nElems--;
        }
        return true;
    }
    
        public void getMax(){
        int maxValue = 0;
        for (int i = 0; i < nElems; i++) {
            if(array[i] > maxValue)
                maxValue = array[i];
        }
        System.out.println("Max value of array: " + maxValue);
    }
    
    public void isEmpty(){
        if(array.length == 0)
            System.out.println("Array is Empty");
        else
            System.out.println("Array of " + array.length + " elemets");
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
    public void display(){
        for (int i = 0; i < nElems; i++) {
            System.out.print(array[i]+" ");
            System.out.println("");
        }
    }
}

class Launcher{
    public static void main(String[] args) {
        int maxSize = 100;
        ArrayWithBinarySearch array = new ArrayWithBinarySearch(maxSize);
        
        array.isEmpty();
        
        array.insert(10);
        array.insert(21);
        array.insert(12);
        array.insert(34);
        array.insert(14);
        array.insert(53);
        array.insert(53);
        array.insert(76);
        array.insert(38);
        
        array.noDup();
        array.getMax();
        array.display();
        
        int searchKey = 76;
        if(array.find(searchKey) != array.size())
            System.out.println("Found " + searchKey);
        else
            System.out.println("Can't find " + searchKey);
        
        array.delete(14);
        array.delete(53);
        array.delete(76);
        
        array.display();
    }
}