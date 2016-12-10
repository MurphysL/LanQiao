package H2O;

import java.math.BigInteger;
import java.util.Scanner;

/**
 * 给定n个十六进制正整数，输出它们对应的八进制数。
 */
public class Main {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        String[] b = new String[n];
        for(int i = 0 ; i < n ; i ++){
            b[i] = (new BigInteger(scanner.next() , 16)).toString(8);
        }
        for(int i = 0 ; i < n ;i ++){
            System.out.println(b[i]);
        }
    }
}
