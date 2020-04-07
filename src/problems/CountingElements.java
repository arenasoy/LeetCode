package problems;

import java.util.HashSet;
import java.util.Set;

public class CountingElements {

    public int countElements(int[] arr) {
        
        Set<Integer> set = new HashSet<Integer>();
        int count = 0;
        
        for (int i = 0; i < arr.length; i++) {
            set.add(arr[i]);
        }
        
        for (int i = 0; i < arr.length; i++) {
            if (set.contains(arr[i] + 1))
                count++;
        }
        
        return count;
    }

}