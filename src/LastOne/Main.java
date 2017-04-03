package LastOne;

/**
 * 将一个整数的二进制只保留最后一个 1，其余的 1 全部变为 0。
 *
 * Created by MurphySL on 2017/4/3.
 */
public class Main {
    /**
     * 原数 000100 100
     * 减一 000100 011
     *
     * 且算 000100 000
     * 相减 000000 100
     */
    public static void f(int x){
        String s = "";
        int i;
        for (i = 0; i < 32; i++) {
            s += String.valueOf(x>>(31-i)&1);
        }
        s += "   ";
        x = x - (x&(x-1))    ;//补全这句代码
        for (i = 0; i < 32; i++) {
            s += String.valueOf(x>>(31-i)&1);
        }
        System.out.println(s);
    }
    public static void main(String[] args) {
        f(1234);
        f(2332);
    }
}
