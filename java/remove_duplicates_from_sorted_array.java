// ======================================
// LeetCode Problem: remove duplicates from sorted array
// Language: java
// Link: https://leetcode.com/problems/remove-duplicates-from-sorted-array/
// Synced by: LinkCode
// Date: 10/16/2026, 8:49:30 AM
// ======================================


class Solution 
{
    public int removeDuplicates(int[] nums) 
    {
        //brute force approach
        int j=0;
        int n=nums.length;
        int[] another=new int[n];
        for(int i=0;i<n;i++)
        {
            if(i>0 && nums[i]==nums[i-1])
            {
                continue;
            }
            else
            {
                another[j]=nums[i];
                j++;
            }
        }
        System.out.println(Arrays.toString(another));
        for(int k=0;k<another.length;k++)
        {
            nums[k]=another[k];
        }
        return j;
    }
}