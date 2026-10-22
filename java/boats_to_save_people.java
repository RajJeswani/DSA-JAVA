// ======================================
// LeetCode Problem: boats to save people
// Language: java
// Link: https://leetcode.com/problems/boats-to-save-people/
// Synced by: LinkCode
// Date: 10/22/2026, 10:10:59 PM
// ======================================


class Solution 
{
    public int numRescueBoats(int[] people, int limit) 
    {
        int boats=0;
        int n=people.length;
        Arrays.sort(people);
        int left=0;
        int right=n-1;
        while(left<=right)
        {
                if(people[left]+people[right]>limit)
                {
                    right--;
                }
                else
                {
                    left++;
                    right--;
                }
                boats++;
        }
        return boats;
    }
}