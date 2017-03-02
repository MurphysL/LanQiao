package Stack;

import java.util.HashMap;
import java.util.Scanner;
import java.util.Stack;

/**
 * 蒜头君在纸上写了一个串，只包含'('和')'。一个'('能唯一匹配一个')'，
 * 但是一个匹配的'('必须出现在')'之前。请判断蒜头君写的字符串能否括号完全匹配，
 * 如果能，输出配对的括号的位置（匹配的括号不可以交叉，只能嵌套）。
 *
 * peek(偷看) 不会弹出
 *
 * 最后一行空行不会报错
 */
public class Main {

    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        Stack<Integer> stack = new Stack<Integer>();
        HashMap<Integer , Integer> map = new HashMap<>();

        String ops = scanner.nextLine().trim();
        char[] op = ops.toCharArray();
        boolean isMatch = true;

        for(int i = 1 ;i <= op.length ;i ++){
            if(!isMatch)
                break;
            String os = op[i-1]+"";
            if(os.equals("(")){
               stack.add(i);
            }else{
               if(stack.size()>0){
                   int pos = stack.pop();
                   map.put(pos , i);
               }else{
                   isMatch = false;
               }
            }
        }

        if(!isMatch || stack.size() != 0 ){
            System.out.print("No");
        }else{
            System.out.println("Yes");
            for(HashMap.Entry<Integer , Integer> entry : map.entrySet()){
                System.out.println(entry.getKey()+" " + entry.getValue());
            }
        }

    }

}
