// ======================================
// LeetCode Problem: intersection of two arrays
// Language: java
// Link: https://leetcode.com/problems/intersection-of-two-arrays/
// Synced by: LinkCode
// Date: 11/15/2026, 10:02:37 PM
// ======================================


class Solution {
    public int[] intersection(int[] nums1, int[] nums2) 
    {
        //retainAll Method
        Set<Integer> s1=new HashSet<>();
        Set<Integer> s2=new HashSet<>();
        
        for(int n: nums1)
        {   
            s1.add(n);
        }    
        for(int n: nums2)
        {
            s2.add(n);
        }
        s1.retainAll(s2);
        int idx=0;
        int[] output=new int[s1.size()];
        for(int n:s1)
        {
            output[idx++]=n;
        }
        return output;
    }
}