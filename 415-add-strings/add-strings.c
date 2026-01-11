#include <stdlib.h>
#include <string.h>

char* addStrings(char* num1, char* num2) {
    int i = strlen(num1) - 1;
    int j = strlen(num2) - 1;
    int carry = 0;

    int maxLen = (i > j ? i : j) + 3;
    char* result = (char*)malloc(maxLen);
    int idx = 0;

    while (i >= 0 || j >= 0 || carry) {
        int x = (i >= 0) ? num1[i--] - '0' : 0;
        int y = (j >= 0) ? num2[j--] - '0' : 0;

        int sum = x + y + carry;
        result[idx++] = (sum % 10) + '0';
        carry = sum / 10;
    }

    result[idx] = '\0';

    // Reverse the result
    for (int l = 0, r = idx - 1; l < r; l++, r--) {
        char tmp = result[l];
        result[l] = result[r];
        result[r] = tmp;
    }

    return result;
}
