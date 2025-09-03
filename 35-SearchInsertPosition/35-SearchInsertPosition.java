// Last updated: 9/3/2025, 10:51:36 AM
class Solution {
    public int searchInsert(int[] nums, int target) {
        for(int i=0;i<nums.length;i++){
            if(nums[i]==target){
                return i;
            }
            if(nums[i]>target){
                return i;
            }
        }
        return nums.length;
    }
}