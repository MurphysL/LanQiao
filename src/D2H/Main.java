package D2H;

import java.util.Scanner;

/**
 * 十六进制数是在程序设计时经常要使用到的一种整数的表示方式。它有0,1,2,3,4,5,6,7,8,9,A,B,C,D,E,F共16个符号，分别表示十进制数的0至15。十六进制的计数方法是满16进1，所以十进制数16在十六进制中是10，而十进制的17在十六进制中是11，以此类推，十进制的30在十六进制中是1E。
 *　给出一个非负整数，将它表示成十六进制的形式。
 */
public class Main {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        long d = scanner.nextLong();
        String s = Long.toHexString(d);
        StringBuilder builder = new StringBuilder(s);
        char[] t = new char[1];
        for(int i = 0 ; i< s.length(); i ++){
            if(s.charAt(i) >= 'a' && s.charAt(i) <= 'z'){
                t[0] = (char) (s.charAt(i) + 'A' - 'a');
                builder.replace(i ,i + 1 , new String(t));
            }
        }
        System.out.print(builder);
    }
}
