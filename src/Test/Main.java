package Test;

import java.util.HashSet;
import java.util.Scanner;

/**
 * 蒜头君快要考托福了，这几天，蒜头君每天早上都起来记英语单词。花椰妹时不时地来考一考蒜头君：花椰妹会询问蒜头君一个单词，
 * 如果蒜头君背过这个单词，蒜头君会告诉花椰妹这个单词的意思，不然蒜头君会跟花椰妹说还没有背过。单词是由连续的大写或者小写字母组成。
 * 注意单词中字母大小写是等价的。比如You和you是一个单词。
 *
 * String intern
 * 可以存在换行！！！！！
 * set contains
 */
public class Main {

    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        HashSet<String> set = new HashSet<String>();
        for(int i = 0 ;i < n ;i ++){
            int f = scanner.nextInt();
            if(f == 0)
                set.add(scanner.next().toLowerCase().trim());
            else{
                String ss = scanner.next().toLowerCase().trim();
                if(set.contains(ss))
                    System.out.println("Yes");
                else
                    System.out.println("No");

            }
        }

    }
}
