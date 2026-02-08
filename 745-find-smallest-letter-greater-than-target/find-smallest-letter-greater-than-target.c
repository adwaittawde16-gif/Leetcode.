char nextGreatestLetter(char* letters, int lettersSize, char target) {
    int low = 0, high = lettersSize - 1;

    while (low <= high) {
        int mid = low + (high - low) / 2;

        if (letters[mid] > target)
            high = mid - 1;
        else
            low = mid + 1;
    }

    return (low < lettersSize) ? letters[low] : letters[0];
}
