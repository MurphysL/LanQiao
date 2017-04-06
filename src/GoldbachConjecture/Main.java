package GoldbachConjecture;

import java.util.Scanner;

/**
 * 判断素数:
 * i*i<j
 * Eratosthenes 筛选
 *
 * Created by MurphySL on 2017/4/6.
 */
public class Main {
    /**
     * 20
     * 3 17
     * 5 15
     */
    static long n ;
    static long num = 0;
    static boolean[] prime = new boolean[8000001];//初始化 false
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        n = scanner.nextLong();
        PrimeList();
        System.out.print(fun());
    }

    /**
     * 构建素数表
     */
    private static void PrimeList(){
        for(int i = 2 ;i*i <= n;i ++){
            if(!prime[i]){
                for(int j = i*i ;j <=n ;j += i){
                    prime[j] = true;
                }
            }
        }
    }

    private static long fun(){
        for(long i = 2 ;i <= n/2;i ++){
            if(!prime[(int) i]){
                if(!prime[(int) (n - i)])
                    num ++;
            }
        }
        return num;
    }
}
