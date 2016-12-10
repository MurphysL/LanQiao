package AplusB;

import java.util.Scanner;

/**
 * 输入A、B，输出A+B。
 */
public class Main {

    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        System.out.print(a + b);
    }
}
