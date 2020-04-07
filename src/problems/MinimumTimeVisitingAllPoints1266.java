package problems;

public class MinimumTimeVisitingAllPoints1266 {
    public int minTimeToVisitAllPoints(int[][] points) {
        
        int result = 0;
        for (int i = 0; i < points.length - 1; i++) {
            result += min(points[i][0], points[i][1], points[i + 1][0], points[i + 1][1]);
        }
        
        return result;
    }
    
    public int min(int x1, int y1, int x2, int y2) {
        
        int x = Math.abs(x1 - x2);
        int y = Math.abs(y1 - y2);
        
        int max = Math.max(x, y);
        
        return max;
    }
}