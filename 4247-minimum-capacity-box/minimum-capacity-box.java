class Solution {
    public int minimumIndex(int[] capacity, int itemSize) {
        int minIndex = -1;
        int minCapacity = Integer.MAX_VALUE;

        for (int i = 0; i < capacity.length; i++) {
            if (capacity[i] >= itemSize && capacity[i] < minCapacity) {
                minCapacity = capacity[i];
                minIndex = i;
            }
        }

        return minIndex;
    }
}