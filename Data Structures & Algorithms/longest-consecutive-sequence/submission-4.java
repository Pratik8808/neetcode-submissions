class Solution {

public boolean  linearSerach(int num[], int Target)
{
    for(int i=0;i<num.length;i++)
    {
        if(num[i]==Target)
        {
            return true;
        }

    }
    return false;
}
    public int longestConsecutive(int[] nums) 
{   
    HashSet<Integer> s1=new HashSet<>();
    int longest=0;
      for(int i=0;i<nums.length;i++)
      {
        s1.add(nums[i]);

      }  
      
      for(int i=0;i<nums.length;i++)
      {
        int current=nums[i];
        int length=1;
         if(!s1.contains(current-1))
         {
        
        
            while(s1.contains(current+1))
            {
                current++;
                length++;

            }
        
          
         }
         longest=Math.max(longest,length);
      }
      return longest;
    }
}
