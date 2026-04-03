class Solution {
    public int countEven(int num) {
        int count=0;
        
        int d;
        for(int i=1;i<=num;i++)
        {
            int sum = 0;
            int x = i;
            while(x>0)
            {
                d = x%10;
                sum += d;
                x /= 10;
            }
            if(sum%2==0)
            {
                count++;
            }
        }
        return count;
    }
}