class Solution {
    public int maxProfit(int[] prices) 
    {
        int minibuy=0;
        int MaxProfit=0;
        

        for(int i=0;i<prices.length;i++)
        {
           int CurrentPrice=prices[i];
           if(CurrentPrice<prices[minibuy])
           {
            minibuy=i;
           }
           else
           {
               if(CurrentPrice-prices[minibuy]>MaxProfit)
               {
                MaxProfit=CurrentPrice-prices[minibuy];
               }
           }
        }
        return MaxProfit;
    }
}
