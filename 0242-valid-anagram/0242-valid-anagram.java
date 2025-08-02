class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length()!=t.length()){
            return false;
        }
        char ch1[]=s.toCharArray();
        char ch2[]=t.toCharArray();
        HashMap<Character,Integer> map1=new HashMap<>();
        HashMap<Character,Integer> map2=new HashMap<>();
        for(int i=0;i<ch1.length;i++){
            map1.put(ch1[i],map1.getOrDefault(ch1[i],0)+1);
        }
        for(int i=0;i<ch2.length;i++){
            map2.put(ch2[i],map2.getOrDefault(ch2[i],0)+1);
        }
        return map1.equals(map2);
    }
}