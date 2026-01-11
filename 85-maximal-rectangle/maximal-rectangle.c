int max(int a, int b) {
    return a > b ? a : b;
}

// Largest Rectangle in Histogram
int largestRectangleArea(int* heights, int n) {
    int stack[n + 1];
    int top = -1;
    int maxArea = 0;

    for (int i = 0; i <= n; i++) {
        int currHeight = (i == n) ? 0 : heights[i];

        while (top != -1 && currHeight < heights[stack[top]]) {
            int height = heights[stack[top--]];
            int width = (top == -1) ? i : i - stack[top] - 1;
            maxArea = max(maxArea, height * width);
        }
        stack[++top] = i;
    }
    return maxArea;
}

int maximalRectangle(char** matrix, int matrixSize, int* matrixColSize) {
    if (matrixSize == 0) return 0;

    int cols = matrixColSize[0];
    int heights[cols];
    for (int i = 0; i < cols; i++)
        heights[i] = 0;

    int maxArea = 0;

    for (int i = 0; i < matrixSize; i++) {
        for (int j = 0; j < cols; j++) {
            if (matrix[i][j] == '1')
                heights[j]++;
            else
                heights[j] = 0;
        }
        maxArea = max(maxArea, largestRectangleArea(heights, cols));
    }

    return maxArea;
}

    