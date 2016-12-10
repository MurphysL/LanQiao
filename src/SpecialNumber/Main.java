package SpecialNumber;

/**
 * 153是一个非常特殊的数，它等于它的每位数字的立方和，即153=1*1*1+5*5*5+3*3*3。编程求所有满足这种条件的三位十进制数。
 */
public class Main {
    public static void main(String[] args){
        for(int i = 100 ;i <= 999;i ++){
            int b = i /100;
            int s = (i % 100) / 10;
            int g = i%10;
            if(i == b * b* b + s *s *s + g * g* g){
                System.out.println(i);
            }
        }
    }
}
