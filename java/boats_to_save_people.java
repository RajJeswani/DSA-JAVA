// ======================================
// LeetCode Problem: boats to save people
// Language: java
// Link: https://leetcode.com/problems/boats-to-save-people/
// Synced by: LinkCode
// Date: 10/23/2026, 8:43:30 PM
// ======================================


class Solution {
    public int numRescueBoats(int[] people, int limit)
     {
        int n=people.length;
        int left=0;
        int boats=0;
        int right=n-1;
        Arrays.sort(people);
        while(left<=right)
        {
            if(people[left]+people[right]<=limit)
            {
                left++;
            }
            right--;
            boats++;
        }   
        return boats;
    }
}