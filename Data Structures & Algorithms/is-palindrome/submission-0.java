class Solution {
    public boolean isPalindrome(String s) 
    {
        int start=0;
        int end=s.length()-1;
        for(int i=0;i<s.length();i++)
        {
            char firstchar=s.charAt(start);
            char lastChar=s.charAt(end);
            if(!Character.isLetterOrDigit(firstchar))
            {
                start++;
            }
            else if(!Character.isLetterOrDigit(lastChar))
            {
                end--;
            }
            else
            {
                if(Character.toLowerCase(firstchar)!=Character.toLowerCase(lastChar))
                {
                    return false;
                }
                start++;
                end--;
            }
        }
        return true;
    }
}
