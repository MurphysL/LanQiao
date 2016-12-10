package LeapYear;

import java.util.Scanner;

/**
 * 给定一个年份，判断这一年是不是闰年。
 *
 * 当以下情况之一满足时，这一年是闰年：
 *
 * 1. 年份是4的倍数而不是100的倍数；
 *
 * 2. 年份是400的倍数。
 *
 * 其他的年份都不是闰年。
 */
public class Main {

    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int year = scanner.nextInt();
        if(year % 400 == 0 ||year % 4== 0 && year % 100 != 0){
            System.out.print("yes");
        }else{
            System.out.print("no");
        }
    }
}
