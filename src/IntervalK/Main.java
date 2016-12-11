package IntervalK;

import java.util.Arrays;
import java.util.Scanner;

/**
 * 给定一个序列，每次询问序列中第l个数到第r个数中第K大的数是哪个。
 */
public class Main {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] a = new int[n];
        for(int i = 0 ;i < n ;i ++){
            a[i] = scanner.nextInt();
        }

        int m = scanner.nextInt();
        int[][] b = new int[m][3];
        for(int i = 0 ;i < m ;i ++){
            for(int j = 0 ;j < 3;j ++){
                b[i][j] = scanner.nextInt();
            }
        }

        int[] t;
        for(int i = 0 ;i < m ;i ++){
            t = a.clone();//clone新地址
            Arrays.sort(t , b[i][0]-1 , b[i][1]);
            System.out.println(t[b[i][1]-1-b[i][2] + 1]);
        }
    }
}

