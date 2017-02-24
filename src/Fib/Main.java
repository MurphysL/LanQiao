package Fib;

import java.util.Scanner;

/**
 * 1,1,2,3,5,8,13,21⋯
 *
 * 我们用 fib(n)表示斐波那契数列的第n项，现在要求你求 fib(n) mod m。
 */
public class Main {

    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int num , mod;
        num = scanner.nextInt();
        mod = scanner.nextInt();

        if(num == 1){
            System.out.println(1);
        } else if(num == 2){
            System.out.println(1);
        } else{
            int[] fib = new int[num];
            fib[0] = 1;
            fib[1] = 1;
            for(int i = 2 ;i < num ;i ++){
                fib[i] = (fib[i-1] + fib[i-2])%mod;
            }
            System.out.print(fib[num-1]);
        }

    }
}
