package problems;

public class MaximumSubarray0053 {

    public int maxSubArray(int[] nums) {
     
        int sum = 0;
        int result = Integer.MIN_VALUE;
        
        for(int i = 0; i < nums.length; i++) {
            sum += nums[i];
            if (nums[i] > sum) {
                sum = nums[i];
            }
            if (sum > result) {
                result = sum;
            }
        }
        
        return result;
        
    }
}