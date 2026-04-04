class Solution {
    public int countCommas(int n) {
        long commas = 0;
        long start = 1000;
        int commaCount = 1;

        while (start <= n) {
            long end = Math.min(n, start * 1000 - 1);
            commas += (end - start + 1) * commaCount;

            start *= 1000;
            commaCount++;
        }

        return (int) commas;
    }
}