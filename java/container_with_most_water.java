// ======================================
// LeetCode Problem: container with most water
// Language: java
// Link: https://leetcode.com/problems/container-with-most-water/
// Synced by: LinkCode
// Date: 10/22/2026, 6:09:14 PM
// ======================================


class Solution 
{
    public int maxArea(int[] height) 
    {
        int n=height.length;    
        int left=0;
        int right=n-1;
        int maxwater=0;
        while(left<right)
        {
            int heights=Math.min(height[left],height[right]);
            int width=right-left;
            int area=heights*width;
            maxwater=Math.max(area,maxwater);
            if(height[left]<=height[right])
            {
                left++;
            }
            else
            {
                right--;
            }
        }
        return maxwater;
    }
}