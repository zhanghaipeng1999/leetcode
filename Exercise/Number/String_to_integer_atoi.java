package Exercise.Number;

import javax.xml.transform.Source;

public class String_to_integer_atoi {

    public static void main(String[] args) {

        String s = "  -2121jjj";
        int i = myAtoi(s);
        System.out.println(i);
    }

    public static int myAtoi(String s) {
        int i = 0 ;
        int j = 1;
        while (s.charAt(i) == ' '){
            i ++ ;
        }
        if (s.charAt(i) == '-'){
            j = -1;
            i++;
        }
        int result = 0;
        while (s.charAt(i) >= 48 && s.charAt(i) <= 59){
            String value = String.valueOf(s.charAt(i++));
            int k = Integer.parseInt(value);
            if(result > Integer.MAX_VALUE /10 ||(result == Integer.MAX_VALUE /10 && k > 7)){
                return result;
            }
            result = result * 10 + k ;

        }
        return result = j == 1  ? result : result * -1 ;
    }


}
