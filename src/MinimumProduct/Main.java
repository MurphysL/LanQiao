package MinimumProduct;

import java.util.Scanner;

/**
 * 给两组数，各n个。
 * 请调整每组数的排列顺序，使得两组数据相同下标元素对应相乘，然后相加的和最小。要求程序输出这个最小值。
 * 例如两组数分别为:1 3　　-5和-2 4 1
 * 那么对应乘积取和的最小值应为：
 * (-5) * 4 + 3 * (-2) + 1 * 1 = -25
 */
public class Main {

    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();

        for(int i = 0 ;i < num ;i ++){
            int x = scanner.nextInt();
            int[][] a = new int[2][x];
            for(int t = 0 ;t < 2 ;t ++){
                for(int j = 0 ;j < x ;j ++){
                    a[t][j] = scanner.nextInt();
                }
            }
            if(num != num - 1)
                System.out.println(sum(a));
            else
                System.out.print(sum(a));
        }
    }

    private static int sum(int[][] a){
        int result = 0;
        for(int i = 0 ;i  < a[0].length ;i ++){
            for(int j = 0 ;j < a[0].length-i-1 ;j ++){
                if(a[0][j] > a[0][j + 1]){
                    int t = a[0][j];
                    a[0][j] = a[0][j+1];
                    a[0][j + 1] = t;
                }
            }
        }

        for(int i = 0 ;i  < a[0].length ;i ++){
            for(int j = 0 ;j < a[0].length-i-1 ;j ++){
                if(a[1][j] < a[1][j + 1]){
                    int t = a[1][j];
                    a[1][j] = a[1][j+1];
                    a[1][j + 1] = t;
                }
            }
        }
        for(int i = 0 ;i < a[0].length;i ++){
            result += (a[0][i]*a[1][i]);
        }
        return result;
    }
}
