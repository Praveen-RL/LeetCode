// Last updated: 9/3/2025, 10:50:30 AM
class Solution {
    public int findContentChildren(int[] g, int[] s) {
        Arrays.sort(g);
        Arrays.sort(s);
        int child=0;
        int cookies=0;
        while(child<g.length && cookies<s.length){
            if(g[child]<=s[cookies]) child++;
            cookies++;
        }
        return child;
    }
}