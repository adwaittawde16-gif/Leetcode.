class Solution {
    public int countSymmetricIntegers(int low, int high) {
        int count=0;
        for(int i=low;i<=high;i++)
        {
            String s = Integer.toString(i);
            if(s.length()%2!=0) continue;
            int n = s.length()/2;
            int sum1 =0,sum2=0;
            for(int j =0;j<n;j++)
            {
                sum1+=s.charAt(j)-'0';
            }
            for(int k=n;k<s.length();k++)
            {
                sum2+=s.charAt(k)-'0';
            }
            if(sum1==sum2)
            {
                count++;
            }
        }
        return count;
    }
}