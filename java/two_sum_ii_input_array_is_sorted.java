// ======================================
// LeetCode Problem: two sum ii input array is sorted
// Language: java
// Link: https://leetcode.com/problems/two-sum-ii-input-array-is-sorted/
// Synced by: LinkCode
// Date: 11/11/2026, 4:43:07 PM
// ======================================


class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int left=0;
        int n=numbers.length;
        int right=n-1;    
        while(left<right)
        {
            if(numbers[left]+numbers[right]==target)
            {
                return new int[]{left+1,right+1};
            }
            else if(numbers[left]+numbers[right]<target)
            {
                left++;
            }
            else
            {
                right--;
            }
        }
        return new int[]{-1,-1};
    }
}