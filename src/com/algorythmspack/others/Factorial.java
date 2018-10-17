package com.algorythmspack.others;

/**
 *
 * @author Vladislav_Borisov
 */
public class Factorial {

    public static int factorial(int n) {
        if (n == 1 || n == 0) {
            return 1;
        } else {
            return factorial(n - 1) * n;
        }
        
    }
}
