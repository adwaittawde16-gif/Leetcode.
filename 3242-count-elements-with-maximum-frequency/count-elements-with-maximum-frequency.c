#include <stdio.h>

int maxFrequencyElements(int* nums, int numsSize) {
    int freq[101] = {0};   // assuming nums[i] <= 100
    int maxFreq = 0;
    int result = 0;

    // Count frequencies
    for (int i = 0; i < numsSize; i++) {
        freq[nums[i]]++;
        if (freq[nums[i]] > maxFreq) {
            maxFreq = freq[nums[i]];
        }
    }

    // Sum frequencies of elements with max frequency
    for (int i = 0; i < 101; i++) {
        if (freq[i] == maxFreq) {
            result += freq[i];
        }
    }

    return result;
}
