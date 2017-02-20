package Palindrome;

import java.util.Scanner;

/**
 * 观察数字：12321，123321 都有一个共同的特征，就是无论从左到右读还是从右向左读，都是相同的。
 * 这样的数字叫做 回文数字。
 *
 * 现在要从 5 位或 6 位的十进制数字中找出各个数位之和等于 nn 的回文数字。
 */
public class Main {

    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        boolean flag = true;
        for(long i = 10000 ; i < 1000000 ;i ++){
            long g = i % 10;
            long s = i % 100 / 10;
            long b = i % 1000 / 100;
            long q = i % 10000 / 1000;
            long w = i % 100000 / 10000;
            long x = i / 100000;
            if(g + s + b + q + w + x == num)
                if(x == 0 && g == w && s ==q || x !=0 && x == g && w == s && q == b){
                    flag = false;
                    System.out.println(i);
                }
        }

        if(flag){
            System.out.print(-1);
        }
    }
}
