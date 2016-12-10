package String01;

/**
 * 对于长度为5位的一个01串，每一位都可能是0或1，一共有32种可能。它们的前几个是：
 *
 * 00000
 *
 * 00001
 *
 * 00010
 *
 * 00011
 *
 * 00100
 *
 *请按从小到大的顺序输出这32种01串。
 */
public class Main {
    public static void main(String[] args){

        for(int i = 0 ; i< 2 ; i++){
            for(int j = 0 ; j< 2 ; j++){
                for(int m = 0 ; m< 2 ; m++){
                    for(int n = 0 ; n< 2 ; n++){
                        for(int t = 0 ; t< 2 ; t++){
                            System.out.println(i + "" + j + "" + m + "" + n + "" + t);
                        }
                    }
                }
            }
        }
    }
}
