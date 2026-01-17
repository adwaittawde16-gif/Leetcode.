int findPoisonedDuration(int* timeSeries, int timeSeriesSize, int duration) {
    if (timeSeriesSize == 0) {
        return 0;
    }

    int total = 0;

    for (int i = 0; i < timeSeriesSize; i++) {
        if (i == 0) {
            total += duration;
        } else {
            int gap = timeSeries[i] - timeSeries[i - 1];
            total += (gap < duration) ? gap : duration;
        }
    }

    return total;
}
