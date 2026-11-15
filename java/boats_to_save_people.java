// ======================================
// LeetCode Problem: boats to save people
// Language: java
// Link: https://leetcode.com/problems/boats-to-save-people/
// Synced by: LinkCode
// Date: 11/16/2026, 12:17:21 AM
// ======================================


class Solution {
    public int numRescueBoats(int[] people, int limit)
     {
        int left=0;
        int n=people.length;
        int right=n-1;
        int boats=0;
        Arrays.sort(people);
        while(left<right)
        {
            if(people[left]+people[right]<=limit)
            {
                boats++;
                left++;
                right--;
            }
            else if(people[left]+people[right]>limit)
            {
                right--;
                boats++;
            }
            
        }
        if(left==right)
        {
            boats++;
        }
        return boats;
    }
}