class Solution {
    public int dayOfYear(String date) {
        String[] parts = date.split("-");
        int year = Integer.parseInt(parts[0]);
        int month = Integer.parseInt(parts[1]);
        int day = Integer.parseInt(parts[2]);

        int[] daysInMonth = {31,28,31,30,31,30,31,31,30,31,30,31};

        // Leap year check
        if ((year % 400 == 0) || (year % 4 == 0 && year % 100 != 0)) {
            daysInMonth[1] = 29;
        }

        int total = 0;
        for (int i = 0; i < month-1; i++) {
            total += daysInMonth[i];
        }

        return total + day;
    }
}
