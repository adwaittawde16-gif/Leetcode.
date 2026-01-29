int isLeap(int year) {
    return (year % 400 == 0) || (year % 4 == 0 && year % 100 != 0);
}

int daysInMonth(int month, int year) {
    int days[] = {31,28,31,30,31,30,31,31,30,31,30,31};
    if (month == 2 && isLeap(year))
        return 29;
    return days[month - 1];
}

int totalDays(char *date) {
    int y, m, d;
    sscanf(date, "%d-%d-%d", &y, &m, &d);

    int days = 0;

    // count days from years
    for (int i = 1; i < y; i++)
        days += isLeap(i) ? 366 : 365;

    // count days from months
    for (int i = 1; i < m; i++)
        days += daysInMonth(i, y);

    // current month days
    days += d;

    return days;
}

int daysBetweenDates(char *date1, char *date2) {
    int d1 = totalDays(date1);
    int d2 = totalDays(date2);
    return abs(d1 - d2);
}
