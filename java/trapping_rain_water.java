// ======================================
// LeetCode Problem: trapping rain water
// Language: java
// Link: https://leetcode.com/problems/trapping-rain-water/
// Synced by: LinkCode
// Date: 10/20/2026, 9:24:16 AM
// ======================================


class Solution 
{
    public int trap(int[] height) 
    {
        //Auxillary Arrays Approach 
        int n=height.length;
        int [] leftmax=new int[n];
        int[] rightmax=new int[n];
        leftmax[0]=height[0];
        for(int i=1;i<n;i++)
        {
            leftmax[i]=Math.max(height[i],leftmax[i-1]);
        }
        rightmax[n-1]=height[n-1];
        for(int i=n-2;i>=0;i--)
        {
            rightmax[i]=Math.max(height[i],rightmax[i+1]);
        }
       
       int trappedwater=0;
        for(int i=0;i<n;i++)
        {
            trappedwater+=(Math.min(leftmax[i],rightmax[i])-height[i]);
        }

        return trappedwater;
    }
}