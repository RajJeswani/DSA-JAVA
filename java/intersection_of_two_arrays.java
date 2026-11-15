// ======================================
// LeetCode Problem: intersection of two arrays
// Language: java
// Link: https://leetcode.com/problems/intersection-of-two-arrays/
// Synced by: LinkCode
// Date: 11/15/2026, 10:36:42 PM
// ======================================


class Solution {
    public int[] intersection(int[] nums1, int[] nums2)
    {
        // Using Dictionary 
        Map<Integer,Integer> seen=new HashMap<>();
        List<Integer> result=new ArrayList<>();

        for(int x:nums1)
        {
            seen.put(x,1);
        }    

        for(int x:nums2)
        {
            if(seen.containsKey(x) && seen.get(x)==1)
            {
                result.add(x);
                seen.put(x,0);
            }
        }
        return result.stream().mapToInt(i->i).toArray();
    }
}