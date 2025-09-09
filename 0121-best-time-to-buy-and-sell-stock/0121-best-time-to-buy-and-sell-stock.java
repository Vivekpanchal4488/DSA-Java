class Solution {
    public int maxProfit(int[] prices) {
        int buy = prices[0];
        int profit = 0;
        for(int i=0; i<prices.length; i++){
            int currprofit = prices[i] - buy;
            if( currprofit > profit){
                profit = currprofit;
            }
            if( prices[i] < buy){
                buy = prices[i];
            }
        }
        return profit;
    }
}