int sumFourDivisors(int* nums, int numsSize) {
    int total = 0;
    for (int i = 0; i < numsSize; i++) {
        int n = nums[i];
        if (n <= 4) continue;  // Fewer than 4 divisors
        
        int sqrt_n = (int)sqrt(n);
        if (sqrt_n * sqrt_n == n) continue;  // Perfect square: odd divisors
        
        int count = 2;  // 1 and n
        int div_sum = 1 + n;
        for (int d = 2; d <= sqrt_n; d++) {
            if (n % d == 0) {
                count += 2;
                div_sum += d + (n / d);
                if (count > 4) break;
            }
        }
        if (count == 4) {
            total += div_sum;
        }
    }
    return total;
}
