package DownHill;

import java.util.Scanner;

/**
 * 蒜头在玩一款游戏，他在一个山顶，现在他要下山，山上有许多水果，蒜头每下一个高度就可以捡起一个水果，
 * 并且获得水果的能量。山的形状如图所示：
 * 3
 * 1 2
 * 6 2 3
 * 3 5 4 1
 * 这是一个高度为 4 的山，数字代表水果的能量。每次下一个高度，蒜头需要选择是往左下走，还是往右下走。
 * 例如：对于上图的情况，蒜头能获得的最大能量为，3 + 1 + 6 + 5 = 153+1+6+5=15。
 * 现在，蒜头希望你能帮他计算出下山能获得的最大能量
 *
 *   *
 * 动态规划 非递归 累加
 */
public class Main {

    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        int[][] value = new int[num+1][num+1];
        int[][] max = new int[num+1][num+1];//到某点最短路径

        for(int i = 1 ;i <= num ;i ++){
            for(int v = 1 ;v <= i ;v ++ ){
                value[i][v] = scanner.nextInt();
            }
            for(int j = i+1; j< num ;j ++){
                value[i][j] = 0;
            }
        }

        for(int i = 0 ;i <= num ;i ++){
            for(int j = 0 ;j <= num ;j ++){
                max[i][j] = Integer.MIN_VALUE;
            }
        }

        max[1][1] = value[1][1];
        for(int i =2 ;i <= num ;i ++){
            for(int j = 1;j <= i ;j ++){
                max[i][j] = maxValue(max[i-1][j-1] + value[i][j] ,
                        max[i-1][j] + value[i][j]);
            }
        }

        int s = Integer.MIN_VALUE;
        for(int i = 1 ;i <=num ;i ++ ){
            if(s < max[num][i])
                s = max[num][i];
        }
        System.out.print(s);

    }

    public static int maxValue(int a , int b ){
        return a > b ? a : b;
    }
}
