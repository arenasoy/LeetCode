package problems;

import java.util.Collections;
import java.util.PriorityQueue;

public class LastStoneWeight1046 {

    public int lastStoneWeight(int[] stones) {
        PriorityQueue<Integer> queue = new PriorityQueue<Integer>(Collections.reverseOrder());
        
        for (int i = 0; i < stones.length; i++)
            queue.add(stones[i]);
        
        while (!queue.isEmpty()) {
            int first = queue.poll();
            if (queue.peek() == null)
                return first;
            
            int second = queue.poll();
            int result = first - second;
            
            if (result > 0)
                queue.add(result);
        }
        
        return 0;
    }

}
