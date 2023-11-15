package Exercise.Number;

import java.util.concurrent.locks.ReentrantLock;

public class Reverse_integer {

    public static void main(String[] args) {
       int x = 1010;
       int y = -101;
        Reverse_integer reverseInteger = new Reverse_integer();
//        System.out.println(reverseInteger.reverse(x));
        System.out.println(reverseInteger.reverse(y));
    }
    public int reverse(int x) {
        int rev = 0;
        while ( x != 0 ){
            int pop = x % 10;
            x = x / 10 ;
            if(rev > Integer.MAX_VALUE / 10 || (rev == Integer.MAX_VALUE && x > 7)){
                return 0;
            }
            if(rev < Integer.MIN_VALUE / 10 || (rev == Integer.MIN_VALUE && x < -8)){
                return 0;
            }
            rev = rev *10 + pop ;
        }
        return rev;
    }

}
