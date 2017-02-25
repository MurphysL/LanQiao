package Triangle;

import java.util.Scanner;

/**
 * Created by MurphySL on 2017/2/23.
 */
public class Main {

    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);
        int character = scanner.next().charAt(0);
        boolean isNum = true;
        if(character >= 65 && character <= 90)
            isNum = false;

        if(isNum){
            draw(49 , character);
        }else{
            draw(65 , character);
        }

    }

    private static void draw(int start , int end) {

        //49 51

        for(int i = 0 ;i <= end - start ;i ++){
            //空格
            for(int j = 0 ;j < end - start - i;j ++){
                System.out.print(" ");
            }
            int n;
            for(n = 0 ;n <= i ;n ++){
                System.out.print((char)(start + n));
            }
            for(int m = n-2 ; m >=0 ; m --){
                System.out.print((char)(start + m));
            }
            System.out.println();
        }
    }
}
