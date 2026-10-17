// ======================================
// LeetCode Problem: intersection of two arrays
// Language: java
// Link: https://leetcode.com/problems/intersection-of-two-arrays/
// Synced by: LinkCode
// Date: 10/17/2026, 5:57:41 PM
// ======================================


class Solution 
{
    public int[] intersection(int[] nums1, int[] nums2)
     {
        //brute force approach
        ArrayList<Integer> list = new ArrayList<>();
        for(int i=0;i<nums1.length;i++)
        {
            for(int j=0;j<nums2.length;j++)
            {
                if(nums2[j]==nums1[i])
                {
                    if(!list.contains(nums1[i]))
                    {
                        list.add(nums1[i]);
                    }
                }
            }
        }
        int[] result=new int[list.size()];
        int k=0;
        for(int i=0;i<list.size();i++)
        {
            result[k]=list.get(i);
            k++;
        }
        return result;
    }
}