// Last updated: 9/3/2025, 10:50:49 AM
class Solution {
    public int[] maxSlidingWindow(int[] nums, int k) {
        int n=nums.length;
        int res[]=new int[n-k+1];
        Deque<Integer> deque=new ArrayDeque<>();
        int j=0;
        for(int i=0;i<n;i++){
            while(!deque.isEmpty() && (i-deque.getFirst()>=k)){
                deque.pollFirst();
            }
            while(!deque.isEmpty() && nums[deque.getLast()]<nums[i]){
                deque.pollLast();
            }
            deque.offer(i);
            if(i>=k-1){
                res[j++]=nums[deque.peekFirst()];
            }
        }
        return res;
    }
}