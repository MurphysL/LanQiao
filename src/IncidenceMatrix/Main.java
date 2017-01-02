package IncidenceMatrix;

import java.util.Scanner;

/**
 * 有一个n个结点m条边的有向图，请输出他的关联矩阵。
 */
public class Main {

    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);
        int col , row , a , b;
        col = scanner.nextInt();//边
        row = scanner.nextInt();//点
        int[][] matrix = new int[col][row];

        for(int i = 0 ; i < row ;i ++){
            a = scanner.nextInt();
            b = scanner.nextInt();

            matrix[a - 1][i] = 1;
            matrix[b - 1][i] = -1;
        }

        for(int i =0 ;i < col ;i ++){
            for(int j = 0 ;j < row ;j ++){
                if(j == row -1)
                    System.out.print(matrix[i][j]);
                else
                    System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }
}
