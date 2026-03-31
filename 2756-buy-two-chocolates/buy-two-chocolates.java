class Solution {
    public int buyChoco(int[] prices, int money) {
        Arrays.sort(prices);
        int amt = prices[0]+prices[1];
        if(amt<=money)
        {
            return money-amt;
        }
        return money;
    }
}