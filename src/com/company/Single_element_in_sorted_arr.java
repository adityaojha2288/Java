package com.company;

public class Single_element_in_sorted_arr {
    class Solution {
        public int singleNonDuplicate(int[] nums) {
            int i = 0;
            int j = nums.length-1;
            int mid = (i + j)/2;
            if(j == 0){return nums[0];}
            while(i < j){
                mid = (i + j)/2;
                if(mid % 2 == 0)
                    mid--;
                if(nums[mid] == nums[mid-1])
                    i = mid+1;
                else
                    j = mid-1;
            }
            return nums[i];
        }
    }
}
