// ======================================
// LeetCode Problem: assign cookies
// Language: java
// Link: https://leetcode.com/problems/assign-cookies/
// Synced by: LinkCode
// Date: 10/23/2026, 9:47:36 PM
// ======================================


class Solution 
{
    public int findContentChildren(int[] g, int[] s) 
    {
        int contentchild=0;
         int len_g=g.length;
         int len_s=s.length;
         Arrays.sort(g);
         Arrays.sort(s);
         int left=0;
         int right=0;
         while(left<len_g && right<len_s)
         {

            if(s[right]>=g[left])
            {
                left++;
                contentchild++;
            }
            right++;
            

         }
         return contentchild;       
    }
}