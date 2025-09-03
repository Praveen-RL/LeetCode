// Last updated: 9/3/2025, 10:50:46 AM
class Solution {
    public int addDigits(int num) {
        if(num==0){
            return 0;
        }
        else if(num%9==0){
            return 9;
        }
        else{
            return num%9;
        }
    }
}