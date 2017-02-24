package Liangyi;

import java.util.Scanner;

/**
 * 两仪剑法是武当派武功的高级功夫，且必须 2 个人配合使用威力才大。
 * 同时该剑法招数变化太快、太多。设武当弟子甲招数变化周期为 n，武当弟子乙招数变化周期为 mm，
 * 两弟子同时使用该剑法，当 2 人恰好同时达到招数变化周期结束时，威力最大，此时能将邪教妖人置于死地。
 * 请你计算威力最大时，每人用了多少招？
 *
 *
 * 1.Long
 * 2.不能用递归！！！！
 * 3.边输入边输出
 */
public class Main {

    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();

        for(int i = 0 ;i < num ;i ++){
            long n = scanner.nextLong();
            long m = scanner.nextLong();
            long result;
            if(n > m){
                result = (n * m / gcd(n , m));
            }else{
                result = n * m / gcd(m , n);
            }
            if(i == num -1)
                System.out.print(result);
            else
                System.out.println(result);
        }

    }

    /**
     * 求最小公约数
     *
     * @param n
     * @param m
     * @return
     */
    public static long gcd(long n , long m){
        do{
            long mod = n % m;
            n = m;
            m = mod;
        }while(m != 0);

        return n;
    }
}
