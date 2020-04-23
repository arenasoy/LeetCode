package problems;

import java.util.HashMap;

public class SubarraySumEqualsK0560 {

    public int subarraySum(int[] nums, int k) {
        
        int result = 0;
        
        int sum[] = new int [nums.length + 1];
        HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
        
        sum[0] = 0;
        map.put(sum[0], 1);
        
        for (int i = 0; i < nums.length; i++) {
            sum[i+1] = sum[i] + nums[i];
            
            int cur = map.getOrDefault(sum[i+1], 0);
            map.put(sum[i+1], ++cur);
        }
        
        for (int i = 0; i < sum.length; i++) {
            
            int search = k + sum[i];
            
            int cur = map.get(sum[i]);
            
            if (cur > 0)
                map.put(sum[i], --cur);
            
            result += map.getOrDefault(search, 0);
            
        }
        
        return result;
        
    }

}
