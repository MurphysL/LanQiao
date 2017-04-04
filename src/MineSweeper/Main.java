package MineSweeper;

import java.util.Scanner;

/**
 * 计算出矩阵中每个单元格相邻单元格内地雷的个数，每个单元格最多有 8 个相邻的单元格
 * Created by MurphySL on 2017/4/3.
 */
public class Main {
    static int n , m;
    static char[][] mine = new char[100][100];
    static char[][] num = new char[100][100];
    /**
     * 操作
     */
    static int[][] op = {
            {0, -1},
            {1, -1},
            {1, 0},
            {1, 1},
            {0, 1},
            {-1, 1},
            {-1, 0},
            {-1, -1}};
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        n = scanner.nextInt();
        m = scanner.nextInt();
        for(int i = 0 ;i < n ;i ++){
            String s = scanner.next().trim();
            for(int j = 0 ;j < m ;j ++){
                num[i][j] = '0';
                mine[i][j] = s.charAt(j);
            }
        }

        for(int i = 0 ;i < n ;i ++){
            for(int j = 0;j < m ;j ++){
                if(mine[i][j] == '*'){
                    num[i][j] = '*';
                    signMine(i, j);
                }
            }
        }

        for(int i = 0 ;i < n ;i ++){
            for(int j = 0;j < m ;j ++){
                System.out.print(num[i][j]);
            }
            System.out.println();
        }


    }

    /**
     * 位置是否合法
     *
     * @param i 中心 X
     * @param j 中心 Y
     * @return
     */
    private static boolean canPass(int i , int j){
        if(j >= 0 && j < m && i >= 0 && i < n && num[i][j] != '*'){
            return true;
        }
        return false;
    }

    private static void signMine(int i ,int j) {
        for(int x = 0 ;x < 8;x ++){
            int ni = i+op[x][0];
            int nj = j+op[x][1];
            if(canPass(ni, nj)){
                num[ni][nj] ++;//可到达位置地雷数加一
            }
        }
    }
}
