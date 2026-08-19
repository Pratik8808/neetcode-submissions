class Solution {
    public boolean isValid(String s) 
    { 
        Stack <Character>s1=new Stack<>();

        for(int i=0;i<s.length();i++)
        {
            if(s.charAt(i)=='(' ||s.charAt(i)=='{' || s.charAt(i)=='[')
            {
                s1.push(s.charAt(i));
            }
            if(!s1.isEmpty())
            {

          
             if(s.charAt(i)==')')
            {
                if(s1.peek()!='(')
                {
                    return false;
                }
                s1.pop();

            }
            else if(s.charAt(i)=='}')
            {
                if(s1.peek()!='{')
                {
                    return false;
                }
                s1.pop();
            }
            else if(s.charAt(i)==']')
            {
                if(s1.peek()!='[')
                {
                    return false;
                }
                s1.pop();
            }
              }
               else 
        {
            return false;
        }

        }
       
    
    if(s1.isEmpty())
    {
        return true;
    }
    else 
    {
        return false;
    }
        
    }
}
