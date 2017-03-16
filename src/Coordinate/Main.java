package Coordinate;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

/**
 * 在一个长度为 n 的坐标轴上，蒜头君想从 A 点 移动到 B 点。他的移动规则如下：
 *
 * 向前一步，坐标增加 1。
 * 向后一步，坐标减少 1。
 * 跳跃一步，使得坐标乘 2。
 *  A 点移动到 B 点的最少步数是多少？
 */
public class Main {
    static int A , B ,n;
    static int[] pass = new int[5001];
    static Queue<Integer> queue = new LinkedList();

    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        n = scanner.nextInt();
        A = scanner.nextInt();
        B = scanner.nextInt();
        for(int i = 0 ;i <= n ;i ++){
            pass[i] = -1;
            if(i == A){
                pass[i] = 0;
                queue.add(A);
            }
        }
        System.out.print(BFS());
    }

    private static boolean isRight(int x){
        if(x >= 0  && x <= n && pass[x] == -1 ){
            return true;
        }
        return false;
    }

    private static int BFS() {
        while(queue.size() > 0){
            int x = queue.remove();
            for(int i = 0 ;i < 3 ;i ++){
                int c = Integer.MIN_VALUE;
                switch (i){
                    case 0:
                        c = x + 1;
                        break;
                    case 1:
                        c = x -1;
                        break;
                    case 2:
                        c = x * 2;
                        break;
                }
                if(isRight(c)){
                    pass[c] = pass[x] + 1;
                    if(c == B){
                        return pass[c];
                    }else{
                        queue.add(c);
                    }
                }
            }
        }
        return -1;
    }
}
