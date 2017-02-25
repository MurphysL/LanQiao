package ToyBricks;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * 蒜头君有 n 块积木，编号分别为 1 到 n。一开始，蒜头把第 i 块积木放在位置 i。
 * 蒜头君进行 m 次操作，每次操作，蒜头把位置 b 上的积木整体移动到位置 a 上面。
 * 比如 1 位置的积木是 1，2 位置的积木是 2，那么把位置 2 的积木移动到位置 1 后，位置 1 上的积木从下到上依次为 1,2。
 *
 * List 循环长度 固定
 * trimToSize()???????
 */
public class Main {

    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int m = scanner.nextInt();
        ArrayList<ArrayList<Integer>> list = new ArrayList<>();
        for(int i = 1 ;i <= n ;i ++){
            ArrayList<Integer> a = new ArrayList<>();
            a.add(i);
            list.add(a);
        }

        for(int i = 0 ;i < m ;i ++){
            int a = scanner.nextInt();
            int b = scanner.nextInt();
            ArrayList<Integer> al = list.get(a-1);
            ArrayList<Integer> bl = list.get(b-1);


            if(a != b){
                int length = bl.size();
                for(int j = 0 ;j < length;j ++)
                    al.add(bl.get(j));
                bl.clear();
                bl.trimToSize();
            }

        }

        for(int i = 0 ;i < n ;i ++){
            if(list.get(i).size() == 0)
                System.out.print("");
            else{
                for(int j = 0 ;j < list.get(i).size() ;j ++){
                    if(j != list.get(i).size() - 1)
                        System.out.print(list.get(i).get(j)+" ");
                    else
                        System.out.print(list.get(i).get(j));
                }
            }
            if(i != n -1)
                System.out.println("");
        }
    }
}
