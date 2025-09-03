// Last updated: 9/3/2025, 10:50:32 AM
class Solution {
    public String frequencySort(String s) {
        int freq[]=new int[128];
        for(char ch:s.toCharArray()){
            freq[ch]++;
        }
        StringBuilder str=new StringBuilder();
        for(int out=0;out<s.length();out++){
            int max=freq[0];
            int max_ind=0;
            for(int in=1;in<128;in++){
                if(freq[in]>max){
                    max=freq[in];
                    max_ind=in;
                }
            }
            if(max==0) break;
            for(int i=0;i<max;i++){
                str.append((char)max_ind);
            }
            freq[max_ind]=0;
        }
        return str.toString();
    }
}