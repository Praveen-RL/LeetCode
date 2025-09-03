// Last updated: 9/3/2025, 10:50:39 AM
class Solution {
    public int getSum(int a, int b) {
        while(b!=0){
            int c=a & b;
            a=a ^ b;
            b=c << 1;
        }
        return a;
    }
}