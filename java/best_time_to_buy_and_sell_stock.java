// ======================================
// LeetCode Problem: best time to buy and sell stock
// Language: java
// Link: https://leetcode.com/problems/best-time-to-buy-and-sell-stock/
// Synced by: LinkCode
// Date: 10/19/2026, 10:34:45 PM
// ======================================


class Solution {
    public int maxProfit(int[] prices) 
    {
        int profit=0;
        int maxprofit=0;
        int n =prices.length;
        int bp=prices[0];
        for(int i=1;i<n;i++)
        {
            if(bp>prices[i])
            {
                bp=prices[i];
            }
            else if(prices[i]-bp>0)
            {
                profit=prices[i]-bp;
                maxprofit=Math.max(profit,maxprofit);
            }
        }
        return maxprofit;    
    }
}