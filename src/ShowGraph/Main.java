package ShowGraph;

import java.util.Scanner;

/**
 * 编写一个程序，首先输入一个整数，例如5，然后在屏幕上显示如下的图形（5表示行数）：
 *　　* * * * *
 *　　* * * *
 *　　* * *
 *　　* *
 *　　*
 */
public class Main {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        for(int i = n;i > 0;i --){
            for(int j = 0 ;j < i;j ++){
                System.out.print('*');
                if(j < i -1)
                    System.out.print(" ");
            }
            System.out.println();
        }
    }
}
