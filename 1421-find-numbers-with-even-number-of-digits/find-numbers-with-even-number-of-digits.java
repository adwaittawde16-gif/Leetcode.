class Solution {
    public int findNumbers(int[] nums) {
        int count = 0;
        int d;
        for(int i =0;i<nums.length;i++)
        {
            int d_count=0;
            int num=nums[i];
            while(num!=0)
            {
               d = num%10;
               num/=10;
               d_count++;
            }
            if(d_count%2==0)
            {
                count++;
            }
        }
        return count;
    }
}