


package com.algorythmspack.StackX;

/**

 * Created on 19.10.2018, 17:51:36
 * @author Vladislav_Borisov
 */
public class StackX {
    private int maxSize;
    private int[] stackArray;
    private int top;
    
    public StackX(int s){
        //* define stack size**/
        maxSize = s;
        stackArray = new int [maxSize];
        //** empty*/
        top =-1;
    }
    //** place on the top of stack*/
    public void push(int j){
        stackArray[++top] = j;
    }
    //** extract elem from top*/
    public int pop(){
        return stackArray[top--];
    }
    //** reading elem from top*/
    public int peek(){
        return stackArray[top];
    }
    
    public boolean isEmpty(){
        return (top == -1);
    }
    
    public boolean isFull(){
        return (top == maxSize - 1);
    }
}

class StackApp{
    public static void main(String[] args) {
        StackX theStack = new StackX(10);
        theStack.push(10);
        theStack.push(20);
        theStack.push(30);
        theStack.push(40);
        theStack.push(50);
        
        while(!theStack.isEmpty()){
            int value = theStack.pop();
            System.out.print(value+ " ");
        }
        System.out.println("");
    }
}