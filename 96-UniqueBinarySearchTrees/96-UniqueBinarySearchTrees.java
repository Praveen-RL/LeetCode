// Last updated: 9/3/2025, 10:51:25 AM
class Solution {
    public int numTrees(int n) {
       int dp[]=new int[n+1];
       dp[0]=1;
       dp[1]=1;
       for(int x=2;x<=n;x++){
        for(int y=1;y<=x;y++){
            dp[x]+=dp[y-1]*dp[x-y];
        }
       }
       return dp[n]; 
    }
}