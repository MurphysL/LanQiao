package SumOfSequence;

import java.util.Scanner;

/**
 * 求1+2+3+...+n的值。
 */
public class Main {

    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        long n = scanner.nextLong();
        if(n%2 == 0){
            System.out.print((1 + n)*(n /2));
        }else{
            System.out.print((1 + n) * (n/2) + n/2 + 1);
        }

    }
}
