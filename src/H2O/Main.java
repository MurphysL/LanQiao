package H2O;

import java.util.Scanner;

/**
 * Created by lenovo on 2016/12/12.
 */
public class Main {

    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        for(int i = 0 ;i < n ;i ++){
            String s = scanner.next().trim();
            change(s , s.length());
            if(i != n-1)
                System.out.println();
        }
    }

    private static void change(String s , int len) {
        int t;

        if (len % 3 != 0) {
            for (int j = 0; j < 3 - (len % 3); j++) {
                s = "0" + s;
            }
            len += 3 - (len % 3);
        }

        for (int j = 0; j + 3 <= len+1; j += 3) {
            int sum = 0;
            for (int m = 0; m < 3; m++) {
                t = (s.charAt(j + m) >= '0' && s.charAt(j + m) <= '9') ? (s.charAt(j + m) - '0')
                        : (s.charAt(j + m) - 'A' + 10);

                sum += (t << 4 * (2-m));
            }
            if(!(j == 0 && sum == 0))
                System.out.print(Integer.toOctalString(sum));
        }

    }


}
