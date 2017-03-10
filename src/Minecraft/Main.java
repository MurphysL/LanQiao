package Minecraft;

import java.util.Scanner;

/**
 * 蒜头君最近迷恋上了一款游戏《我的世界（Minecraft）》，在游戏里面蒜头君可以任意开发资源然后建造各种宏伟的建筑。
 * 有一天蒜头君发现了一块荒野的土地上有很多宝藏，蒜头君想在土地上建一栋房子从而把宝藏包围起来。
 * 假设地图是一个 n 行 m 列的方格地图，地图每个格子*代表一个宝藏。比如 2 行 2 列的地图如下
 */
public class Main {

    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int m = scanner.nextInt();

        for(int i = 0 ;i < 2*n+1 ;i ++){
            for(int j = 0 ;j < 2*m + 1 ;j ++){
                if(i % 2 == 0){
                    if(j % 2 == 0){
                        System.out.print('+');
                    }else{
                        System.out.print('-');
                    }
                }else{
                    if(j % 2 == 0){
                        System.out.print('|');
                    }else{
                        System.out.print('*');
                    }
                }
            }
            System.out.println();
        }
    }
}
