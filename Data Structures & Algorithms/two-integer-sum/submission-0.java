class Solution {
    public int[] twoSum(int[] nums, int target) 
    {
        HashMap<Integer,Integer> s1=new HashMap();
        for(int i=0;i<nums.length;i++)
        {
            int t=target-nums[i];
            if(s1.containsKey(t))
            {
                return new int[] {s1.get(t),i};
            }
            s1.put(nums[i],i);
        }

        return new int []{0,0};
    }
}
