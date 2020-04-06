package problems;

import java.util.HashMap;

public class TwoSum0001 {

    public int[] twoSum(int[] nums, int target) {
        
        int result[] = new int [2];
        HashMap<Integer, Integer> hash = new HashMap<Integer, Integer>();
        
        for (int i = 0; i < nums.length; i++) {
            hash.put(nums[i], i);
            if (hash.containsKey(target - nums[i]) && i != hash.get(target - nums[i])) {
                result[0] = hash.get(target - nums[i]);
                result[1] = i;
                return result;
            }
        }
        
        return result;
        
    }

}