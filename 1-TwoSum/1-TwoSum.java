// Last updated: 9/3/2025, 10:51:50 AM
class Solution {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer,Integer> map=new HashMap<>();
        int size=nums.length;
        for(int i=0;i<size;i++){
            int complement=target-nums[i];
            if(map.containsKey(complement)){
                return new int[] {map.get(complement),i};
            }
            map.put(nums[i],i);
        }
        return null;
    }
}