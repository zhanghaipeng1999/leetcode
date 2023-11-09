package Exercise.String;

import java.util.jar.JarEntry;
import java.util.logging.Level;

//最长公共前缀
public class Longest_common_prefix {
    public static void main(String[] args) {
        String s1 = new String("ab");
        String s2 = new String("a");
        String[] strs = new String[]{s1,s2};
        Longest_common_prefix main = new Longest_common_prefix();
        System.out.println(strs);
        String s = main.longestCommonPrefix(strs);
        System.out.println(s);
    }

    // 纵向扫描时，从前往后遍历所有字符串的每一列，比较相同列上的字符是否相同，如果相同则继续对下一列进行比较，如果不相同则当前列不再属于公共前缀，当前列之前的部分为最长公共前缀
    public String longestCommonPrefix(String[] strs) {
        if (strs == null || strs.length == 0) {
            return "";
        }
        int length = strs[0].length();
        for(int j =0; j < length ; j++){
            //先取出每轮循环的第一个strs[0]的字符作为标准
            char c = strs[0].charAt(j);
            for (int i = 1 ; i < strs.length ;i++){
                //  达到 j == strs[i].length() 这个条件说明出现了最短的字符串
                if(j == strs[i].length() || strs[i].charAt(j) != c ){
                   return strs[0].substring(0,j);
                }
            }
        }
        return strs[0];
    }
}



