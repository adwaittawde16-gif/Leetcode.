class Solution {
    public int countServers(int[][] grid) {
        if(grid==null || grid.length==0)
        {
            return 0;
        }
        int rows =grid.length;
        int cols =grid[0].length;
        int[] rc = new int[rows];
        int[] cc = new int[cols];
        for(int row = 0;row<rows;row++)
        {
            for(int col=0;col<cols;col++)
            {
                if(grid[row][col]==1)
                {
                    rc[row]++;
                    cc[col]++;
                }
            }
        }
        int count = 0;
        for(int row = 0;row<rows;row++)
        {
            for(int col=0;col<cols;col++)
            {
                if(grid[row][col]==1)
                {
                    if(rc[row]>1 || cc[col]>1)
                    {
                        count++;
                    }
                }
            }
        }
        return count;
    }
}