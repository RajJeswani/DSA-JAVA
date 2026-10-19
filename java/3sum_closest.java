// ======================================
// LeetCode Problem: 3sum closest
// Language: java
// Link: https://leetcode.com/problems/3sum-closest/
// Synced by: LinkCode
// Date: 10/19/2026, 10:01:24 PM
// ======================================



class Solution {
    public int threeSumClosest(int[] nums, int target) {
        Arrays.sort(nums);
        ArrayList<Integer> list = new ArrayList<>();
        int n = nums.length;
        int sum = 0;

        for (int i = 0; i < n - 2; i++) {
            int left = i + 1;
            int right = n - 1;

            while (left < right) {
                sum = nums[left] + nums[right] + nums[i];

                if (sum < target) {
                    list.add(sum);
                    // list = Arrays.asList(nums[left], nums[right], nums[i]);
                    left++;
                } 
                else if (sum > target) {
                    list.add(sum);
                    // list = Arrays.asList(nums[left], nums[right], nums[i]);
                    right--;
                } 
                else {
                    return sum;
                }
            }
        }

        int closevalue = Integer.MAX_VALUE;

        for (int k = 0; k < list.size(); k++) {
            closevalue = Math.min(
                Math.abs(target - list.get(k)),
                closevalue
            );
        }

        for (int j = 0; j < list.size(); j++) {
            if (Math.abs(target - list.get(j)) == closevalue) {
                return list.get(j);
            }
           
        }

        return sum;
    }
}
