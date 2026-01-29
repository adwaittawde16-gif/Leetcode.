int digitSum(int x) {
    int sum = 0;
    while (x > 0) {
        sum += x % 10;
        x /= 10;
    }
    return sum;
}

int countLargestGroup(int n) {
    int count[37] = {0};

    // Count numbers in each digit-sum group
    for (int i = 1; i <= n; i++) {
        int s = digitSum(i);
        count[s]++;
    }

    // Find maximum group size
    int maxSize = 0;
    for (int i = 0; i < 37; i++) {
        if (count[i] > maxSize)
            maxSize = count[i];
    }

    // Count how many groups have max size
    int result = 0;
    for (int i = 0; i < 37; i++) {
        if (count[i] == maxSize)
            result++;
    }

    return result;
}
