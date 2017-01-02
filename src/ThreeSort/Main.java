package ThreeSort;

import java.util.Scanner;

/**
 *  编写一个程序，输入3个整数，然后程序将对这三个整数按照从大到小进行排列。
 *　输入格式：输入只有一行，即三个整数，中间用空格隔开。
 */
public class Main {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        long a = scanner.nextLong();
        long b = scanner.nextLong();
        long c = scanner.nextLong();

        if(a < b){
            long t = a;
            a = b;
            b = t;
        }
        if(a < c){
            long t = a;
            a = c;
            c = t;
        }
        if(b < c){
            long t = b;
            b = c;
            c = t;
        }

        System.out.print(a + " " + b + " " + c);
    }
}
