package DynamicArrary;

import java.util.Scanner;

/**
 * 从键盘读入n个整数，使用动态数组存储所读入的整数，并计算它们的和与平均值分别输出。要求尽可能使用函数实现程序代码。平均值为小数的只保留其整数部分。
 */
public class Main {

    public  static  void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int sum = 0;
        for(int j = 0 ;j < n ;j ++){
            sum += scanner.nextInt();
        }

        System.out.print(sum + " " + ((int)sum /n));
    }
}
