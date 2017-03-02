package VisitWeb_WRONG;

import java.util.Scanner;
import java.util.Stack;

/**
 * 蒜头君每天都在用一款名为“蒜厂浏览器”的软件。在这个浏览器中，一共三种操作：打开页面、回退和前进。它们的功能如下：
 *
 * 打开页面：在地址栏中输入网址，并跳转到网址对应的页面；
 * 回退：返回到上一次访问的页面；
 * 前进：返回到上次回退前的页面，如果上一次操作是打开页面，那么将无法前进。
 * 现在，蒜头君打开浏览器，进行了一系列操作，你需要输出他每次操作后所在页面的网址
 */
public class Main {

    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        Stack<String> web = new Stack<>();
        Stack<String> web2 = new Stack<>();
        int num = scanner.nextInt();

        String now = "";

        for(int i = 0 ;i < num ;i ++){
            String op = scanner.next().trim();

            if(op.equals("VISIT")){
                if(!now.equals(""))
                    web.add(now);
                now = scanner.next().trim();
                System.out.println(now);
                for(int j = 0 ;j < web2.size() ;j ++){
                    web.add(web2.pop());
                }
            }else if(op.equals("BACK")){
                if(web.size() > 0){
                    web2.add(now);
                    now = web.pop();
                    System.out.println(now);
                }else{
                    System.out.println("Ignore");
                }
            }else{
                if(web2.size() > 0){
                    web.add(now);
                    now = web2.pop();
                    System.out.println(now);
                }else{
                    System.out.println("Ignore");
                }
            }
        }


    }
}
