package problems;

import java.util.HashMap;

public class SingleNumber0136 {
    public int singleNumber(int[] nums) {
        
        HashMap<Integer, Integer> count = new HashMap<Integer, Integer>();
        
        for (int i = 0; i < nums.length; i++) {
            
            int total = count.getOrDefault(nums[i], 0);
            count.put(nums[i], ++total);
            
        }
        
        for(Integer key : count.keySet()) {
            if (count.get(key) == 1)
                return key;
        }
        
        return -1;
    }
}