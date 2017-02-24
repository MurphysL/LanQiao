package CirculatingDecimal;

import java.util.Scanner;
import java.util.Vector;


/**
 * 两个整数做除法，有时会产生循环小数，其循环部分称为：循环节。

 比如，11/13=0.846153846153 其循环节为846153共有 6 位。
 */
class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int m = input.nextInt();
        System.out.println(f(n, m));
    }
    public static int f(int n, int m) {
        n = n % m;
        Vector<Integer> v = new Vector<Integer>();

        for(;;) {
            v.add(n);
            n *= 10;
            n = n % m;
            if(n == 0) return 0;
            if(v.indexOf(n) >= 0) {
                return v.size() - v.indexOf(n);
            }
        }
    }
}