// ======================================
// LeetCode Problem: squares of a sorted array
// Language: java
// Link: https://leetcode.com/problems/squares-of-a-sorted-array/
// Synced by: LinkCode
// Date: 11/21/2026, 1:10:44 PM
// ======================================


class Solution {
    public int[] sortedSquares(int[] nums) {
        int n=nums.length;
        int[] another=new int[n];
        int left=0;
        int k=n-1;
        int right=n-1;
        while(left<=right)
        {
            if(Math.abs(nums[left])<Math.abs(nums[right]))
            {
                another[k]=nums[right]*nums[right];
                k--;
                right--;
               
            }
            else
            {
                another[k]=nums[left]*nums[left];
                k--;
                left++; 
            }
        }
        return another;
    }
}