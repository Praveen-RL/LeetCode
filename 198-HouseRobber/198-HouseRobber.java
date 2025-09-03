// Last updated: 9/3/2025, 10:51:01 AM
class Solution {
    public int rob(int[] nums) {
        int size=nums.length;
        int moneyDP[]=new int[size];
        if(size==1){
            return nums[0];
        }
        else{
            moneyDP[0]=nums[0];
            moneyDP[1]=Math.max(nums[0],nums[1]);
            for(int ind=2;ind<size;ind++){
                moneyDP[ind]=Math.max(nums[ind]+moneyDP[ind-2],moneyDP[ind-1]);
            }
            return moneyDP[size-1];
        }
    }
}