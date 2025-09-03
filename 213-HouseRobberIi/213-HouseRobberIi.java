// Last updated: 9/3/2025, 10:50:56 AM
class Solution {
    public int rob(int[] nums) {
        int size=nums.length;
        if(size==1) return nums[0];
        int result1=maxCost(nums,0,size-1);
        int result2=maxCost(nums,1,size-1);
        return Math.max(result1,result2);
    }
    public int maxCost(int nums[],int start,int size){
        int end=size+start;
        int dpCost[]=new int[end];
        if(size==1) return nums[start];
        else{
            dpCost[0]=nums[start];
            dpCost[1]=Math.max(nums[start],nums[start+1]);
            for(int ind=2;ind<size;ind++){
                dpCost[ind]=Math.max(dpCost[ind-1],dpCost[ind-2]+nums[start+ind]);
            }
            return dpCost[size-1];
        }
    }
}