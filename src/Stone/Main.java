package Stone;

import java.util.Scanner;

/**
 * Created by MurphySL on 2017/3/3.
 */
public class Main {

    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        int t = scanner.nextInt();
        int num;


        for(int i = 0 ;i < t ;i ++){
            num = 0;
            int n = scanner.nextInt();
            int a = scanner.nextInt();
            int b = scanner.nextInt();

            if(a % 2 == 0 && b % 2 == 0){
                for(int j = 1 ;j <= n ;j ++){
                    if(j % 2 == 0)
                        num ++;
                }
                num -=2;
            }else{
                num = n - 2;
            }

            if(num % 2 == 0){
                System.out.print("suantou");
            }else{
                System.out.print("huaye");
            }

        }

       /* int n = scanner.nextInt();
        int m = scanner.nextInt();
        int max = m , min = n;
        if(n > m){
            max = n;
            min = m;
        }

        System.out.print(gcd(max , min));*/

    }

   /* public static int gcd(int a , int b){
        if(b == 0)
            return a;
        return gcd(b , a%b);
    }*/
}
