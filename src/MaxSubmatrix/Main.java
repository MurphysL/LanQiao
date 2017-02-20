package MaxSubmatrix;

import java.util.Scanner;

/**
 * 给定一个 n \times mn×m 的矩阵 AA，求 AA 中的一个非空子矩阵，
 * 使这个子矩阵中的元素和最大。其中，AA 的子矩阵指在 AA 中行和列均连续的一部分。
 *
 * 注意最小值 Warn ：0 AC : Integer.MIN_VALUE
 */
public class Main {

    public static void main(String[] args){
        int n  , m ;
        Scanner scanner = new Scanner(System.in);
        n = scanner.nextInt();
        m = scanner.nextInt();
        int[][] num = new int[n][m];
        for(int i = 0 ;i < n ;i ++){
            for(int j = 0;j < m ;j ++){
                num[i][j] = scanner.nextInt();
            }
        }

        int max = Integer.MIN_VALUE;
        int sum = 0;

        //子矩阵左上角
        for(int i = 0 ;i < n ;i ++){
            for(int j = 0 ;j < m ;j ++){
                //子矩阵右下角
                for(int a = i ;a < n ;a ++){
                    for(int b = j ; b < m ;b ++){
                        //计算和
                        for(int c = i ; c <= a ; c ++){
                            for(int d = j ; d <= b ; d ++){
                                sum += num[c][d];
                            }
                        }

                        if(max < sum)
                            max = sum;
                        sum = 0;
                    }
                }
            }
        }

        System.out.print(max);


    }
}
