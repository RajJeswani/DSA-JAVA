// ======================================
// LeetCode Problem: squares of a sorted array
// Language: java
// Link: https://leetcode.com/problems/squares-of-a-sorted-array/
// Synced by: LinkCode
// Date: 10/20/2026, 4:15:54 PM
// ======================================


class Solution {
    public int[] sortedSquares(int[] nums)
     {
        int n=nums.length;
        int[] res=new int[n];
        int left=0;
        int right=n-1;
        int i=n-1;
        while(left<=right)
        {
            if(Math.abs(nums[left])>Math.abs(nums[right]))
            {
                res[i]=nums[left]*nums[left];
                i--;
                left++;
            }
            else if(Math.abs(nums[right])==Math.abs(nums[left]))
            {
                res[i]=nums[right]*nums[right];
                i--;
                if(i>0)
                {
                        res[i]=nums[left]*nums[left];
                        i--;
                }
                
                left++;
                right--;
            }
            else
            {   
                res[i]=nums[right]*nums[right];
                i--;
                right--;
            }
        }
        return res;
    }
}