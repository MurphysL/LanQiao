package Queue;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

/**
 * ﻿队列操作题。根据输入的操作命令，操作队列（1）入队、（2）出队并输出、（3）计算队中元素个数并输出。
 */
public class Main {

    public static void main(String[] args){
        Queue<Integer> queue = new LinkedList<Integer>();
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();

        for(int i = 0 ;i < num ;i ++){
            int c = scanner.nextInt();
            if(c== 1){
                queue.add(scanner.nextInt());
            }
            if(c==2){
                if(queue.isEmpty()){
                    System.out.print("no");
                    break;
                }else{
                    System.out.println(queue.remove());
                }
            }
            if(c==3){
                System.out.println(queue.size());
            }
        }
    }
}
