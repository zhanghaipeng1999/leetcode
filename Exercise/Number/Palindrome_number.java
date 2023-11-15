package Exercise.Number;

public class Palindrome_number {
    public static void main(String[] args) {
        int x =123321;
        int y = 12321;
        int t = 12345;
        Palindrome_number number = new Palindrome_number();
        System.out.println(number.isPalindrome(x));
        System.out.println(number.isPalindrome(y));
        System.out.println(number.isPalindrome(t));
    }

    public boolean isPalindrome(int x) {
        //负数一定不是回文数
        if ( x < 0 || (x!=0 && x%10==0)){
            return false;
        }
        int revertNumber = 0;
        while (x > revertNumber){
            revertNumber = revertNumber * 10 +  x % 10 ;
            x = x / 10;
        }
        if(revertNumber == x || revertNumber /10 == x ){
            return true;
        }
        return false;
    }
}
