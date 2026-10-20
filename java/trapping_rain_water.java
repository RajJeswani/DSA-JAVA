// ======================================
// LeetCode Problem: trapping rain water
// Language: java
// Link: https://leetcode.com/problems/trapping-rain-water/
// Synced by: LinkCode
// Date: 10/20/2026, 9:06:59 PM
// ======================================


class Solution 
{
    public int trap(int[] height) 
    {
        int n=height.length;
        int left=0;
        int water=0;
        int right=n-1;
        int leftmax=height[left];
        int rightmax=height[right];
        while(left<right)
        {
            if(leftmax<rightmax)
            {
                left++;
                leftmax=Math.max(leftmax,height[left]);
                water+=leftmax-height[left];
            }
            else
            {
                right--;
                rightmax=Math.max(rightmax,height[right]);
                water+=rightmax-height[right];

            }
        }
        return water;    
    }
}