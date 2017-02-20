package GodofShield_70;

import java.util.Scanner;

/**
 * 第一行两个数，分别为n，m。
 * 第二行n个数，表示盾神一开始的项链。第i个数表示第i颗珠子的颜色。
 * 接下来m行，为以下形式之一：
 * ADD P Q：表示在颜色为P的珠子前面加上一个颜色为Q的珠子。
 * DEL P：表示把颜色为P的珠子去掉，如果它不在端点处，则需要把它旁边的两颗珠子连起来。例如某时刻项链状态为1 4 5 8，则执行DEL 4会变成1 5 8，执行DEL 1会变成4 5 8。
 * 输入保证在每次操作之前，项链有颜色为P的珠子，且任意时刻珠子颜色互不相同。
 * 输出格式
 * 第一行为一个数len，为做完所有操作后，项链的长度。
 * 第二行len个数，表示此时项链的状态。第i个数表示第i颗珠子的颜色。
 */
public class Main {

    public static class Node{
        int num;
        Node next;
    }

    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        int op = scanner.nextInt();

        Node head = new Node();
        head.next = null;
        head.num = 0;

        Node temp = head;
        for(int i = 0 ;i < num ;i ++){
            int n = scanner.nextInt();
            Node node = new Node();
            node.num = n;
            temp.next = node;
            temp = node;
        }

        for(int i = 0 ;i < op ;i ++){
            String s = scanner.next().trim();
            Node t = head.next;

            if(s.equals("ADD")){
                int n = scanner.nextInt();
                int m = scanner.nextInt();
                Node t1 = head;
                while(t != null){
                    if(t.num == n){
                        Node node = new Node();
                        node.num = m;
                        t1.next = node;
                        node.next = t;
                        break;
                    }else{
                        t1 = t1.next;
                        t = t.next;
                    }
                }
                num ++;
            }else{
                int n = scanner.nextInt();
                Node t1 = head;
                while(t != null){
                    if(t.num == n){
                        if(t.next != null){
                            t.num = t.next.num;
                            t.next = t.next.next;
                        }else{
                            t1.next = null;
                        }

                        break;
                    }else{
                        t = t.next;
                        t1 = t1.next;
                    }
                }
                num --;
            }

        }

        System.out.println(num);

        Node t = head.next;
        while(t != null){
            if(t.next != null)
                System.out.print(t.num + " ");
            else
                System.out.print(t.num );
            t = t.next;
        }

    }
}
