class Solution {
    public int[] topKFrequent(int[] nums, int k) 
    { HashMap<Integer,Integer>s1=new HashMap();
        int i=0;
        for(i=0;i<nums.length;i++)
        {
         if(s1.containsKey(nums[i]))
         {
            int temp=s1.get(nums[i]);
            temp=temp+1;
            s1.put(nums[i],temp);
         }
         else{
   s1.put(nums[i],1);
         }
      


        }
       ArrayList<Map.Entry<Integer,Integer>>s2=new ArrayList<>(s1.entrySet());

       Collections.sort(s2,(a,b)->b.getValue()-a.getValue());

       int ans[]=new int[k];

       for(i=0;i<ans.length;i++)
       {    
            ans[i]=s2.get(i).getKey();

       }

        return ans;
    }
}
