// Last updated: 9/3/2025, 10:50:04 AM
class Solution {
    public int sumOfUnique(int[] nums) {
        int arr[]=new int[101];
        for(int num:nums){
            arr[num]++;
        }
        int sum=0;
        for(int i=0;i<101;i++){
            if(arr[i]==1){
                sum+=i;
            }
        }
        return sum;
    }
}