package Bag01;

import java.util.Scanner;

/**
 * Created by lenovo on 2016/12/16.
 */
public class Main {

    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int num , weight;
        num = scanner.nextInt();
        weight = scanner.nextInt();
        int[][] things = new int[2 *num][2];

        for(int i = 0 ; i < num ;i ++){
            things[i][0] = scanner.nextInt();
            things[i][1] = scanner.nextInt();
        }

        for(int i = 0 ;i < num ; i ++){

        }
    }
}
