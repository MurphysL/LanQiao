package CompactIntegers;

import java.util.Scanner;

/**
 * 从键盘读入n个整数放入数组中，编写函数CompactIntegers，删除数组中所有值为0的元素，其后元素向数组首端移动。
 * 注意，CompactIntegers函数需要接受数组及其元素个数作为参数，函数返回值应为删除操作执行后数组的新元素个数。
 * 输出删除后数组中元素的个数并依次输出数组元素。
 */
public class Main {
    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] array = new int[2*n];
        int[] delete = new int[2*n+1];
        int sum = 0 ,num = 0, temp = 0;

        for(int i = 0 ; i< n ;i ++){
            array[i] = scanner.nextInt();
            if(array[i] == 0) {
                if(temp == 0)
                    temp = i+1;
                delete[temp] = ++num;
            }else{
                sum += num;
                temp = 0;
                num = 0;
                delete[i+1] = 0;
            }
        }
        sum += num;

        System.out.print(n - sum);
        CompactIntegers(array , delete , n-num);
    }

    private static void CompactIntegers(int[] array , int[] delete , int length){

        for(int i = 0 ; i< length ;i ++){
            if(i == 0)
                System.out.println();
            i += delete[i + 1];
            if(i == length - 1)
                System.out.print(array[i]);
            else
                System.out.print(array[i] + " ");
        }
    }
}
