package Matrix;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * 锯齿矩阵是指每一行包含的元素个数不相同的矩阵
 *
 * 读入若干对整数 (x,y)(x,y)，表示在第 xx 行的末尾加上一个元素 yy。输出最终的锯齿数组。初始时矩阵为空。
 */
public class Main {

    public static void main(String[] args){
        ArrayList<List> list = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        int row = scanner.nextInt();
        int num = scanner.nextInt();
        for(int i = 0 ;i < row ;i ++){
            ArrayList<Integer> a = new ArrayList<>();
            list.add(a);
        }
        for(int i = 0 ;i < num ;i ++){
            int r = scanner.nextInt();
            int x = scanner.nextInt();
            list.get(r-1).add(x);
        }

        for(int i = 0 ;i < row ;i ++){
            for(int j =0 ;j < list.get(i).size() ;j ++){
                if(j == list.get(i).size() - 1)
                    System.out.print(list.get(i).get(j));
                else
                    System.out.print(list.get(i).get(j)+" ");
            }

            if(i != row -1)
                System.out.println();
        }
    }
}
