// ======================================
// LeetCode Problem: move zeroes
// Language: java
// Link: https://leetcode.com/problems/move-zeroes/
// Synced by: LinkCode
// Date: 10/15/2026, 10:10:02 PM
// ======================================


class Solution 
{
    public void moveZeroes(int[] nums) 
    {
        //brute force approach
        //self try
         int n=nums.length;   
      int[]another=new int[n];
      int j=0;
      for(int i=0;i<n;i++)
      {
        if(nums[i]!=0)
        {
          another[j]=nums[i];
          j++;
        }
      }
      for (int i = 0; i < n; i++) {
            nums[i] = another[i];
        }
      System.out.println(Arrays.toString(another));    
    }
}