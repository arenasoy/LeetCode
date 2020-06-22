package problems;

import java.util.Arrays;
import java.util.Comparator;

public class KClosestPointsToOrigin0973 {
    
    class Pair {
        int index;
        double distance;
        
        Pair(int index, double distance) {
            this.index = index;
            this.distance = distance;
        }
    }
    
    public int[][] kClosest(int[][] points, int K) {
        
        Pair sorted[] = new Pair[points.length];
        
        for (int i = 0; i < points.length; i++) {
            double distance = Math.sqrt(Math.pow(points[i][0], 2) + Math.pow(points[i][1], 2));
            Pair p = new Pair(i, distance);
            sorted[i] = p;
        }
        
        Arrays.sort(sorted, new Comparator<Pair>() {
            public int compare(Pair p1, Pair p2) {
                
                if (p1.distance > p2.distance)
                    return 1;
                if (p1.distance < p2.distance)
                    return -1;
                
                return 0;
            }
        });
        
        int result[][] = new int [K][2];
        
        for (int i = 0; i < K; i++) {
            result[i][0] = points[sorted[i].index][0];
            result[i][1] = points[sorted[i].index][1];
        }
        
        return result;
    }

}