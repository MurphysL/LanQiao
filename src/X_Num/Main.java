package X_Num;

import java.util.Scanner;

/**
 * 第一行，输入两个整数 n,X(1≤n≤20,1≤X≤2000)。
 * 接下来输入 n 个整数，每个整数不超过 100。
 * 输出格式
 * 输出一个整数，表示能凑出 X 的方案数。
 *
 *
 * 通过位运算 模拟 数组
 */
public class Main {

    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        int X = scanner.nextInt();
        int[] arr = new int[num];
        int ans = 0;
        for(int i = 0 ;i < num ;i ++){
            arr[i] = scanner.nextInt();
        }

        for(int i = 0 ;i < (1<<num) ;i ++){
            int n = 0;
            for(int j = 0 ;j < num ;j ++){
                if((i&(1<<j)) == 1<<j){
                    n += arr[j];
                }
            }
            if(n == X)
                ans ++;
        }

        System.out.print(ans);


    }
}
