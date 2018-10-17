package com.algorythmspack.others;

/**
 *
 * @author Vladislav_Borisov
 */
public class FibonacciNumber {
    
    public static int fibSeq(int n){
        if (n<2){
            return n;
        }
        else{
            return fibSeq(n-1)+fibSeq(n-2);
        }
    }
    
    public static int  showFibSeq(int n){
        int a = 0;
        int b = 1;
        int c = 1;
        int fibSum=0;
        if (n==0){
            System.out.println(a);
        }
        
        else{
            System.out.println(a);
            System.out.println(b);
        }
        
        while(c<n){
            fibSum = a+b;
            a = b;
            b = fibSum;
            c += 1;
            System.out.println(fibSum);
        }
        return 0;
    }
}
