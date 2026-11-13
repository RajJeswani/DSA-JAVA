// ======================================
// LeetCode Problem: trapping rain water
// Language: java
// Link: https://leetcode.com/problems/trapping-rain-water/
// Synced by: LinkCode
// Date: 11/13/2026, 10:52:10 PM
// ======================================


import java.util.*;
class Solution 
{
    //AUXILLARY  ARRAY APPROACH 
    public int trap(int[] height) 
    {
       int n=height.length;
       int[] leftmax=new int[n];
       leftmax[0]=height[0];
       for(int i=1;i<n;i++)
       {
        leftmax[i]=Math.max(leftmax[i-1],height[i]);
       }

       int [] rightmax=new int[n];
       rightmax[n-1]=height[n-1];
       for(int i=n-2;i>=0;i--)
       {
        rightmax[i]=Math.max(rightmax[i+1],height[i]);
       }
        int water=0;
       for(int i=0;i<n;i++)
       {
            int trappedwater=Math.min(leftmax[i],rightmax[i]);
            water+=trappedwater-height[i];
       }
        return water;
    }
}