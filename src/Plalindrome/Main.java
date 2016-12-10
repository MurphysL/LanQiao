package Plalindrome;

/**
 * 1221是一个非常特殊的数，它从左边读和从右边读是一样的，编程求所有这样的四位十进制数。
 */
public class Main {
    public static void main(String[] args){
        for(int i = 10 ;i <= 99 ;i ++){
            System.out.println(i +"" + i %10 + "" + i/10);
        }
    }
}
