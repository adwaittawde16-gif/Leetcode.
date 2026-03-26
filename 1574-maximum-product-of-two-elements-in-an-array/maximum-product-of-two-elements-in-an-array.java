class Solution {
    public int maxProduct(int[] nums) {
        Arrays.sort(nums);
        int max1=nums[nums.length-1];
        int max2=nums[nums.length-2];
        int sol = (max1-1)*(max2-1);
        return sol;
    }
    
}