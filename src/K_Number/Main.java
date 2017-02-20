package K_Number;

import java.util.Scanner;

/**
 * 1. 边界
 * 2. 取余
 *
 * 如果一个自然数N的K进制表示中任意的相邻的两位都不是相邻的数字，那么我们就说这个数是K好数。
 * 求L位K进制数中K好数的数目。例如K = 4，L = 2的时候，所有K好数为11、13、20、22、30、31、33 共7个。
 * 由于这个数目很大，请你输出它对1000000007取模后的值。
 */
public class Main {

    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int j = scanner.nextInt();//进制
        int n = scanner.nextInt();//位数
        int a[][] = new int[n][j];

        for(int i = 0 ;i < j ; i ++)
            a[0][i] = 1;

        for(int i = 1 ;i < n ;i ++){
            for(int x = 0 ; x < j ;x ++){
                for(int y = 0 ;y < j ;y ++){
                    if(y != x-1 && y != x + 1){
                        a[i][x] += a[i-1][y];
                        a[i][x] %= 1000000007;//每一步均取余 提高运算速度
                    }
                }
            }
        }

        int result = 0;
        for(int i = 1 ;i < j;i ++){ //边界
            result = result + a[n-1][i];
            result %= 1000000007;//结果取余
        }

        System.out.print(result);
    }

}
