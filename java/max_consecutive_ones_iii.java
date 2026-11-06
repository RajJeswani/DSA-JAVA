// ======================================
// LeetCode Problem: max consecutive ones iii
// Language: java
// Link: https://leetcode.com/problems/max-consecutive-ones-iii/
// Synced by: LinkCode
// Date: 11/6/2026, 7:54:53 PM
// ======================================


class Solution {
    public int longestOnes(int[] nums, int k) 
    {
        //Optimised Sliding Window Solution
        // Time complexity order of n 
        //Space complexity order of 1 
        int countzero=0;
        int left=0;
        for(int right=0;right<nums.length;right++)
        {
            if(nums[right]==0)
            {
                countzero++;
            }
            if(countzero>k)
            {
                if(nums[left]==0)
                {
                    countzero--;
                }
                left++;
            }
        }    
      return nums.length-left;
    }
}