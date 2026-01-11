#include <stdlib.h>

int cmp(const void* a, const void* b) {
    return (*(int*)a - *(int*)b);
}

int findContentChildren(int* g, int gSize, int* s, int sSize) {
    // Sort greed and cookie arrays
    qsort(g, gSize, sizeof(int), cmp);
    qsort(s, sSize, sizeof(int), cmp);

    int i = 0; // children
    int j = 0; // cookies

    while (i < gSize && j < sSize) {
        if (s[j] >= g[i]) {
            // Give cookie j to child i
            i++;
        }
        j++; // always move to next cookie
    }

    return i; // number of content children
}

