// Last updated: 9/3/2025, 10:50:14 AM
class Solution {
    public int fib(int n) {
        int dpArr[]=new int[n+1];       //Dynamic Programming
        if(n==0) return n;
        else{
            dpArr[0]=0;
            dpArr[1]=1;
            for(int i=2;i<=n;i++){
                dpArr[i]=dpArr[i-1]+dpArr[i-2];
            }
            return dpArr[n];
        }
    }
}