package Exercise.Number;

import org.w3c.dom.ls.LSException;

import java.util.ArrayList;
import java.util.List;

public class Spiral_matrix {

    public static void main(String[] args) {
        int[][] b = new int[][]{{1,2,3,4},{5,6,7,8},{9,10,11,12}};
        Spiral_matrix spiralMatrix = new Spiral_matrix();
        System.out.println(b.toString());
        List<Integer> list = spiralMatrix.spiralOrder(b);
        System.out.println(list);
    }


    public List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> list = new ArrayList<>();

        int right = matrix[0].length-1;  //列数
        int bottom = matrix.length-1;  //行数
        int left = 0 ;
        int top = 0 ;
        while(right >= left && top <= bottom){
            for (int i = left ; i <= right ; i++){
                list.add(matrix[top][i]);
            }
            for (int i = top + 1 ; i <= bottom ; i++ ){
                list.add(matrix[i][right]);
            }
            if(left < right && top < bottom){
                for(int i = right -1 ; i > left ; i--){
                    list.add(matrix[bottom][i]);
                }
                for(int i = bottom  ; i > top ; i--){
                    list.add(matrix[left][i]);
                }
            }

            left ++ ;
            top ++ ;
            right --;
            bottom --;
        }
        return list;
    }

}
