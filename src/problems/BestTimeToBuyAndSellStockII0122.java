package problems;

public class BestTimeToBuyAndSellStockII0122 {
    public int maxProfit(int[] prices) {
        
        boolean bought = false;
        int profit = 0;
        int start = -1;
        
        for (int i = 0; i < prices.length; i++) {
            
            if (bought 
                && (i + 1) < prices.length
                && prices[i + 1] < prices[i]) {
                profit += prices[i] - prices[start];
                bought = false;
            }
            
            if (!bought
                && (i + 1) < prices.length
                && prices[i + 1] > prices[i]) {
                start = i;
                bought = true;
            }
            
        }
        
        if (bought) {
            profit += prices[prices.length - 1] - prices[start];
        }
        
        return profit;
        
    }
}