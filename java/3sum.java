// ======================================
// LeetCode Problem: 3sum
// Language: java
// Link: https://leetcode.com/problems/3sum/
// Synced by: LinkCode
// Date: 11/12/2026, 10:06:55 AM
// ======================================


class Solution {
    public List<List<Integer>> threeSum(int[] nums)
     {
        Arrays.sort(nums);
        int n=nums.length;
        int right;
        int left;
        List <Integer> sidelist=new ArrayList<>();
        List<List<Integer>> mainlist=new ArrayList<>(); 
        for(int i=0;i<n-2;i++)
        {
            right=n-1;
            left=i+1;
            if(i>0 && nums[i]==nums[i-1])
            {
                continue;
            }
            while(left<right)
            {
                    
                 if(nums[i]+nums[left]+nums[right]==0)
                { 
                        sidelist=Arrays.asList(nums[i],nums[left],nums[right]);
                        mainlist.add(sidelist);
                        while(left<right && nums[left]==nums[left+1]) left++;  
                        while(left<right && nums[right]==nums[right-1]) right--;
                        left++;
                        right--;
                }
                else if(nums[i]+nums[left]+nums[right]>0)
                {
                    right--;
                }
                else
                {
                    left++;
                }
                
            }
           
           
        }
        return mainlist;
    }
}