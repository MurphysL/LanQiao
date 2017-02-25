package SortTwice;

import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

/**
 * 排序
 * Arrays.sort(num , op[3]-1 , op[4] , Collections.reverseOrder()); !!!!!!!!
 *
 */
public class Main {

    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int[] op = new int[5];
        for(int i = 0 ;i < 5 ;i ++){
            op[i] = scanner.nextInt();
        }

        Integer[] num = new Integer[op[0]];
        for(int i = 0 ;i < op[0] ;i ++){
            num[i] = scanner.nextInt();
        }

        Arrays.sort(num , op[1]-1 , op[2]);
        Arrays.sort(num , op[3]-1 , op[4] , Collections.reverseOrder());

        for(int i = 0 ;i < op[0] ;i ++){
            if(i != op[0] - 1){
                System.out.print(num[i] + " ");
            }else{
                System.out.print(num[i]);
            }
        }
    }
}
