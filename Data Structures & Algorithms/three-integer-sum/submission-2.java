class Solution {
    public List<List<Integer>> threeSum(int[] nums) 
    {
        Arrays.sort(nums);
       HashSet<List<Integer>>s1=new HashSet<>();
        for(int i=0;i<nums.length;i++)
        { 
            int j=i+1;
           int k=nums.length-1;
            while(j<k)
            {  int sum=nums[i]+nums[j]+nums[k];
                if(sum==0)
                {  ArrayList<Integer>s2=new ArrayList<>();
                    s2.add(nums[i]);
                    s2.add(nums[j]);
                    s2.add(nums[k]);
                    s1.add(s2);
                  j++;
                  k--;
                }

              else if(sum<0)
                {
                    j++;
                }
              else if(sum>0)  
                {
                    k--;
                }
                
                
                
            }
           
        }
         return new ArrayList<>(s1);
    }
}
