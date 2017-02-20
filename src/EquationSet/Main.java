package EquationSet;

/**
 * Created by MurphySL on 2017/2/19.
 */
public class Main {

    public static void main(String[] args){
        for(int i = 1 ; i < 40 ;i ++){
            for(int j = i+1 ; j < 40 ;j ++){
                for(int n = j + 1 ; n < 40 ;n ++){
                    if(i*i + j*j + n * n == 1000)
                        if(i != 6 && j != 8 && n != 30)
                            System.out.print(i + " " + j + " " + n);
                }
            }
        }
    }
}
