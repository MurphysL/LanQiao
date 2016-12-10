package SequenceFeatures;

import java.util.Arrays;
import java.util.Scanner;

/**
 * 给出n个数，找出这n个数的最大值，最小值，和。
 */
public class Main {

    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int a[] = new int[n];
        int sum = 0;

        for(int i = 0 ;i < n ;i ++){
            a[i] = scanner.nextInt();
            sum += a[i];
        }

        Arrays.sort(a);
        System.out.println(a[n - 1]);
        System.out.println(a[0]);
        System.out.print(sum);
    }
}
