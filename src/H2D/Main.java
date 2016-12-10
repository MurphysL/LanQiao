package H2D;

import java.util.Scanner;

/**
 * 从键盘输入一个不超过8位的正的十六进制数字符串，将它转换为正的十进制数后输出。
 *　　注：十六进制数中的10~15分别用大写的英文字母A、B、C、D、E、F表示。
 */
public class Main {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.print(Long.parseLong(scanner.next().trim() , 16));
    }
}
