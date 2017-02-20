package CoalBall;

/**
 * 2016 蓝桥杯省赛 B 组第一题。
 *
 * 有一堆煤球，堆成三角棱锥形。具体：
 *
 * 第一层放 1 个，
 * 第二层 3 个（排列成三角形），
 * 第三层 6 个（排列成三角形），
 * 第四层 10 个（排列成三角形），
 * ……
 * 如果一共有 100 层，共有多少个煤球？
 *
 * 请填表示煤球总数目的数字。
 *
 *
 *  看清题目！！！！
 */
public class Main {

    public static void main(String[] args){
        int sum = 0;
        int all = 0;
        for(int i = 1 ; i <= 100 ;i ++){
            sum += i;
            all += sum;
        }

        System.out.print(all);
    }
}
