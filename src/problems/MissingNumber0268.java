package problems;

public class MissingNumber0268 {
    public int missingNumber(int[] nums) {
        
        int expectedSum = 0;
        for (int i = 0; i <= nums.length; i++) {
            expectedSum += i;
        }
        
        int curSum = 0;
        for (int i = 0; i < nums.length; i++) {
            curSum += nums[i];
        }
        
        return (expectedSum - curSum);
    }
}