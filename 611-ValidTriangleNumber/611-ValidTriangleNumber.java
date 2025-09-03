// Last updated: 9/3/2025, 10:50:23 AM
class Solution {
    public int triangleNumber(int[] nums) {
        int result=0;
        Arrays.sort(nums);
        for(int i=2;i<nums.length;i++){
            int left=0;
            int right=i-1;
            while(left<=right){
                if(nums[left]+nums[right]>nums[i]){
                    result+=right-left;
                    right--;
                }
                else{
                    left++;
                }
            }
        }
        return result;
    }
}