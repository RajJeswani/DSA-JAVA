// ======================================
// LeetCode Problem: container with most water
// Language: java
// Link: https://leetcode.com/problems/container-with-most-water/
// Synced by: LinkCode
// Date: 10/23/2026, 10:41:23 PM
// ======================================


class Solution 
{
    public int maxArea(int[] height) 
    {
        int left=0;
        int right=height.length-1;
        int maxwater=0;
        while(left<right)
        {
            int width=right-left;
            int holding=Math.min(height[left],height[right]);
            int area=width*holding;
             maxwater=Math.max(area,maxwater);
            if(height[left]<=height[right])
            {
                left++;
            }
            else if(height[left]>height[right])
            {
                right--;
            }
        }       
        return maxwater; 
    }
}