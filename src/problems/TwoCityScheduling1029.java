package problems;

import java.util.Arrays;
import java.util.Comparator;

public class TwoCityScheduling1029 {
    public int twoCitySchedCost(int[][] costs) {
        
        int result = 0;
        
        Arrays.sort(costs, new Comparator<int[]>() {
            @Override
            public int compare(int f[], int s[]) {
                int diff1 = f[0] - f[1];
                int diff2 = s[0] - s[1];
                return diff1 - diff2;
            }
        });
        
        
        for (int i = 0; i < costs.length / 2; i++) {
            result += costs[i][0];
        }
        
        
        for (int i = costs.length/2; i < costs.length; i++) {
            result += costs[i][1];
        }
        
        return result;
    }
}