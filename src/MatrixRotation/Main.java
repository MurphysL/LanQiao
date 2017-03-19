package MatrixRotation;

import java.util.Scanner;

/**
 * 输出一个 n 行 m 列的矩阵顺时针旋转 90 度旋转 k 次的结果
 */
public class Main {

    static int n, m, k;


    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        n = scanner.nextInt();
        m = scanner.nextInt();
        k = scanner.nextInt();

        int[][] old = new int[n][m];
        for(int i = 0 ;i < n ;i ++){
            for(int j = 0 ;j < m ;j ++){
                old[i][j] = scanner.nextInt();
            }
        }

        int num = k % 4;
        int[][] nm;
        if(num % 2 == 1){
            nm = new int[m][n];
        }else{
            nm = new int[n][m];
        }

        for(int i = 0 ;i < n;i ++){
            for(int j = 0 ;j < m ;j ++){
                if(num == 2)
                    nm[n - i - 1][m - j -1] = old[i][j];
                else if(num == 0)
                    nm[i][j] = old[i][j];
                else if(num == 1)
                    nm[j][n - i - 1] = old[i][j];
                else
                    nm[m- j- 1][i] = old[i][j];
            }
        }

        for(int i = 0 ;i < nm.length ;i ++){
            for(int j = 0 ;j < nm[0].length;j ++){
                if(j == nm[0].length - 1)
                    System.out.print(nm[i][j]);
                else
                    System.out.print(nm[i][j]+" ");
            }
            System.out.println();
        }

    }
}
