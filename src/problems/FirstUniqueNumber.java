package problems;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class FirstUniqueNumber {

    private LinkedHashSet<Integer> uniques;
    private Set<Integer> set;
    
    public FirstUniqueNumber(int[] nums) {
        uniques = new LinkedHashSet<Integer>();
        set = new HashSet<Integer>();
        
        for (int i = 0; i < nums.length; i++) {
            add(nums[i]);
        }
    }
    
    public int showFirstUnique() {
        if (uniques.isEmpty())
            return -1;
        return uniques.iterator().next();
    }
    
    public void add(int value) {
        if (set.contains(value) && uniques.contains(value)) {
            uniques.remove(value);
        } else if (!set.contains(value)) {
            uniques.add(value);
            set.add(value);
        }
    }

}