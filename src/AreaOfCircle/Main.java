package AreaOfCircle;

import java.text.DecimalFormat;
import java.util.Scanner;

/**
 * 给定圆的半径r，求圆的面积。
 */
public class Main {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int r = scanner.nextInt();
        double area = Math.PI*r*r;
        DecimalFormat format = new DecimalFormat("#.0000000");
        System.out.print(format.format(area));
    }
}
