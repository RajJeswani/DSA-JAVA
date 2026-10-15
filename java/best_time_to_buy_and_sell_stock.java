// ======================================
// LeetCode Problem: best time to buy and sell stock
// Language: java
// Link: https://leetcode.com/problems/best-time-to-buy-and-sell-stock/
// Synced by: LinkCode
// Date: 10/16/2026, 12:58:33 AM
// ======================================


class Solution 
{
    public int maxProfit(int[] prices) 
    {
        int n=prices.length;
        int bp=prices[0];
        int profit=0;
        for(int i=1;i<n;i++)
        {
            if(bp<prices[i])
            {
                bp=prices[i];
            }
            else
            {
                profit=prices[i]-bp;
            }
        }    
        int maxprofit=Math.max(profit,0);
        return maxprofit;
    }
}