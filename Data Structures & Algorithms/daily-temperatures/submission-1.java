class Solution {
    public int[] dailyTemperatures(int[] temperatures) {
        Stack <Integer> s1=new Stack<>();
        int Result[]=new int[temperatures.length];

        for(int i=temperatures.length-1;i>=0;i--)
        {
            if(!s1.isEmpty())
            {
                while( !s1.isEmpty() && temperatures[s1.peek()]<=temperatures[i] )
                {
                    s1.pop();
                }

                if(s1.isEmpty())
                {
                    Result[i]=0;
                    
                }
                else
                {
                    int r=s1.peek()-i;
                    Result[i]=r;
                    
                }
            }
           s1.push(i);
        }
        
        return Result;
    }
}
