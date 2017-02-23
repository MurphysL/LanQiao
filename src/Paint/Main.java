package Paint;

import java.util.Scanner;

/**
 * 蒜头君觉得白色的墙面好单调，他决定给房间的墙面涂上颜色。他买了 3 种颜料分别是红、黄、蓝，然后把房间的墙壁竖直地划分成 n 个部分，
 * 蒜头希望每个相邻的部分颜色不能相同。他想知道一共有多少种给房间上色的方案。
 *
 *     ****
 *
 * Long
 * 少用递归
 */
public class Main {

    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();//墙数 1-15

        //涂第一面墙 3
        //涂第二面墙 2*2*paint(num - 2);
        //1.相邻颜色不同 paint(num -1)
        //2.相邻颜色相同 2*paint(num - 2)
        long[] value = new long[num];
        value[0] = 3;
        value[1] = 6;
        value[2] = 6;
        for(int i = 3 ; i < num ;i ++){
            value[i] = value[i -1] + 2*value[i -2];
        }

        System.out.print(value[num - 1]);
    }

}
