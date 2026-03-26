class Solution {
    public int accountBalanceAfterPurchase(int purchaseAmount) {
        int rem = purchaseAmount%10;
        int bal = 10-rem;
        if(rem<5)
        {
            purchaseAmount = purchaseAmount-rem;
        }
        else
        {
            purchaseAmount=purchaseAmount+bal;
        }
        return 100 - purchaseAmount;
    }
}