// ======================================
// LeetCode Problem: 3sum closest
// Language: java
// Link: https://leetcode.com/problems/3sum-closest/
// Synced by: LinkCode
// Date: 11/16/2026, 1:53:05 PM
// ======================================


class Solution {
    public int threeSumClosest(int[] nums, int target) 
    {
         Arrays.sort(nums);
         HashMap <Integer,Integer> dict=new HashMap<>();
         int n=nums.length;
         int min=0;
         for(int i=0;i<n;i++)
         {
            int left=i+1;
            int right=n-1;
            int minsum=0;
            while(left<right)
            {
                int sum=nums[left]+nums[right]+nums[i];
                left++;
                right--;
                int min=target-sum;
                  
            }
         } 
         
    }
}