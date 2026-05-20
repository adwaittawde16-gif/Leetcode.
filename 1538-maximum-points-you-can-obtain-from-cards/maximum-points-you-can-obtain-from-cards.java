class Solution {
    
    public int maxScore(int[] cardPoints, int k) {
        
        int n = cardPoints.length;
        
        int total = 0;
        
        // Take first k cards initially
        for (int i = 0; i < k; i++) {
            total += cardPoints[i];
        }
        
        int maxScore = total;
        
        int right = n - 1;
        
        
        for (int i = k - 1; i >= 0; i--) {
            
            total -= cardPoints[i];
            total += cardPoints[right];
            
            right--;
            
            maxScore = Math.max(maxScore, total);
        }
        
        return maxScore;
    }
}