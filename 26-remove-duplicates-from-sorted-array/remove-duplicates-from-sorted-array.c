int removeDuplicates(int* nums, int numsSize) {
    int rd = 0;
    nums[rd]=nums[0];
    for(int i=1;i<numsSize;i++)
    {
        if(nums[rd]!=nums[i])
        {
            rd++;
            nums[rd]=nums[i];
        }
    }
    return rd+1;
}