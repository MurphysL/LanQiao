package Letter;

import java.util.Scanner;

/**
 * 利用字母可以组成一些美丽的图形，下面给出了一个例子：
 *
 * ABCDEFG
 *
 * BABCDEF
 *
 * CBABCDE
 *
 * DCBABCD
 *
 * EDCBABC
 *
 * 这是一个5行7列的图形，请找出这个图形的规律，并输出一个n行m列的图形。
 */
public class Main {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int row = scanner.nextInt();
        int col = scanner.nextInt();

        for(int i = 0 ; i< row ;i ++){
            for(int j = i ; j >= 0 && i - j < col;j -- ){
                char c =(char)('A' + j);
                System.out.print(c);
            }
            for(int n =  1 ;n < col - i ; n ++){
                char c =(char)('A' + n);
                System.out.print(c);
            }
            System.out.println();
        }
    }
}
