// ======================================
// LeetCode Problem: find the duplicate number
// Language: java
// Link: https://leetcode.com/problems/find-the-duplicate-number/
// Synced by: LinkCode
// Date: 11/17/2026, 12:01:40 AM
// ======================================


class Solution {
    public int findDuplicate(int[] nums) 
    {
        //HashMap Approach 
        //Best Approach is Floyd Cycle (Two Pointer Approach)
        int n=nums.length;
        int duplicate=0;
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int i=0;i<n;i++)
        {
            if(!map.containsKey(nums[i]))
            {
                map.put(nums[i],1);
            }
            else
            {
                duplicate=nums[i];
                break;
            }
        }    
        return duplicate;
    }
}