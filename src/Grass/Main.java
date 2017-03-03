package Grass;

import java.util.Scanner;

/**
 * 蒜头君和他的朋友周末相约去召唤师峡谷踏青。他们发现召唤师峡谷的地图是由一块一块格子组成的，
 * 有的格子上是草丛，有的是空地。草丛通过上下左右 4 个方向扩展其他草丛形成一片草地，
 * 任何一片草地中的格子都是草丛，并且所有格子之间都能通过上下左右连通。如果用'#'代表草丛，'.'代表空地，
 */
public class Main {

    static boolean[][] vis = new boolean[100][100];//是否访问过
    static String[] map = new String[100];
    static int dir[][] = {{-1,0},{1,0},{0,-1},{0,1}};
    static int n , m , num;

    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        n = scanner.nextInt();
        m = scanner.nextInt();

        for(int i = 0 ;i < n ;i ++){
            map[i] = scanner.next().trim();
            for(int j = 0 ;j < m ;j ++){
                if(map[i].charAt(j) == '.')
                    vis[i][j] = true;
            }
        }

        int x, y;

        for(int i = 0;i < n ;i ++){
            for(int j = 0 ;j < m ;j ++){
                if(map[i].charAt(j) == '#' && !vis[i][j]){
                    x = i;
                    y = j;
                    num ++;
                    dfs(x , y);
                }
            }
        }

        System.out.print(num);

    }

    private static void dfs(int x, int y) {
        if(x < 0 || y < 0 ||x >=n || y >= m)
            return;
        if(vis[x][y] || map[x].charAt(y)=='.')
            return;

        vis[x][y] = true;
        dfs(x+dir[0][0] , y+dir[0][1]);
        dfs(x+dir[1][0] , y+dir[1][1]);
        dfs(x+dir[2][0] , y+dir[2][1]);
        dfs(x+dir[3][0] , y+dir[3][1]);

    }


}
