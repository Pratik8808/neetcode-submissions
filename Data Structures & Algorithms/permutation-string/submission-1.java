class Solution {
    public boolean checkInclusion(String s1, String s2) 
    {
        if(s1.length()>s2.length())
        {
            return false;
        }
        char s3[]=s1.toCharArray();
        Arrays.sort(s3);
        s1=new String(s3); 
        int j=s1.length();    
        
        for(int i=0;j<=s2.length();i++,j++)
        {
             String temp=s2.substring(i,j);
             char s4[]=temp.toCharArray();
             Arrays.sort(s4);
             temp=new String(s4);
             if(s1.equals(temp))
             {
                return true;
             }

        }

        return false;
    }
}
