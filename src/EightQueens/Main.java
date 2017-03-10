package EightQueens;


/**
 * Created by MurphySL on 2017/3/8.
 */
public class Main {

    private static boolean[] cols = new boolean[8];//列是否有棋子
    private static int[] rows = new int[8];//棋子所在列
    private static int num = 0;

    public static void main(String[] args){

        for(int i = 0;i < 8;i ++){
            rows[i] = Integer.MIN_VALUE;
        }

        eightQueen(0);

        System.out.println("==================");
        System.out.print(num);
    }

    //能否放置
    private static boolean isRight(int i ,int j){
        if(!cols[j]){
            for(int n = 0 ;n < 8 ;n ++){
                if(i+j == n+ rows[n] || i - j == n - rows[n]|| j - i == rows[n] - n){
                    return false;
                }
            }
            cols[j] = true;
            rows[i] = j;
            return true;
        }else{
            return false;
        }

    }

    private static void eightQueen(int row){
        for(int col = 0 ;col < 8 ;col ++){
            if (isRight(row , col)){
                if(row == 7){
                    num ++;
                    print();
                } else {
                    eightQueen(row + 1);
                }
            }
            if(rows[row]!= Integer.MIN_VALUE){
                cols[rows[row]] = false;
            }
            rows[row] = Integer.MIN_VALUE;

        }
    }

    private static void print(){
        System.out.println("==================");
        for(int i = 0 ;i < 8 ;i ++){
            for(int j = 0 ;j < 8 ;j ++){
                if(rows[i] == j){
                    System.out.print("* ");
                }else{
                    System.out.print(". ");
                }
            }
            System.out.println();
        }
        System.out.println("==================");
    }
}
