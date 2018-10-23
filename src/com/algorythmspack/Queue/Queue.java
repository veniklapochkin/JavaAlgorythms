package com.algorythmspack.Queue;

/**
 *
 * Created on 23.10.2018, 10:34:05
 *
 * @author Vladislav_Borisov
 */
public class Queue {

    private int maxSize;
    private int[] queArray;
    private int front;
    private int rear;
    private int nItems;

    public Queue(int s) {
        maxSize = s;
        queArray = new int[maxSize];
        front = 0;
        rear = -1;
        nItems = 0;
    }

    public void insert(int j) {
        //** cycling transfer*/
        if (rear == maxSize - 1) {
            rear = -1;
        }
        //** increase and insert*/
        queArray[++rear] = j;
        nItems++;
    }

    public int remove() {
        int temp = queArray[front++];
        if (front == maxSize) {
            front = 0;
        }
        nItems--;
        return temp;
    }

    //** reading elem in the front elem*/

    public int peekFront() {
        return queArray[front];
    }

    public boolean isEmpty() {
        return (nItems == 0);
    }

    public boolean isFull() {
        return (nItems == maxSize);
    }

    public int size() {
        return nItems;
    }
}

class Launcher {

    public static void main(String[] args) {
        Queue theQueue = new Queue(10);

        theQueue.insert(10);
        theQueue.insert(20);
        theQueue.insert(30);
        theQueue.insert(40);
        theQueue.insert(50);

        theQueue.remove();
        theQueue.remove();
        theQueue.remove();
        theQueue.insert(60);
        theQueue.insert(70);
        theQueue.insert(80);
        theQueue.insert(90);
        theQueue.insert(100);

        while (!theQueue.isEmpty()) {
            int n = theQueue.remove();
            System.out.print(n + " ");
        }
        System.out.println(" ");
    }
}
