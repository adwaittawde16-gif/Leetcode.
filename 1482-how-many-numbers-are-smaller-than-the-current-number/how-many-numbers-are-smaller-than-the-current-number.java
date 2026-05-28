class Solution {
    public int[] smallerNumbersThanCurrent(int[] nums) {
        int[] temp = nums.clone();
        Arrays.sort(temp);

        Map<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < temp.length; i++) {
            map.putIfAbsent(temp[i], i);
        }

        int[] ans = new int[nums.length];

        for (int i = 0; i < nums.length; i++) {
            ans[i] = map.get(nums[i]);
        }

        return ans;
    }
}