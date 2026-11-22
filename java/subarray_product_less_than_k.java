// ======================================
// LeetCode Problem: subarray product less than k
// Language: java
// Link: https://leetcode.com/problems/subarray-product-less-than-k/
// Synced by: LinkCode
// Date: 11/23/2026, 12:09:10 AM
// ======================================


class Solution {
    public int numSubarrayProductLessThanK(int[] nums, int k) 
    {
        //Optimised  Approach (Sliding Window)
       int count=0;
       int prod=1;
       int l=0;
       if(k<=1) return 0;
       for(int r=0;r<nums.length;r++)
       {
        prod*=nums[r];
        while(prod>=k)
        {
            prod/=nums[l];
            l++;
        }
        count+=r-l+1;
       }
        return count;    
    }
}