int dayOfYear(char * date){
    int year, month, day;
    sscanf(date, "%d-%d-%d", &year, &month, &day);
    
    int days_in_month[12] = {31,28,31,30,31,30,31,31,30,31,30,31};
    
    int isLeap = (year % 400 == 0) || (year % 4 == 0 && year % 100 != 0);
    if (isLeap) days_in_month[1] = 29;
    
    int total = 0;
    for(int i = 0; i < month-1; i++){
        total += days_in_month[i];
    }
    
    return total + day;
}
