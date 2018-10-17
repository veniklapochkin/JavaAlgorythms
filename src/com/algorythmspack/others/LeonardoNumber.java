package com.algorythmspack.others;

/**
 *
 * @author Vladislav_Borisov
 */
public class LeonardoNumber {

    public static int leoSeq(int n){
        if (n<2){
            return 1;
        }
        else{
            return leoSeq(n-1)+leoSeq(n-2) + 1;
        }
    }
    
    public static int  showLeoSeq(int n){
        int a = 1;
        int b = 1;
        int c = 1;
        int leoSum=0;
        if (n==0){
            System.out.println(a);
        }
        
        else{
            System.out.println(a);
            System.out.println(b);
        }
        
        while(c<n){
            leoSum = a+b + 1;
            a = b;
            b = leoSum;
            c += 1;
            System.out.println(leoSum);
        }
        return 0;
    }
}
