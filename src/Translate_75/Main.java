package Translate_75;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

/**
 * 字典部分以START开始，以END结束。
 * 中间部分每行两个单词，第一个是英文，第二个是蒜厂秘籍文字，以单个空格隔开。
 * 接下来是历史书部分，同样以START开始，以END结束。
 * 历史书包含若干行文本，如果其中的单词（由连续的英文字母组成）在字典上出现过，且是蒜厂秘籍文字，则把它替换成英文；
 * 否则，保留该单词，也保留所有非英文字母的特殊符号。文本长度不超过 10000。
 */
public class Main {

    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        String s = scanner.next().trim();
        HashMap<String , String> map = new HashMap<>();
        ArrayList<String> newList = new ArrayList<>();

        //字典
        if(s.equals("START")){
            s = scanner.next().trim();
            String s1;
            while(!s.equals("END")){
                s1 = scanner.next().trim();
                map.put(s1 , s);
                s= scanner.next().trim();
            }
        }

        //翻译开始
        s = scanner.next().trim();
        if(s.equals("START")){
            String s1 = scanner.nextLine().trim();
            while(!s1.equals("END")){
                char[] c = s1.toCharArray();
                String newstring = "";
                int start = 0;
                for(int i = 0 ;i < c.length ;i ++){
                    if( !(((int)c[i]) >= 65 && ((int)c[i]) <= 90)
                            && !(((int)c[i]) >= 97 && ((int)c[i]) <= 122)){
                        if(map.containsKey(s1.substring(start , i))){
                            newstring += map.get(s1.substring(start , i));
                        }else{
                            newstring +=s1.substring(start , i);
                        }
                        newstring += c[i];
                        start = i + 1;
                    }
                }
                newstring +=s1.substring(start , c.length);
                newList.add(newstring);
                s1 = scanner.nextLine().trim();
            }

        }

        for(int i = 1 ;i < newList.size() ;i ++){
            if(i == newList.size() - 1)
                System.out.print(newList.get(i));
            else
                System.out.println(newList.get(i));
        }

    }
}
