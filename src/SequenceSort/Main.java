package SequenceSort;

import java.util.Arrays;
import java.util.Scanner;

/**
 * 给定一个长度为n的数列，将这个数列按从小到大的顺序排列。1<=n<=200
 */
public class Main {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] a = new int[n];
        for(int i = 0 ; i<n ; i ++){
            a[i] = scanner.nextInt();
        }
        Arrays.sort(a);
        for(int i = 0 ; i<n ; i ++){
            System.out.print(a[i]);
            if(i < n - 1){
                System.out.print(" ");
            }
        }
    }
}
