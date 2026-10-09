class Solution {
    public int[] topKFrequent(int[] nums, int k) {

        HashMap<Integer,Integer> s1=new HashMap<>();
        List<Integer> s=new ArrayList<>();
        int ans[]=new int[k];


        for(int i=0;i<nums.length;i++)
        {
            if(s1.containsKey(nums[i]))
            {
                int temp=s1.get(nums[i]);

                s1.put(nums[i],temp+1);
            }

            else
            {
                s1.put(nums[i],1);
            }



        }

       ArrayList<Map.Entry<Integer,Integer>>s2=new ArrayList<>(s1.entrySet());

       Collections.sort(s2,(a,b)->b.getValue()-a.getValue());

       for(int i=0;i<ans.length;i++)
       {
         ans[i]=s2.get(i).getKey();
       }

       return ans;



        



        
    }
}
