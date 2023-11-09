package Exercise.Greedy;

public class wiggle_subsequence {
    public int wiggleMaxLength(int[] nums) {
        if (nums.length <= 1){
            return 1;
        }
        int current = 0 ;
        int pre = 0 ;
        int count = 1;
        for(int i = 1 ; i < nums.length ; i++){
            current = nums[i] - nums[i-1];
            if((current > 0 && pre < 0)||(current < 0 && pre >0)){

            }
        }
        return 0;
    }
}
