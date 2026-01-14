int maximumProduct(int* nums, int numsSize) {
    int max1 = -1000, max2 = -1000, max3 = -1000;
    int min1 = 1000, min2 = 1000;

    for (int i = 0; i < numsSize; i++) {
        int n = nums[i];

        if (n > max1) {
            max3 = max2;
            max2 = max1;
            max1 = n;
        } else if (n > max2) {
            max3 = max2;
            max2 = n;
        } else if (n > max3) {
            max3 = n;
        }

        if (n < min1) {
            min2 = min1;
            min1 = n;
        } else if (n < min2) {
            min2 = n;
        }
    }

    int prod1 = max1 * max2 * max3;
    int prod2 = min1 * min2 * max1;

    return prod1 > prod2 ? prod1 : prod2;
}
