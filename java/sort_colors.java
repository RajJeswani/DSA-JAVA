// ======================================
// LeetCode Problem: sort colors
// Language: java
// Link: https://leetcode.com/problems/sort-colors/
// Synced by: LinkCode
// Date: 9/20/2026, 9:01:58 PM
// ======================================


class Solution 
{
    public void sortColors(int[] nums) 
    {
        int low=0;
        int n=nums.length;
        int high=n-1;
        int mid=0;
        while(mid<=high)
        {
            if(nums[mid]==0)
            {
                nums[mid]=nums[low];
                nums[low]=0;
                mid++;
                low++;
            }
            else if(nums[mid]==2)
            {
                nums[mid]=nums[high];
                nums[high]=2;
                high--;
            }
            else
            {
                mid++;
            }
        }    
    }
}