package Maze_BFS;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

/**
 * 给你一个 n 行 m 列的二维迷宫。'S'表示起点，'T' 表示终点，'#' 表示墙壁，'.' 表示平地。
 * 你需要从 'S' 出发走到 'T'，每次只能上下左右走动，并且不能走出地图的范围以及不能走到墙壁上。
 * 请你计算出走到终点需要走的最少步数。
 *
 * 坑：LinkedList 、boolean--》步数
 */
public class Main {
    static int n , m;
    static String[] maze = new String[100];
    static int[][] pass = new int[100][100];
    static Queue<Position> queue = new LinkedList<>();
    static int[][] op = {{-1,0},{0,1},{1,0},{0,-1}};//上，左，下，右

    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        n = scanner.nextInt();
        m = scanner.nextInt();

        //寻找起点，入栈
        for(int i = 0 ;i < n;i ++){
            maze[i] = scanner.next();
            for(int j = 0 ;j < m ;j ++){
                pass[i][j] = -1;
                if(maze[i].charAt(j) == 'S'){
                    Position position = new Position(i , j);
                    queue.add(position);
                    pass[i][j] = 0;
                }
            }
        }
        System.out.print(bfs());
    }

    public static int bfs(){
        while(queue.size() > 0){
            Position position = queue.remove();
            for(int i = 0 ;i < 4;i ++){
                int x = position.x + op[i][0];
                int y = position.y + op[i][1];
                if(isRight(x , y)){
                    pass[x][y] = pass[position.x][position.y] + 1;
                    if(maze[x].charAt(y) == 'T'){
                        return pass[x][y];
                    }else{
                        Position p = new Position(x , y);
                        //System.out.println(". " + p.x +" "+p.y);
                        queue.add(p);
                    }
                }else{
                    //System.out.println("# " + x +" "+y);
                }
            }
        }
        return -1;
    }

    static boolean isRight(int x , int y){
        if(x<n && y < m && x >= 0 && y >= 0 && maze[x].charAt(y) != '#' && pass[x][y] == -1){//不超出边界
            return true;
        }else{
            return false;
        }
    }

    static class Position{
        int x ;
        int y ;
        public Position(int x , int y){
            this.x = x;
            this.y = y;
        }
    }
}
