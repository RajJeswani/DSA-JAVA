// ======================================
// LeetCode Problem: container with most water
// Language: java
// Link: https://leetcode.com/problems/container-with-most-water/
// Synced by: LinkCode
// Date: 9/26/2026, 9:30:12 PM
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
      int width=right-left;
      int hgt=Math.min(height[left],height[right]);
      int currwater=width*hgt;
      maxwater=Math.max(currwater,maxwater);

      if(height[left]<height[right])
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