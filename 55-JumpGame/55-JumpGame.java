// Last updated: 9/3/2025, 10:51:35 AM
class Solution {
    public boolean canJump(int[] nums) {
        int maxrange=0;
        for(int i=0;i<nums.length;i++){
            if(i>maxrange){
                return false;
            }
            maxrange=Math.max(maxrange,nums[i]+i);
        }
        return true;
    }
}