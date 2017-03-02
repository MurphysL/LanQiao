package Set;

import java.util.*;

/**
 * 给你两个集合，计算其并集，即 \{A\} + \{B\}{A}+{B}。
 *
 * 注：{A} + {B} 中不允许出现重复元素，但是 {A} 与 {B} 之间可能存在相同元素。
 *
 *
 * set toArray!!!!!参数
 */
public class Main {

    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int m = scanner.nextInt();
        HashSet<Integer> set = new HashSet<Integer>();

        for(int i = 0 ;i < n ;i ++){
            int value = scanner.nextInt();
            set.add(value);
        }

        for(int i = 0 ;i < m ;i ++){
            int value = scanner.nextInt();
            set.add(value);
        }


        Integer[] list = set.toArray(new Integer[0]);
        Arrays.sort(list);
        for(int i = 0 ;i < list.length ;i ++){
            if(i != list.length - 1)
                System.out.print(list[i]+" ");
            else
                System.out.print(list[i]);
        }
    }
}
