package H2O_RunTimeError;

import java.util.Scanner;

/**
 * 给定n个十六进制正整数，输出它们对应的八进制数。
 */
public class Main {
    public static void main(String[] args){
        Scanner scanner =new Scanner(System.in);
        int n = scanner.nextInt();
        String[] s = new String[n];
        for(int i = 0 ;i < n;i ++){
            String temp = scanner.next().trim();
            s[i]="";
            for(int j = 0 ;j < temp.length();j ++){
                switch (temp.charAt(j)){
                    case '0':
                        s[i] += "0000";
                        break;
                    case '1':
                        s[i] += "0001";
                        break;
                    case '2':
                        s[i] += "0001";
                        break;
                    case '3':
                        s[i] += "0011";
                        break;
                    case '4':
                        s[i] += "0100";
                        break;
                    case '5':
                        s[i] += "0101";
                        break;
                    case '6':
                        s[i] += "0110";
                        break;
                    case '7':
                        s[i] += "0111";
                        break;
                    case '8':
                        s[i] += "1000";
                        break;
                    case '9':
                        s[i] += "1001";
                        break;
                    case 'A':
                        s[i] += "1010";
                        break;
                    case 'B':
                        s[i] += "1011";
                        break;
                    case 'C':
                        s[i] += "1100";
                        break;
                    case 'D':
                        s[i] += "1101";
                        break;
                    case 'E':
                        s[i] += "1110";
                        break;
                    case 'F':
                        s[i] += "1111";
                        break;
                    default:
                        s[i]+="";
                        break;
                }
            }
        }


        String[] o = new String[n];
        for(int i = 0 ;i < n;i ++){
            o[i] = "";
            //补位
            int len = s[i].length();
            if( len%3 != 0){
                for(int j = 1 ;j <= 3-len %3 ;j ++){
                    s[i] = "0" + s[i];
                }
            }

            for(int j = 0;j < s[i].length();j += 3){
                String os = s[i].substring(j , j + 3);
                int num = 0;
                switch (os){
                    case "000":
                        num = 0;
                        break;
                    case "001":
                        num = 1;
                        break;
                    case "010":
                        num = 2;
                        break;
                    case "011":
                        num = 3;
                        break;
                    case "100":
                        num = 4;
                        break;
                    case "101":
                        num = 5;
                        break;
                    case "110":
                        num = 6;
                        break;
                    case "111":
                        num = 7;
                        break;
                    default:
                        break;
                }
                
                if(!(j == 0 && num == 0))
                    o[i] += num +"";
            }
        }


        for(int i = 0 ;i < n;i ++){
            System.out.println(s[i]);
        }
        for(int i = 0 ;i < n;i ++){
            System.out.println(o[i]);
        }


    }
}
