package problems;

import java.util.HashMap;

public class MajorityElement0169 {
    public int majorityElement(int[] nums) {
        
        HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
        
        for (int i = 0; i < nums.length; i++) {
            int count = map.getOrDefault(nums[i], 0);
            count += 1;
            
            if (count > nums.length/2) {
                return nums[i];
            }
            
            map.put(nums[i], count);
        }
        
        return -1;
    }
}