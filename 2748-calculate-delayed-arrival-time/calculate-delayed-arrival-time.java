class Solution {
    public int findDelayedArrivalTime(int arrivalTime, int delayedTime) {
        int arrive = arrivalTime + delayedTime;
        if(arrive >= 24)
        {
            return arrive %24;
        }
        return arrive;
    }
}