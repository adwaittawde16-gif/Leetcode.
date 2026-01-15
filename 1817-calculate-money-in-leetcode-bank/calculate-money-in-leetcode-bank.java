class Solution {
    public int totalMoney(int n) {
        int fullWeeks = n / 7;
        int extraDays = n % 7;

        int total = 0;

        // Sum of full weeks
        for (int i = 0; i < fullWeeks; i++) {
            total += 7 * (1 + i) + 21;
        }

        // Sum of remaining days
        int start = 1 + fullWeeks;
        for (int d = 0; d < extraDays; d++) {
            total += start + d;
        }

        return total;
    }
}
