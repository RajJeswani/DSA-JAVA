// ======================================
// LeetCode Problem: subarray product less than k
// Language: java
// Link: https://leetcode.com/problems/subarray-product-less-than-k/
// Synced by: LinkCode
// Date: 11/6/2026, 10:14:57 PM
// ======================================


class Solution {
    public int numSubarrayProductLessThanK(int[] nums, int k) 
    {
      if(k<=1)
      {
        return 0;
      }
      int product;
      int count=0;
      int n=nums.length;
      for(int i=0;i<n;i++)
      {
        product=1;
        for(int j=i;j>=0;j--)
        {
            product*=nums[j];
            if(product<k)
            {
                count++;
            }
            else
            {
                break;
            }
        }
      }
      return count;
    }

   
}