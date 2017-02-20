package Birthday;

/**
 * 某君从某年开始每年都举办一次生日 party，并且每次都要吹熄与年龄相同根数的蜡烛。
 * 现在算起来，他一共吹熄了 236 根蜡烛。那么，他从几岁开始过生日 party 的。
 * 从常识来讲一个人的年龄不可能超过 200 岁。
 */
public class Main {

    public static void main(String[] args){

        System.out.print(getAge());

    }

    public static int getAge(){
        int sum = 0;
        for(int i = 0 ; i < 200 ;i ++){
            for(int j = i ;j < 200 ; j ++){
                sum +=j;
                if(sum > 236)
                    break;

                if(sum == 236){
                    return i;
                }
            }
            sum = 0;
        }
        return 0;
    }
}
