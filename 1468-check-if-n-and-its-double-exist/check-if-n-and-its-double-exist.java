class Solution {
    public boolean checkIfExist(int[] arr) {
        Map<Integer,Integer>map = new HashMap<>();
        for(int i=0;i<arr.length;i++)
        {
            int d = 2*arr[i];
            int half = arr[i]/2;
            if(map.containsKey(d) || arr[i]%2==0 && map.containsKey(half))
            {
                return true;
            }
            else
            {
                map.put(arr[i],1);
            }
        }
        return false;
    }
}