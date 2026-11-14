// ======================================
// LeetCode Problem: 4sum
// Language: java
// Link: https://leetcode.com/problems/4sum/
// Synced by: LinkCode
// Date: 11/14/2026, 6:45:28 PM
// ======================================


class Solution 
{
    public List<List<Integer>> fourSum(int[] nums, int target) 
    {
        List<List<Integer>> list=new ArrayList<>();
          int left;
          int right;
          Arrays.sort(nums);
          int n=nums.length;
        for(int i=0;i<n-3;i++)
        {
            if(i>0 && nums[i]==nums[i-1])
            {
                continue;
            }
            for(int j=i+1;j<n-2;j++)
            {
                left=j+1;
                right=n-1;
                if(j>i+1 && nums[j]==nums[j-1]) continue;
                while(left<right)
                {
                   long sum=(long) nums[i]+nums[j]+nums[left]+nums[right];
                    if(sum==target)
                    {
                        list.add(Arrays.asList(nums[i],nums[j],nums[left],nums[right]));
                        while(left<right && nums[left]==nums[left+1]) left++;
                        while(left<right && nums[right]==nums[right-1]) right--;
                        left++;
                        right--;
                    }
                     else if(sum<target)
                    {
                        left++;
                    }
                    else 
                    {
                        right--;
                    }
                }
            }
        }  
        return list;
    }
}