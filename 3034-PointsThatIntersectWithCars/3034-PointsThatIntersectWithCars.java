// Last updated: 9/3/2025, 10:50:00 AM
class Solution {
    public int numberOfPoints(List<List<Integer>> nums) {
        int count=0;
        int res[]=new int[101];
        for(int i=0;i<nums.size();i++){
            for(int j=nums.get(i).get(0);j<=nums.get(i).get(1);j++){
                res[j]++;
            }
        }
        for(int i:res){
            if(i>0){
                count++;
            }
        }
        return count;
    }
}