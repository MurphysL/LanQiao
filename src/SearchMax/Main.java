package SearchMax;

import java.math.BigInteger;
import java.util.Scanner;

/**
 * 对于给定整数数组a[],寻找其中最大值，并返回下标。
 */
public class Main {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        long[] a = new long[n];
        long max = Long.MIN_VALUE;
        long flag = Long.MIN_VALUE;
        for(int i = 0  ;i < n ;i ++){
            a[i] = scanner.nextInt();
            if(a[i] > max){
                max = a[i];
                flag = i;
            }
        }

        System.out.print(max + " " +flag);
    }
}
