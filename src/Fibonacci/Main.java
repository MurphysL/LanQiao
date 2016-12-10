package Fibonacci;

import java.util.Scanner;

/**
 * Fibonacci数列的递推公式为：Fn=Fn-1+Fn-2，其中F1=F2=1。
 *
 * 当n比较大时，Fn也非常大，现在我们想知道，Fn除以10007的余数是多少。
 */
public class Main {

    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] f = new int[1000001];
        f[0] = f[1] = 1;
        for(int i = 2;i <= n ;i ++){
            f[i] = (f[i-1] + f[i -2])%10007;
        }

        System.out.println(f[n-1]);
    }
}
