// Last updated: 9/3/2025, 10:50:38 AM
class Solution {
    public int firstUniqChar(String s) {
        int length=s.length();
        HashMap<Character,Integer> freq=new HashMap<>();
        for(char c:s.toCharArray()){
            freq.put(c,freq.getOrDefault(c,0)+1);
        }
        for(int i=0;i<length;i++){
            if(freq.get(s.charAt(i))==1){
                return i;
            }
        }
        return -1;
    }
}