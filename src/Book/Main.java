package Book;

import java.util.Scanner;

/**
 * Created by MurphySL on 2017/3/3.
 */
public class Main {

    static long m;/*金额*/
    static int n , k;/*书数 个数*/
    static int[] arr = new int[1000];
    static long[] price = new long[30];

    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        m = scanner.nextInt();
        n = scanner.nextInt();
        k = scanner.nextInt();



        for(int i = 0 ;i < n ;i ++){
            price[i] =scanner.nextLong();
        }

        arr[0] = 0;
        /*for(int i = 1 ;i < n ;i ++){
            arr[i] =
        }

        dfs(n);

        if(dfs() == 0){
            System.out.print("Yes");
        }else{
            System.out.print("No");
        }*/

    }

    private static void dfs(int n) {

    }
}
