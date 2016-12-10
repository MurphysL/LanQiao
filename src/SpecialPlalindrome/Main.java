package SpecialPlalindrome;

import java.util.Arrays;
import java.util.Scanner;

/**
 * 123321是一个非常特殊的数，它从左边读和从右边读是一样的。
 * 输入一个正整数n， 编程求所有这样的五位和六位十进制数，满足各位数字之和等于n 。
 */
public class Main {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] a = new int[65535];
        int y = 0;
        for(int t = 0 ;t <= 9 ; t ++){
            if((n - t)%2 == 0){
                for(int i = 1 ;i <= 9;i++){
                    for(int j = 0 ;j <= 9;j ++){
                        if(i + j == (n-t)/2){
                            a[y] = i*10000 + j *1000 + t*100 + j * 10 + i;
                            y ++;
                        }
                    }
                }
            }
        }
        Arrays.sort(a ,0 , y);
        for(int i = 0 ;i < y ;i ++){
            System.out.println(a[i]);
        }

        if(n % 2 == 0){
            for(int i = 1 ;i <= 9;i++){
                for(int j = 0 ;j <= 9;j ++){
                    for(int m = 0 ; m <= 9 ;m ++){
                        if(i + j + m == n/2){
                            System.out.println(i + "" + j + "" + m +"" + m + "" + j + "" + i);
                        }
                    }
                }
            }
        }


    }
}
