package problems;

import java.util.HashMap;

public class CountiguosArray0525 {

    class Pair {
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
    }
    
    public int findMaxLength(int[] nums) {
        
        if (nums.length == 0)
            return 0;
        
        int sum[] = new int [nums.length];
        
        sum[0] = nums[0];
        if (sum[0] == 0)
            sum[0] = -1;
        
        for (int i = 1; i < nums.length; i++) {
            if (nums[i]  == 0) {
                sum[i] = sum[i - 1] - 1;
            } else {
                sum[i] = sum[i - 1] + 1;
            }
        }
        
        if (sum[sum.length - 1] == 0)
            return nums.length;
        
        HashMap<Integer, Pair> map = new HashMap<Integer, Pair>();
        
        for (int i = 0; i < sum.length; i++) {
            Pair p = map.getOrDefault(sum[i], new Pair());
            
            if (sum[i] == 0) {
                p.min = -1;
            } 
            
            if (p.min == Integer.MAX_VALUE) {
                p.min = i;
            } else {
                p.max = i;
            }
            
            map.put(sum[i], p);
        }
        
        int result = 0;
        for (Integer key : map.keySet()) {
            Pair p = map.get(key);
            if (p.max != Integer.MIN_VALUE) {
                int diff = p.max - p.min;
                if (diff > result)
                    result = diff;
            }
        }
        
        return result;
    }

}