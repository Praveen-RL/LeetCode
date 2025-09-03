// Last updated: 9/3/2025, 10:50:29 AM
class Solution {
    public int minMoves2(int[] nums) {
       Arrays.sort(nums);
       int mid=nums.length/2;
       int sum=0;
       for(int i=0;i<mid;i++){
        sum+=nums[mid]-nums[i];
       }
       for(int i=mid;i<nums.length;i++){
        sum+=nums[i]-nums[mid];
       }
       return sum;
    }
}