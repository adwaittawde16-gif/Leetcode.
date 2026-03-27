class Solution {
    public double average(int[] salary) {
        Arrays.sort(salary);
        int sum =0;
        for(int i =0; i<salary.length;i++)
        {
            sum = sum+salary[i];
        }
        int minS = salary[0];
        int maxS = salary[salary.length-1];
        return (double)(sum - maxS-minS)/(salary.length-2);
    }
}