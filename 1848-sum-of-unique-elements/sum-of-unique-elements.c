int sumOfUnique(int* nums, int numsSize) {
    int freq[101] = {0};
    int sum = 0;

    // Count frequency
    for (int i = 0; i < numsSize; i++) {
        freq[nums[i]]++;
    }

    // Sum unique elements
    for (int i = 0; i < numsSize; i++) {
        if (freq[nums[i]] == 1) {
            sum += nums[i];
        }
    }

    return sum;
}
