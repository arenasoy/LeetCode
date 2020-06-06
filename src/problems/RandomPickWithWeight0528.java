package problems;

public class RandomPickWithWeight0528 {
    
    private int sum[];
    
    public RandomPickWithWeight0528(int[] w) {
        sum = new int [w.length];
        
        sum[0] = w[0];
        for (int i = 1; i < w.length; i++) {
            sum[i] = sum[i - 1] + w[i];
        }
    }
    
    public int pickIndex() {
        int index = (int) (Math.random() * (sum[sum.length - 1]));
        
        for (int i = 0; i < sum.length; i++) {
            if (index < sum[i])
                return i;
        }
        
        return sum.length - 1;
    }
}