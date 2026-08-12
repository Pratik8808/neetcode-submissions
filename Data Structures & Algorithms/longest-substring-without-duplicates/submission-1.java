class Solution {
    public int lengthOfLongestSubstring(String s) 
    {
        int l=0;// it will shrink
        int r=0;// it grow
        int maxLen=0;
       
        HashSet<Character>s1=new HashSet<>();
        while(r<s.length())
        {
           if(s1.contains(s.charAt(r)))
           {
             
            
              s1.remove(s.charAt(l));
              l++;
              
           }
            
            else 
            {
                s1.add(s.charAt(r));
                
                 maxLen=Math.max(r-l+1,maxLen);
                r++;
            }
          
        }
        return maxLen;
    }
}
