package LeapYear;

import java.util.Scanner;

/**
 * Created by lenovo on 2016/12/10.
 */
public class Main {

    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int year = scanner.nextInt();
        if(year % 400 == 0 ||year % 4== 0 && year % 100 != 0){
            System.out.print("yes");
        }else{
            System.out.print("no");
        }
    }
}
