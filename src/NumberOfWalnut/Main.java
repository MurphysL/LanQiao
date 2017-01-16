package NumberOfWalnut;

import java.util.Scanner;

/**
 * 小张是软件项目经理，他带领3个开发组。工期紧，今天都在加班呢。为鼓舞士气，小张打算给每个组发一袋核桃（据传言能补脑）。他的要求是：
 *
 * 1. 各组的核桃数量必须相同
 *
 * 2. 各组内必须能平分核桃（当然是不能打碎的）
 *
 * 3. 尽量提供满足1,2条件的最小数量（节约闹革命嘛）
 */
public class Main {

    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();

        int gcd1  = GCD(a , b);
        int r1 = a * b / gcd1;
        int gcd2 = GCD(r1 , c);
        System.out.print(r1*c/gcd2);

    }

    private static int GCD(int a , int b){
        int max , min;
        if(a > b){
            max = a;
            min = b;
        }else{
            max = b;
            min = a;
        }

        for(int i = min ;i > 1 ;i --){
            if(max % i == 0 && min % i == 0)
                return i;
        }
        return 1;
    }
}
