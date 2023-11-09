package Exercise.String;

import java.util.HashMap;
import java.util.Stack;

public class valid_parentheses {

    public static void main(String[] args) {
        valid_parentheses parentheses = new valid_parentheses();
        String s = new String("()({)");
        boolean valid = parentheses.isValid(s);
        System.out.println(valid);

    }
    public boolean isValid(String s) {
        //先判断是否是奇数
        int n = s.length();
        if (n % 2 == 1) {
            return false;
        }
        HashMap<Character, Character> map = new HashMap<>();
        map.put(')','(');
        map.put('}','{');
        map.put(']','[');
        Stack<Character> stack = new Stack<>();
        for(int i = 0 ; i<s.length() ;i++){
            char c = s.charAt(i);
            if(map.containsKey(c)){
                if (stack.isEmpty() || !stack.pop().equals(map.get(c))){
                    return false;
                }
            }else {
                stack.push(c);
            }
        }
        if(!stack.isEmpty()){
            return false;
        }
        return true;
    }
}
