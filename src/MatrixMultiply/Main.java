package MatrixMultiply;

import java.util.Scanner;

/**
 * 输入两个矩阵，分别是m*s，s*n大小。输出两个矩阵相乘的结果。
 */
public class Main {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int m = scanner.nextInt();
        int s = scanner.nextInt();
        int n = scanner.nextInt();

        int[][] a = new int[m][s];
        int[][] b = new int[s][n];
        int[][] c = new int[m][n];

        int i , j , k;

        for(i = 0 ;i < m ;i ++){
            for(j = 0 ;j < s ;j ++){
                a[i][j] = scanner.nextInt();
            }
        }

        for(i = 0 ;i < s ;i ++){
            for(j = 0 ;j < n ;j ++){
                b[i][j] = scanner.nextInt();
            }
        }


        for(i = 0 ;i < m ;i ++){
            for(j = 0 ;j < n ;j ++){
                for(k = 0 ;k < s ;k ++){
                    //System.out.println("test" + a[i][k] + " " + b[k][j] +"\n");
                    c[i][j] += a[i][k]*b[k][j];
                }
                System.out.print(c[i][j]);
                if(j < n-1)
                    System.out.print(" ");
            }
            System.out.println();

        }
    }
}
