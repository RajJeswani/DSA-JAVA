// ======================================
// LeetCode Problem: container with most water
// Language: java
// Link: https://leetcode.com/problems/container-with-most-water/
// Synced by: LinkCode
// Date: 11/14/2026, 12:19:33 PM
// ======================================


class Solution {
    public int maxArea(int[] height) {
        int left=0;
        int n=height.length;
        int right=n-1;
        int total=0;
        int maxwater=0;
        while(left<right)
        {
            int dist=right-left;
            int water=Math.min(height[left],height[right]);
            total=water*dist;
            maxwater=Math.max(total,maxwater);
            if(height[left]>=height[right])
            {
                right--;
            }
            else if(height[left]<height[right])
            {
                left++;
            }

        }
        return maxwater;
    }
}