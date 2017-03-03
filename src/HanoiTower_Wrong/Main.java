package HanoiTower_Wrong;

import java.util.Scanner;

/**
 * Created by MurphySL on 2017/3/3.
 */
public class Main {

    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();

        System.out.print(Hanoi(num));
    }

    public static int Hanoi(int n){
        if(n == 1){
            return 1;
        }

        return 2*Hanoi(n - 1) + 1;
    }
    /*
    * 1 1
    * 2 4 1.1.2
    * 3 11 1.1.3.1.2.2.1
    *
    *
    * */
    public static int HanoiStrp(int n){
        if(n == 1)
            return 1;
        return 0;
    }
}
