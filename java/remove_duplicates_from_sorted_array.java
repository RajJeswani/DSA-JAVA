// ======================================
// LeetCode Problem: remove duplicates from sorted array
// Language: java
// Link: https://leetcode.com/problems/remove-duplicates-from-sorted-array/
// Synced by: LinkCode
// Date: 9/26/2026, 2:46:33 PM
// ======================================


class Solution {
    public int removeDuplicates(int[] nums) {

        if (nums.length == 0) {
            return 0;
        }

        int j = 0;

        for (int i = 1; i < nums.length; i++) {

            if (nums[j] != nums[i]) {
                nums[++j] = nums[i];
            }
        }

        return j + 1;
    }
}