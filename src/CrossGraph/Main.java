package CrossGraph;

import java.util.Scanner;

/**
 *  ..$$$$$$$$$$$$$..
 *  ..$...........$..
 *  $$$.$$$$$$$$$.$$$
 *  $...$.......$...$
 *  $.$$$.$$$$$.$$$.$
 *  $.$...$...$...$.$
 *  $.$.$$$.$.$$$.$.$
 *  $.$.$...$...$.$.$
 *  $.$.$.$$$$$.$.$.$
 *  $.$.$...$...$.$.$
 *  $.$.$$$.$.$$$.$.$
 *  $.$...$...$...$.$
 *  $.$$$.$$$$$.$$$.$
 *  $...$.......$...$
 *  $$$.$$$$$$$$$.$$$
 *  ..$...........$..
 *  ..$$$$$$$$$$$$$..
 */
public class Main {

    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        int col = 5+4*num;

        char[][] c = new char[col][col];

        //初始化矩阵
        for(int i = 0 ;i <= col/2;i ++){
            for(int j = 0 ;j <= col/2 ;j ++){
                c[i][j] = '.';
            }
        }

        //生成1/4图形
        for(int i = 0 ; i <= col/2 ; i += 2){
            for(int j = 2+i ; j <= col/2 ;j ++){
                c[i][j] = '$';
                c[j][i] = '$';
            }
        }

        //凹形
        for(int i = 2 ;i <= col/2 + 1 ;i += 2){
            c[i][i] = c[i-1][i] = c[i][i-1] = '$';
        }

        //生成完整图形
        for(int i = 0 ;i <= col/2 ;i ++){
            for(int j = 0 ;j <= col/2;j ++){
                c[i][col - j - 1] = c[col - i - 1][j] = c[col - i - 1][col - j - 1] = c[i][j];
            }
        }



        for(int i = 0 ;i < col;i ++){
            for(int j = 0 ;j < col ;j ++){
                System.out.print(c[i][j]);
            }
            System.out.println("");
        }
    }
}
