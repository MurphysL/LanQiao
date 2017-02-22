package Libai;

/**
 * 话说大诗人李白，一生好饮。幸好他从不开车。
 * 一天，他提着酒壶，从家里出来，酒壶中有酒两斗。他边走边唱：
 * 无事街上走，提壶去打酒。
 * 逢店加一倍，遇花喝一斗。
 * 这一路上，他一共遇到店 5 次，遇到花 10 次，已知最后一次遇到的是花，他正好把酒喝光了。请你计算李白遇到店和花的次序，有多少种可能的方案。
 */
public class Main {

    public static void main(String[] args){
        int ans = 0;
        for(int i = 0 ;i < (1<<14) ; i ++){
            int num_1 = 0;
            int num_0 = 0;
            int total = 2;
            for(int j = 0 ; j < 14; j ++){
                if((i&(1<<j)) == 1<<j){
                    num_1++;
                    total *= 2;
                }else {
                    num_0++;
                    total -= 1;
                }
            }
            if(num_0 == 9 && num_1 == 5 && total ==1)
                ans ++;
        }

        System.out.print(ans);
    }
}
