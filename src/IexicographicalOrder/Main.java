package IexicographicalOrder;

import java.util.Scanner;

/**
 * 四平方和定理，又称为拉格朗日定理：每个正整数都可以表示为至多 4 个正整数的平方和。如果把 0 包括进去，就正好可以表示为 4 个数的平方和。
 * 你需要求出字典序最小的一组解 a,b,c,da,b,c,d。
 * 字典序大小：从左到右依次比较，如果相同则比较下一项，直到有一项不同，较小的一方字典序更小，反之字典序更大，所有项均相同则二者字典序相同。
 */
public class Main {

    public static void main(String[] args){
        long num ;
        Scanner scanner = new Scanner(System.in);
        num = scanner.nextLong();

        System.out.print(test(num));

    }

    private static String test(long num){
        int x = (int) Math.sqrt(num);
        for(int a = 0 ;a <= x ;a ++){
            for(int b = a ; b <= x ;b ++){
                for(int c = b ; c <= x ;c ++){
                    for(int d = c ;d <= x ;d ++){
                        if(a*a + b*b + c*c + d*d == num){
                            return a+" "+b+" "+c+" "+d;
                        }
                    }
                }
            }
        }

        return null;
    }
}
