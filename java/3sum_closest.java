// ======================================
// LeetCode Problem: 3sum closest
// Language: java
// Link: https://leetcode.com/problems/3sum-closest/
// Synced by: LinkCode
// Date: 11/16/2026, 2:06:23 PM
// ======================================


class Solution {
    public int threeSumClosest(int[] nums, int target) 
    {
         Arrays.sort(nums);
         int n=nums.length;
         int finalsum=nums[0]+nums[1]+nums[2];
         for(int i=0;i<n;i++)
         {
            int left=i+1;
            int right=n-1;
            while(left<right)
            {
                int sum=nums[left]+nums[right]+nums[i];
                if(Math.abs(sum-target)<Math.abs(finalsum-target))
                {
                    finalsum=sum;
                }
                if(sum==target)
                {
                    return sum;
                }
                else if(sum>target)
                {
                    right--;
                }
                else
                {
                    left++;
                }
            }
         }
         return finalsum;
    }
}