package YanghuiTriangle;

import java.util.Scanner;

/**
 * Created by MurphySL on 2017/2/23.
 */
public class Main {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        int m = scanner.nextInt();

        long[][] value = new long[n+1][n+1];
        for(int i = 0 ;i <= n ;i ++){
            for(int j = 0 ;j <= n ;j ++){
                value[i][j] = 0;
            }
        }
        value[1][1] = 1;
        for(int i = 2 ;i <= n ; i++){
            for(int j = 1 ;j <= i ;j ++){
                value[i][j] = value[i - 1][j - 1] + value[i - 1][j];
            }
        }

        System.out.print(value[n][m]);
    }
}
