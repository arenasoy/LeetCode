package problems;

public class MaximalSquare0221 {
    
    public int maximalSquare(char[][] matrix) {
    
        if (matrix.length == 0 || matrix[0].length == 0)
            return 0;
        
        int dp[][] = new int [matrix.length + 1][matrix[0].length + 1];
        int max = 0;
        
        for (int i = 1; i < dp.length; i++) {
            for (int j = 1; j < dp[0].length; j++) {
                
                if (matrix[i-1][j-1] == '1') {
                    int min = dp[i - 1][j - 1];
                    
                    if (dp[i-1][j] < min)
                        min = dp[i-1][j];

                    if (dp[i][j-1] < min)
                        min = dp[i][j-1];

                    dp[i][j] = min + 1;
                    
                    if (dp[i][j] > max)
                        max = dp[i][j];
                
                }
                
            }
        }
        
        return max * max;
        
    }
}