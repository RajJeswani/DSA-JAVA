// ======================================
// LeetCode Problem: best time to buy and sell stock
// Language: java
// Link: https://leetcode.com/problems/best-time-to-buy-and-sell-stock/
// Synced by: LinkCode
// Date: 9/22/2026, 11:48:03 PM
// ======================================


class Solution 
{
    public int maxProfit(int[] prices) 
    {
       int bp=prices[0];
       int profit=0;
       int maxprofit=0;
       for(int i=1;i<prices.length;i++)
       {
        if(prices[i]-bp<0)
        {
            bp=prices[i];
        }
        else
        {
            profit=prices[i]-bp;
            maxprofit=Math.max(maxprofit,profit);
        }
       }
       if(profit<0)
       {
        return 0;
       }
       return maxprofit;
    }
}