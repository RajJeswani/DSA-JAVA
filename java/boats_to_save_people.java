// ======================================
// LeetCode Problem: boats to save people
// Language: java
// Link: https://leetcode.com/problems/boats-to-save-people/
// Synced by: LinkCode
// Date: 11/22/2026, 2:39:43 PM
// ======================================


class Solution {
    public int numRescueBoats(int[] people, int limit)
     {
        int boats=0;
        Arrays.sort(people);
        int n=people.length;
        int left=0;
        int right=n-1;
        while(left<=right)
        {
            if(people[left]+people[right]<=limit)
            {
                boats++;
                left++;
                right--;
            }
            else
            {
                boats++;
                right--;
            }
        }
        return boats;
    }
}