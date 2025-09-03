// Last updated: 9/3/2025, 10:51:46 AM
class Solution {
    public boolean isPalindrome(int x) {
        int rev = 0;
        int m = x;
        while(x>0){
            //recursive
            rev = rev*10+(x%10);
            x = x/10;
        }
        return rev == m;
    }
}