// Last updated: 9/3/2025, 10:50:02 AM
class Solution {
    public int getMinDistance(int[] nums, int target, int start) {
       int size=nums.length;
       int min=Integer.MAX_VALUE;
       for(int i=0;i<size;i++){
        if(nums[i]==target){
            min=Math.min(min,Math.abs(i-start));
        }
       }
       return min;
    }
}