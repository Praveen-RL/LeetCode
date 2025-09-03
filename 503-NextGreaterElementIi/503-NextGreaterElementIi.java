// Last updated: 9/3/2025, 10:50:26 AM
class Solution {
    public int[] nextGreaterElements(int[] nums) {
        int size=nums.length;
        int arr[]=new int[size];
        for(int target=0;target<size;target++){
            int next=-1;
            for(int span=(target+1)%size;span!=target;span=(span+1)%size){
                if(nums[target]<nums[span]){
                    next=nums[span];
                    break;
                }
            }
            arr[target]=next;
        }
        return arr;
    }
}