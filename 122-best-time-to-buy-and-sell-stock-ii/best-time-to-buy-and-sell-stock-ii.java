class Solution {
    public int maxProfit(int[] prices) {
        int prof = 0;
        for(int i=1;i<prices.length;i++)
        {
            if(prices[i]>prices[i-1])
            {
                int curr = prices[i]-prices[i-1];
                prof+=curr;
            }
        }
        return prof;
    }
}