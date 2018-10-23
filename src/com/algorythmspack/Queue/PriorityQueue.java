package com.algorythmspack.Queue;

/**
 *
 * Created on 23.10.2018, 11:35:31
 *
 * @author Vladislav_Borisov
 */
public class PriorityQueue {

    private int maxSize;
    private int[] queArray;
    private int nItems;

    public PriorityQueue(int s) {
        maxSize = s;
        queArray = new int[maxSize];
        nItems = 0;
    }
    
    public void insert(int item){
        int i;
        if(nItems==0)
            queArray[nItems++] = item;
        else
        {
            for (i = nItems - 1; i >= 0; i--) {
                if (item > queArray[i]) {
                    queArray[i+1] = queArray[i];
                }
                else break;
            }
            queArray[i+1] = item;
            nItems++;
        }
    }
    //** remove min elem*/
    public int remove(){ 
        return queArray[--nItems];
    }
    //** reading min elem*/
    public int peekMin(){
        return queArray[nItems - 1];
    }
    public boolean isEmpty(){
        return nItems == 0;
    }
    public boolean isFull(){
        return nItems == maxSize;
    }
}

class LauncherPQ{
    public static void main(String[] args) {
        PriorityQueue pq = new PriorityQueue(10);
        pq.insert(30);
        pq.insert(40);
        pq.insert(20);
        pq.insert(10);
        pq.insert(80);
        pq.insert(70);
        pq.insert(90);
        pq.insert(100);
        pq.insert(50);
        pq.insert(60);
        
        while(!pq.isEmpty())
        {
            int item = pq.remove();
            System.out.println(item + " "); // 10..100
        }
    }
}