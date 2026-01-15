int areaOfMaxDiagonal(int** dimensions, int dimensionsSize, int* dimensionsColSize) {
    int maxDiagonal = 0;
    int maxArea = 0;

    for (int i = 0; i < dimensionsSize; i++) {
        int length = dimensions[i][0];
        int width = dimensions[i][1];

        int diagonal = length * length + width * width;
        int area = length * width;

        if (diagonal > maxDiagonal ||
           (diagonal == maxDiagonal && area > maxArea)) {
            maxDiagonal = diagonal;
            maxArea = area;
        }
    }

    return maxArea;
}
