class Solution {
    public int distanceTraveled(int mainTank, int additionalTank) {
        int maxd = 0;
        while(mainTank>=5 && additionalTank>0)
        {
            maxd+=50;
            mainTank = (mainTank-5)+1;
            additionalTank--;

        }
        maxd += mainTank * 10;
        return maxd;
    }
}