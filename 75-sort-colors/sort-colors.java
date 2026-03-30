class Solution {
    public void sortColors(int[] nums) {
        int zp = 0;
        int tp = nums.length-1;
        int i = 0;
        while(i<=tp)
        {
            if(nums[i]==0)
            {
                swap(nums,i,zp);
                i++;
                zp++;
            }
            else if(nums[i]==2)
            {
                swap(nums,i,tp);
                tp--;
            }
            else
            {
                i++;
            }
        }
    }
    public static void swap(int nums[],int num1,int num2)
    {
        int temp = nums[num1];
        nums[num1]=nums[num2];
        nums[num2]=temp;

    }
}