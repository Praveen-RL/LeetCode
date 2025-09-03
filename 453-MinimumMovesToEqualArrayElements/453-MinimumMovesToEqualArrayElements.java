// Last updated: 9/3/2025, 10:50:31 AM
class Solution {
    public int minMoves(int[] nums) {
        int min=nums[0];
        int sum=0;
        for(int i=1;i<nums.length;i++){
            if(min>nums[i]) min=nums[i];
        }
        for(int i=0;i<nums.length;i++){
            sum+=nums[i]-min;
        }
        return sum;
    }
}