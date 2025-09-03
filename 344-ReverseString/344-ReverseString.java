// Last updated: 9/3/2025, 10:50:40 AM
class Solution{
public void reverseString(char[]s){
    int left=0,right=s.length-1;
    while(left<right){
        char temp=s[left];
        s[left]=s[right];
        s[right]=temp;
        left++;
        right--;
    }
}
}