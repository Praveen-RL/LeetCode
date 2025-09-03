// Last updated: 9/3/2025, 10:51:47 AM
class Solution {
    public int reverse(int x) {
        int r;
        long s=0;
        while(x!=0){
            r=x%10;
            s=s*10+r;
            x=x/10;
        }
return (s < Integer.MIN_VALUE || s > Integer.MAX_VALUE ? 0:(int)s);
    }
}