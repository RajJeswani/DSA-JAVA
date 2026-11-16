// ======================================
// LeetCode Problem: assign cookies
// Language: java
// Link: https://leetcode.com/problems/assign-cookies/
// Synced by: LinkCode
// Date: 11/16/2026, 11:55:07 AM
// ======================================


class Solution {
    public int findContentChildren(int[] g, int[] s) 
    {
        int g_len=g.length;
        int s_len=s.length;
        Arrays.sort(g);
        Arrays.sort(s);
        int l=0;
        int r=0;
        int cookies=0;
        while(l<g_len && r<s_len)
        {
            if(s[r]>=g[l])
            {
                cookies++;
                l++;
            }   
            r++;

        } 
        return cookies;  
    }
}