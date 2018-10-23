


package com.algorythmspack.others;

/**

 * Created on 23.10.2018, 18:29:55
 * @author Vladislav_Borisov
 */
public class TowerOfHanoi {
    final static int nDisks = 3;
    
    public static void doTowers(int disks, char A, char B, char C){
        if(disks == 1)
            System.out.println("Disk 1 from "+ A+ " to "+ C);
        else
        {
            doTowers(disks - 1, A, C, B); // from-->inter
            System.out.println("Disk " + disks +" from "+ A+" to "+C);
            doTowers(disks-1,B,A,C); //inter-->to
        }
    }
    public static void main(String[] args) {
        doTowers(nDisks,'A','B','C');
    }
    
}
