class Solution {
    public boolean canJump(int[] nums) {
        if(nums.length==1)
        {
            return true;
        }
        int last = nums.length-1;
        int full = nums[0];
        for(int i =1; full>=i;i++)
        {
            if(full>=last)
            {
                return true;
            }
            else
            {
                full = Math.max (full,nums[i]+i);
            }
        }
        return false;

    }
}