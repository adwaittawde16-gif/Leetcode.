int longestPalindrome(char* s) {
    int freq[128] = {0};
    int length = 0;
    int hasOdd = 0;

    // Count frequencies
    for (int i = 0; s[i] != '\0'; i++) {
        freq[(int)s[i]]++;
    }

    // Build palindrome length
    for (int i = 0; i < 128; i++) {
        length += (freq[i] / 2) * 2;
        if (freq[i] % 2 == 1)
            hasOdd = 1;
    }

    // Add one odd character in the center if possible
    if (hasOdd)
        length += 1;

    return length;
}
