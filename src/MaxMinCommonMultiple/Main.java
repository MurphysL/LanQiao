package MaxMinCommonMultiple;

import java.util.Scanner;

/**
 * 已知一个正整数N，问从1~N中任选出三个数，他们的最小公倍数最大可以为多少。
 */
public class Main {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        System.out.print(MMCommonMultiple(num));
    }

    public static long MMCommonMultiple(long num){
        if(num == 1)
            return 1;
        else if(num == 2)
            return 2;
        else{
            if(num %2 != 0){
                return num*(num-1)*(num-2);
            }else{
                if(num %3 != 0)
                    return num*(num-1)*(num-3);
                else
                    return (num-1)*(num-2)*(num-3);

            }
        }
    }
}
