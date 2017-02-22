package NOIP2002_Xiangqi_Wrong;

import java.util.Scanner;

/**
 * A 点有一个过河卒，需要走到目标 B 点。卒行走规则：可以向下、或者向右。同时在棋盘上的任一点有一个对方的马（如上图的 CC 点），该马所在的点和所有跳跃一步可达的点称为对方马的控制点。例如上图 CC 点上的马可以控制 9 个点（图中的 P1,P2 \cdots P8P1,P2⋯P8 和 CC）。卒不能通过对方马的控制点。
 * 。现在要求你计算出过河卒从 A 点能够到达 B 点的路径的条数。注：象棋中马走“日”。
 */
public class Main {

    private static int[][] pass = new int[30][30];

    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        //目标位置
        int n = scanner.nextInt();
        int m = scanner.nextInt();
        //马位置
        int x = scanner.nextInt();
        int y = scanner.nextInt();
        //落点
        for(int i = 0 ;i < 30;i ++){
            for(int j = 0 ;j < 30 ;j ++){
                if(Math.abs(i-x) == 1 && Math.abs(j - y) == 2 ||
                        Math.abs(i-x) == 2 && Math.abs(j-y) == 1 || i == x && j == y){
                    pass[i][j] = -1;
                }else {
                    pass[i][j] = 0;
                }
            }
        }

        pass[0][0] = 1;
        for(int i = 0 ; i <= n ;i ++){
            for(int j = 0 ;j <= m;j ++){
                if(i != 0 && pass[i-1][j] != -1 && pass[i][j] != -1)
                    pass[i][j] += pass[i-1][j];
                if(j != 0 && pass[i][j-1] != -1 && pass[i][j] != -1)
                    pass[i][j] += pass[i][j-1];
            }
        }

        if(pass[n][m] == -1){
            System.out.print(0+"");
        }else{
            System.out.print(pass[n][m]);
        }


    }

}
