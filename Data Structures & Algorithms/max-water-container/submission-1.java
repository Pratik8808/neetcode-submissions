class Solution {
    public int maxArea(int[] heights) 
    {
        int i=0;
        int j=heights.length-1;
        int max=0;
        while(i<j)
        {   
            if(heights[i]<heights[j])
            {
                int area= (j-i)*heights[i];
                if(max<area)
                {
                    max=area;
                }
                i++;
            }
            else 
            {
                int area= (j-i)*heights[j];
                if(max<area)
                {
                    max=area;
                }
                j--;

            }


        }
        return max;
        
    }
}
