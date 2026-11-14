// ======================================
// LeetCode Problem: best time to buy and sell stock
// Language: java
// Link: https://leetcode.com/problems/best-time-to-buy-and-sell-stock/
// Synced by: LinkCode
// Date: 11/14/2026, 2:10:43 PM
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
            if(bp>prices[i])
            {
                bp=prices[i];
            }
            else
            {
                profit=prices[i]-bp;
                maxprofit=Math.max(maxprofit,profit);
                 
            }
        }        
        return maxprofit;
    }
}