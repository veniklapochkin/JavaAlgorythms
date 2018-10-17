
package com.algorythmspack.arrays;

/**
 *
 * @author Vladislav_Borisov
 */


public class OOPArray {
    private long[] array;
    private int nElems; // amount of elements
    
    public OOPArray(int max){ 
        array = new long[max];
        nElems = 0;
    }
    
    public boolean find(long searchKey){
        int i;
        for (i = 0; i < nElems; i++) 
            if(array[i] == searchKey)
                break;
        
        if(i == nElems)     // find last elemement
            return false;   // yes
        else
            return true;    // no
    }
    
    public void insert(long value){
        array[nElems] = value;
        nElems++;
    }
    
    public boolean delete(long value){
        int i;
        for (i = 0; i < nElems; i++) { // search element
            if(value == array[i])
                break;
        }
        if(i == nElems)
            return false;   
        else    // value found
            for (int k = i; k < nElems; k++) { // shift of elements
                array[k] = array[k+1];
            }
            nElems--;
            return true;
    }
    
    public void display(){
        for (int i = 0; i < nElems; i++) {
            System.out.print(array[i]+" ");
            System.out.println("");
        }
    }
}

class Array{
    public static void main(String[] args) {
        int maxSize = 100;
        OOPArray array = new OOPArray(maxSize);
        
        array.insert(0);
        array.insert(1);
        array.insert(2);
        array.insert(3);
        array.insert(4);
        array.insert(5);
        array.insert(6);
        array.insert(7);
        array.insert(8);
        
        array.display();
        
        int searchKey = 34;
        if(array.find(searchKey))
            System.out.println("Found " + searchKey);
        else
            System.out.println("Can't find " + searchKey);
        
        array.delete(4);
        array.delete(5);
        array.delete(6);
        
        array.display();
    }
}
