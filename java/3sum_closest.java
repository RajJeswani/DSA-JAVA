// ======================================
// LeetCode Problem: 3sum closest
// Language: java
// Link: https://leetcode.com/problems/3sum-closest/
// Synced by: LinkCode
// Date: 9/27/2026, 12:58:14 PM
// ======================================


class Solution 
{
    public int threeSumClosest(int[] nums, int target) 
    {
        int sum=0;
        int prevsum=0;
        int finalsum=nums[0]+nums[1]+nums[2];
        int n=nums.length;
        //brute force approach;
        for(int i=0;i<n-2;i++)
        {
            for(int j=i+1;j<n;j++)
            {
                 
               
                for(int k=j+1;k<n;k++)
                {  
                    prevsum=sum;
                    sum=nums[i]+nums[j]+nums[k];
                     if (Math.abs(sum - target) <
                        Math.abs(finalsum - target)) {

                        finalsum = sum;
                    }

                }
            }
        }    
         return finalsum;    
    }
}

 


