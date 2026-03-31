class Solution {
    public int longestMonotonicSubarray(int[] nums) {
        int inc = 1;
        int dec = 1;
        int l =1;
        for(int i=1;i<nums.length;i++)
        {
            if(nums[i-1]<nums[i])
            {
                inc++;
                dec=1;
            }
            else if(nums[i]<nums[i-1])
            {
                dec++;
                inc=1;
            }
            else
            {
                inc=1;
                dec=1;
            }
            l = Math.max(l,Math.max(inc,dec));
        }
        return l;
    }
}