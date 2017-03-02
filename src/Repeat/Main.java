package Repeat;

import java.util.HashMap;
import java.util.Scanner;

/**
 * 给定 n 个整数，求里面出现次数最多的数，如果有多个重复出现的数，求出值最大的一个。
 */
public class Main {

    public static void main(String[] args){

        HashMap<Integer , Integer> map = new HashMap<>();
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        for(int i = 0 ;i < num ;i ++){
            int key = scanner.nextInt();
            if(map.containsKey(key)){
                int value = map.get(key) + 1;
                map.put(key , value);
            }else{
                map.put(key , 1);
            }

        }

        int maxValue = Integer.MIN_VALUE;
        int max = Integer.MIN_VALUE;
        for(HashMap.Entry m : map.entrySet()){
            if(maxValue < (int)m.getValue()){
                max = (int) m.getKey();
                maxValue = (int) m.getValue();
            }
            if(maxValue == (int)m.getValue()){
                if(max < (int)m.getKey()){
                    max = (int)m.getKey();
                    maxValue = (int)m.getValue();
                }
            }
        }

        System.out.print(max +" " + maxValue);
    }
}
