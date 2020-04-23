class Solution {
    public int maxProfit(int[] prices) {
        int maxProfit = 0;
        int buyPrice = 0;
        int sellPrice = 0;
        for (int i = 0; i < prices.length; i++) {
            while (i < prices.length - 1 && prices[i] >= prices[i + 1]) 
                i++;
            buyPrice = prices[i];
            while (i < prices.length - 1 && prices[i] <= prices[i + 1]) 
                i++;
            sellPrice = prices[i];
            maxProfit += sellPrice - buyPrice;
        }
        return maxProfit;
    }
}