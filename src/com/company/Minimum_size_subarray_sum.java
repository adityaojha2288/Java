package com.company;

public class Minimum_size_subarray_sum {
    class Solution {
        public int minSubArrayLen(int target, int[] nums) {
            int lo = 1;
            int hi = nums.length;
            int result = 0;
            while(lo <= hi) {
                int mid = lo + (hi - lo)/2;
                if(isPossible(nums, target, mid)){
                    hi = mid - 1;
                    result = mid;
                }
                else lo = mid + 1;
            }
            return result;
        }
        boolean isPossible(int[] nums, int target, int size) {
            int sum = 0;
            int i = 0, j = 0;
            for(i = 0; i < size; i++) {
                sum += nums[i];
                if(sum >= target) return true;
            }
            while(i < nums.length) {
                sum = sum + nums[i++] - nums[j++];
                if(sum >= target)
                    return true;
            }
            return false;
        }
    }
}
