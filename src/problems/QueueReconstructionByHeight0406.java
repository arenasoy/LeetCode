package problems;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.ArrayList;

public class QueueReconstructionByHeight0406 {
    public int[][] reconstructQueue(int[][] people) {
        
        Arrays.sort(people, new Comparator<int[]>() {
            @Override
            public int compare(int f[], int s[]) {
                int diff = s[0] - f[0];
                if (diff == 0) {
                    diff = f[1] - s[1];
                }
                
                return diff;
            }
        });
        
        List<int[]> list = new ArrayList<int[]>();
        for (int i = 0; i < people.length; i++) {
            list.add(people[i][1], people[i]);
        }
        
        return list.toArray(new int[people.length][2]);
    }
}