package Exercise.Greedy;

import java.util.Arrays;

public class assign_cookies {
    //小饼干满足小胃口
    public int findContentChildren(int[] g, int[] s) {
        Arrays.sort(g);
        Arrays.sort(s);
        int result = 0 ;
        int start = 0;
        for (int i = 0 ; i < s.length  && start < g.length; i++){
            if(s[i] >= g[start]){
                result ++;
                start ++ ;
            }
        }
        return result;
    }

}
