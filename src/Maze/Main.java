package Maze;

import java.util.Scanner;

/**
 * 给一个 n 行 m 列的 2 维的迷宫，'S'表示迷宫额起点，'T'表示迷宫的终点，
 * '#'表示不能通过的点，'.' 表示可以通过的点。
 * 你需要从'S'出发走到'T'，每次只能上下左右走动，并且只能进入能通过的点，每个点只能通过一次。
 * 现在要求你求出有多少种通过迷宫的的方案。
 *
 * boolean 默认false
 */
public class Main {
    static String[] mat = new String[11]; // 地图信息
    static int ans, n, m; // ans 用来记录最后答案 n, m 表示行列
    static int dir[][] = {{1, 0}, {0, 1}, {-1, 0}, {0, -1}};  //对应的上下左右4各方向
    static boolean vis[][] = new boolean[11][11];// 用来标记是否访问

    public static void main(String[] args) {
        Scanner cin = new Scanner(System.in);
        n = cin.nextInt();
        m = cin.nextInt();
        for (int i = 0; i < n; ++i) {
            mat[i] = cin.next();
        }
        int x = 0, y = 0;
        for (int i = 0; i < n; ++i) {
            for (int j = 0; j < m; ++j) {
                if (mat[i].charAt(j) == 'S') {
                    x = i;
                    y = j;
                }
            }
        }

        ans = 0;
        dfs(x, y);
        System.out.println(ans);
    }

    static void dfs(int x, int y) {
        if(x < 0 || y <0 ||x >= n || y >= m){
            return;
        }

        if(vis[x][y] ||mat[x].charAt(y) == '#')
            return;

        if(mat[x].charAt(y) == 'T'){
            ans ++;
            return;
        }


        vis[x][y] = true;
        dfs(x+dir[0][0] , y+dir[0][1]);
        dfs(x+dir[1][0] , y+dir[1][1]);
        dfs(x+dir[2][0] , y+dir[2][1]);
        dfs(x+dir[3][0] , y+dir[3][1]);

        vis[x][y] = false;

    }
}