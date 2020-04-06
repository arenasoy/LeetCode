package problems;

public class MoveZeroes0283 {
    public void moveZeroes(int[] nums) {
        
        int zeros = 0;
        
        while (zeros < nums.length 
               && nums[zeros] != 0)
            zeros++;
        
        if (zeros == nums.length)
            return;
        
        for (int i = zeros + 1; i < nums.length; i++) {
            if (nums[i] != 0) {
                nums[zeros] = nums[i];
                nums[i] = 0;
                zeros++;
                
                while (zeros < nums.length
                       && nums[zeros] != 0)
                    zeros++;
            }
        }
    }
}