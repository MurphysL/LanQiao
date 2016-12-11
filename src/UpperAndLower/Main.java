package UpperAndLower;

import java.util.Scanner;

/**
 * 编写一个程序，输入一个字符串（长度不超过20），然后把这个字符串内的每一个字符进行大小写变换，即将大写字母变成小写，小写字母变成大写，然后把这个新的字符串输出。
 *　输入格式：输入一个字符串，而且这个字符串当中只包含英文字母，不包含其他类型的字符，也没有空格。
 *　输出格式：输出经过转换后的字符串。
 */
public class Main {

    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        String s = scanner.next().trim();
        StringBuilder stringBuilder = new StringBuilder(s);
        char[] c = new char[1];
        for(int i = 0 ; i < s.length() ;i ++){
            c[0] = s.charAt(i);
            if(c[0] >= 'a' && c[0] <= 'z'){
                c[0] = (char) (c[0]+'A' - 'a');
                stringBuilder.replace(i , i + 1 , new String(c));
            }else{
                c[0] = (char) (c[0] - 'A' + 'a');
                stringBuilder.replace(i , i + 1 , new String(c));
            }
        }
        System.out.print(stringBuilder);
    }
}

