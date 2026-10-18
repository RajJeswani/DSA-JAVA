// ======================================
// LeetCode Problem: intersection of two arrays
// Language: java
// Link: https://leetcode.com/problems/intersection-of-two-arrays/
// Synced by: LinkCode
// Date: 10/18/2026, 2:52:04 PM
// ======================================


class Solution
 {
    public int[] intersection(int[] nums1, int[] nums2) 
    {
        Arrays.sort(nums1);
        Arrays.sort(nums2);
        ArrayList<Integer> list = new ArrayList<>();
        int left=0;
        int right=0;
        while(left<nums1.length && right<nums2.length)
        {
            while(left>0  && left<nums1.length && nums1[left]==nums1[left-1] )
            {
                left++;
            }
            while(right>0  && right<nums2.length && nums2[right]==nums2[right-1]  )
            {
                right++;
            }
            if (left >= nums1.length || right >= nums2.length) {
    break;
}
            if(nums1[left]<nums2[right])
            {
                    left++;
            }
            else if(nums1[left]>nums2[right])
            {
                right++;
            }
            else if(nums1[left]==nums2[right])
            {
                list.add(nums1[left]);
                left++;
                right++;
            }
        }
        int[] result=new int[list.size()];
        for(int i=0;i<list.size();i++)
        {
            result[i]=list.get(i);
        }
        return result;
    }

}