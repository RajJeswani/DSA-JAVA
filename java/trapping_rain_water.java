// ======================================
// LeetCode Problem: trapping rain water
// Language: java
// Link: https://leetcode.com/problems/trapping-rain-water/
// Synced by: LinkCode
// Date: 9/22/2026, 9:32:19 PM
// ======================================


class Solution {
    public int trap(int[] height) {
        int n=height.length;
     int[] left=new int[n];
      left[0]=height[0];
      for(int i=1;i<n;i++)
      {
        if(height[i]>left[i-1])
        {
          left[i]=height[i];
        }
        else
        {
          left[i]=left[i-1];
        }
      }
      System.out.println(Arrays.toString(left));

      int[] right=new int[n];
      right[n-1]=height[n-1];
      for(int i=n-2;i>=0;i--)
      {
        if(right[i+1]<height[i])
        {
          right[i]=height[i];
        }
        else
        {
          right[i]=right[i+1];
        }
      }
      System.out.println(Arrays.toString(right));

      int total=0;
      for(int i=0;i<n;i++)
      {
        
        int mw=Math.min(left[i],right[i]);
        int tp=mw-height[i];
        total+=tp;
      }
      return total;
        
    }
}