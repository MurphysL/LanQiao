package SequenceSearch;

import java.util.Scanner;

/**
 * 给出一个包含n个整数的数列，问整数a在数列中的第一次出现是第几个。
 */
public class Main {

    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] a = new int[n];
        boolean flag = true;

        for(int i = 0 ;i < n ;i ++){
            a[i] = scanner.nextInt();
        }
        int num = scanner.nextInt();

        for(int i = 0 ;i < n;i ++){
            if(a[i] == num){
                System.out.print(i + 1);
                flag = false;
                break;
            }
        }
        if(flag)
            System.out.print(-1);



    }
}
