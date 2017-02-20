package NoFour;

/**
 * Created by MurphySL on 2017/2/19.
 */
public class Main {

    public static void main(String[] args){
        long num = 0;
        for(long i = 10000 ;i < 100000 ;i ++){
            long g = i %10;
            long s = i%100/10;
            long b = i %1000 / 100;
            long q = i %10000/1000;
            long w = i / 10000;
            if(g!=4&&s!=4&&b!=4&&q!=4&&w!=4){
                num ++;
            }
        }
        System.out.print(num);
    }
}
