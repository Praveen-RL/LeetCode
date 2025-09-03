// Last updated: 9/3/2025, 10:50:09 AM
class Solution {
    public int findNumbers(int[] nums) {
        int count=0;
        for(int num:nums){
            if(((int)Math.log10(num)) %2!=0){
                count++;
            }
        }
        return count;
        

    }
}