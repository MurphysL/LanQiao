package FourLeavedNum;


/**
 * 如果一个 44 位数，它的每个位上的数字的 44 次幂之和等于它本身，那么我们就称这个数字为一个四叶玫瑰数。现在，我们要求出所有的四叶玫瑰数。
 */
public class Main {

    public static void main(String[] args){
        for(int i = 1000 ;i < 10000 ;i ++){
            int g = i%10;
            int s = i%100/10;
            int b = i%1000 / 100;
            int q = i /1000;
            if(g*g*g*g + s*s*s*s + b*b*b*b + q*q*q*q == i){
                System.out.print(i+" ");
            }
        }

    }
}
