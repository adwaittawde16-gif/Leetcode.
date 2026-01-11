#include <limits.h>

int thirdMax(int* nums, int numsSize) {
    long long first = LLONG_MIN;
    long long second = LLONG_MIN;
    long long third = LLONG_MIN;

    for (int i = 0; i < numsSize; i++) {
        long long num = nums[i];

        // Skip duplicates
        if (num == first || num == second || num == third)
            continue;

        if (num > first) {
            third = second;
            second = first;
            first = num;
        } else if (num > second) {
            third = second;
            second = num;
        } else if (num > third) {
            third = num;
        }
    }

    // If third maximum does not exist, return first (max)
    return (third == LLONG_MIN) ? (int)first : (int)third;
}
