package Rhombus;

/**
 *
 *  |   *
 *  |  * *
 *  | * * *
 *  |* * * *
 *  | * * *
 *  |  * *
 *  |   *
 *
 *  10行扭曲
 */
public class Main {

    public static void f(int n)//n = 14
    {
        for (int i = 0; i < n * 2 - 1; ++i) {//行数
            String s = ""+i;
            int k = i<n?i:(n-2)-(i-n);
            for (int j = 0; j < n - k - 1; ++j) {
                s += " ";
            }
            for (int j = 0; j < k * 2 + 1; ++j) {
                if ((j&1) != 0) {//j != 1
                    s += " ";
                } else {
                    s += "*";
                }
            }
            System.out.println(s);
        }
    }
    public static void main(String[] args) {
        f(14);
    }

}
