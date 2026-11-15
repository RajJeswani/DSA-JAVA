// ======================================
// LeetCode Problem: intersection of two arrays
// Language: java
// Link: https://leetcode.com/problems/intersection-of-two-arrays/
// Synced by: LinkCode
// Date: 11/15/2026, 9:56:26 PM
// ======================================


class Solution {
    public int[] intersection(int[] nums1, int[] nums2) 
    {
        // Total 3 Approaches : 
        //1.Sorting And Two Pointer Approach 
        // TC: nlogn+mlogm
        
        //2.retainAll Function In Collections
        //3.One Dictionary

        HashSet<Integer> list=new HashSet<>();
        Arrays.sort(nums1);
        Arrays.sort(nums2);
        int l=0,r=0;
        while(l<nums1.length && r<nums2.length)
        {
            if(nums1[l]<nums2[r])
            {
                l++;
            }
            else if(nums1[l]>nums2[r])
            {
                r++;
            }
            else
            {
               
               list.add(nums1[l]); 
                l++;
                r++;
               
            }
        } 
        int n=list.size();
        int[] another=new int[n];
        int i=0;
        for(int num:list)
        {
            another[i]=num;
            i++;
        }
        return another;
    }
}