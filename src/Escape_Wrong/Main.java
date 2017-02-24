package Escape_Wrong;

import java.util.Scanner;

/**
 * Created by MurphySL on 2017/2/23.
 */
public class Main {

    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int m = scanner.nextInt();
        int x = scanner.nextInt();
        int y = scanner.nextInt();

        int v = scanner.nextInt();//初始血量
        int c = scanner.nextInt();//血量上限

        int[][] map = new int[n][m];

        for(int i = 0 ;i < n ;i ++){
            for(int j = 0 ;j < m;j ++){
                map[i][j] = scanner.nextInt();
            }
        }

        boolean luf = false , ldf = false , ruf = false , rdf = false;

        //左上
        int[][] lu = new int[x][y];//统计血量
        lu[x-1][y-1] = v;//进入地图后初始血量  00
        for(int i = x-1 ; i >= 0 ; i --){
            for(int j = y-1 ;j >= 0 ; j --){
                if(i == x-1 && j == y -1)//已计算
                    continue;

                //寻找最大血量路线
                if(i == x-1){
                    lu[i][j] = bloodFilter(lu[i][j + 1] + map[i][j] , c);
                }
                if(j == y - 1){
                    lu[i][j] = bloodFilter(lu[i + 1][j]+ map[i][j] , c);
                }
                if(i != x- 1 && j != y - 1){
                    lu[i][j] = bloodFilter(maxBlood(lu[i][j+1] , lu[i+1][j])+ map[i][j] , c);
                }

                if(lu[i][j] <= 0)
                    luf = true;
            }
        }
        //左下
        int[][] ld = new int[n - x][y];//统计血量
        ld[0][y-1] =  v;//进入地图后初始血量
        for(int i = 0 ; i < n-x ; i ++){
            for(int j = y-1 ;j >= 0 ; j --){
                if(i == x-1 && j == y -1)//已计算
                    continue;

                //寻找最大血量路线
                if(i == 0){
                    ld[i][j] = bloodFilter(ld[i][j + 1] + map[i][j] , c);
                }
                if(j == y-1){
                    ld[i][j] = bloodFilter(ld[i - 1][j]+ map[i][j] , c);
                }
                if(i != 0 && j != y-1){
                    ld[i][j] = bloodFilter(maxBlood(ld[i][j+1] , ld[i-1][j])+ map[i][j] , c);
                }
            }
        }
        //右上
        int[][] ru = new int[x][m-y];//统计血量
        ru[x-1][0] = v;//进入地图后初始血量
        for(int i = x-1 ; i >= 0 ; i --){
            for(int j = 0 ;j < m-y ; j ++){
                if(i == x-1 && j == 0)//已计算
                    continue;

                //寻找最大血量路线
                if(i == x-1){
                    ru[i][j] = bloodFilter(ru[i][j - 1] + map[i][j] , c);
                }
                if(j == 0){
                    ru[i][j] = bloodFilter(ru[i + 1][j]+ map[i][j] , c);
                }
                if(i != x-1 && j != 0){
                    ru[i][j] = bloodFilter(maxBlood(ru[i][j-1] , ru[i+1][j])+ map[i][j] , c);
                }
            }
        }
        //右下
        int[][] rd = new int[n-x][m-y];//统计血量
        rd[0][0] = v;//进入地图后初始血量
        for(int i = 0 ; i < n-x ; i ++){
            for(int j = 0 ;j < m-y ; j ++){
                if(i == 0 && j == 0)//已计算
                    continue;

                //寻找最大血量路线
                if(i == 0){
                    rd[i][j] = bloodFilter(rd[i][j - 1] + map[i][j] , c);
                }
                if(j == 0){
                    rd[i][j] = bloodFilter(rd[i - 1][j]+ map[i][j] , c);
                }
                if(i != 0 && j != 0){
                    rd[i][j] = bloodFilter(maxBlood(rd[i][j-1] , rd[i-1][j])+ map[i][j] , c);
                }
            }
        }

        int max = Integer.MIN_VALUE;
        max = lu[0][0] > ld[n - x -1][0] ? lu[0][0] : ld[n - x -1][0];
        max = max > ru[0][m - y - 1] ? max : ru[0][m - y - 1];
        max = max > rd[n - 1][m - 1] ? max : rd[n - 1][m - 1];

        System.out.println(max);

    }

    public static int bloodFilter(int a , int c){
        if(a>c)
            return c;
        else
            return a;
    }

    public static int maxBlood(int a , int b){
        return a > b ? a : b;
    }
}
