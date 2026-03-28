class Solution {
    public int[] rearrangeArray(int[] nums) {
        int ans[] = new int[nums.length];
        int pos=0,negative=1;
        for(int i=0;i<nums.length;i++)
        {
            if(nums[i]>0)
            {
                ans[pos]=nums[i];
                pos += 2;
            }
            else
            {
                ans[negative]=nums[i];
                negative += 2;
            }
        }
        return ans;
    }
}