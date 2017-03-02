package Random;

import java.util.*;

/**
 * Created by MurphySL on 2017/2/25.
 */
public class Main {

    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        ArrayList<Integer> list = new ArrayList<>();
        ArrayList<Integer> delet = new ArrayList<>();
        for(int i = 0 ; i < n ;i ++){
            list.add(scanner.nextInt());
        }

        Collections.sort(list);

        int j = 0;
        for(int i  =  1 ;i < n ;i ++){
            if(Objects.equals(list.get(i), list.get(j)))
                delet.add(i);
            j ++;
        }

        for(int i = 0 ;i < delet.size() ;i ++){
            list.remove(delet.get(i)-i);
        }

        System.out.println(list.size());
        for(int i = 0 ;i < list.size() ;i ++){
            if(i != list.size() - 1)
                System.out.print(list.get(i) + " ");
            else
                System.out.print(list.get(i));
        }


    }
}
