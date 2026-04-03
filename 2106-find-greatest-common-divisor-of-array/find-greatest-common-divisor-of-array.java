import java.util.*;

class Solution {
    public int findGCD(int[] nums) {
        Arrays.sort(nums);
        int s = nums[0];
        int l = nums[nums.length - 1];

        int gcd = s; // start from smaller number

        while (gcd > 0) {
            if (s % gcd == 0 && l % gcd == 0) {
                return gcd;
            }
            gcd--;
        }
        return 1;
    }
}