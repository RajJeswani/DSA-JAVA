// ======================================
// LeetCode Problem: trapping rain water
// Language: java
// Link: https://leetcode.com/problems/trapping-rain-water/
// Synced by: LinkCode
// Date: 11/14/2026, 2:00:28 PM
// ======================================


class Solution 
{
    public int trap(int[] height) 
    {
        //TWO POINTER APPROACH
        int left=0;
        int n=height.length;
        int right=n-1;
        int leftmax=height[left];
        int rightmax=height[right];
        int water=0;
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