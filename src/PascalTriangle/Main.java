package PascalTriangle;

import java.util.Scanner;

/**
 * 杨辉三角形又称Pascal三角形，它的第i+1行是(a+b)i的展开式的系数。
 * 它的一个重要性质是：三角形中的每个数字等于它两肩上的数字相加。
 * 下面给出了杨辉三角形的前4行：
 * 1
 * 1 1
 * 1 2 1
 * 1 3 3 1
 * 给出n，输出它的前n行。
 */
public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] a = new int[n];
        if(n > 1){
            a[1] = 1;
        }
        a[0] = 1;
        for (int i = 1; i <= n; i++) {
            if(i >= 3){
                int[] b= new int[i];
                b[0] = 1;
                b[i - 1] = 1;
                for(int j = 1 ; j < i -1;j ++){
                    b[j] = a[j -1] + a[j];
                }
                for(int j = 0 ;j < i;j ++){
                    a[j] = b[j];
                }
            }
            for(int m = 0 ; m < i ;m ++){

                if(m == i-1){
                    System.out.print(a[m]);
                }else{
                    System.out.print(a[m] + " ");
                }
            }
            if(i != n){
                System.out.println();
            }
        }
    }


}
