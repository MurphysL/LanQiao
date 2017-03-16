package Book;

import java.util.Scanner;

/**
 * 蒜头君去书店买书，他有 m 元钱，书店里面有 n 本书，每本书的价格为 p_i
 ​​* 元。蒜头君很爱学习，想把身上钱都用来买书，并且刚好买 k 本书。
 * 请帮蒜头君计算他是否能刚好用 m 元买 k 本书。
 */
public class Main {

    private static long m;/*金额*/
    private static int n , k;/*书数 个数*/
    private static long[] price = new long[30];//书价格

    private static boolean[] isplace = new boolean[30];//书是否已选
    private static boolean can = false;//能否凑齐
    private static int[] books = new int[30];//已选数目
    private static int sum = 0;//已选书总价

    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        m = scanner.nextInt();
        n = scanner.nextInt();
        k = scanner.nextInt();

        for(int i = 0 ;i < n ;i ++){
            price[i] =scanner.nextLong();
            books[i] = Integer.MIN_VALUE;
        }

        dfs(0);
        for(int i = 0 ;i < k ;i ++){
            for(int num = 0 ;num < n ;i ++){
                if(can)
                    return;
                if(!isplace[num]){

                }
            }
        }
        if(can){
            System.out.print("Yes");
        }else{
            System.out.print("No");
        }

    }

    private static void dfs(int book) {
        for(int num = 0 ;num < n ;num ++){
            if(can)
                return;

            if(!isplace[num]){//未选
                isplace[num] = true;
                sum += price[num];
                books[book] = num;//这次选哪本书
                /*for(int i = 0 ;i < k;i ++){
                    System.out.print(books[i] +" ");
                }
                System.out.print(sum);
                System.out.println();*/
                if(book == k-1 && sum == m){
                    can = true;
                    return;
                }
                if(book < k-1 && sum < m){
                    dfs(book + 1);
                }
            }

            if(books[book] != Integer.MIN_VALUE){
                isplace[books[book]] = false;
                sum -= price[books[book]];
                books[book] = Integer.MIN_VALUE;
            }

        }
    }
}
