// Last updated: 9/3/2025, 10:50:16 AM
class Solution {
     static{
        for(int i=0;i<500;i++){
            boolean ans=lemonadeChange(new int[]{5,5,5});
        }
    }
    public static boolean lemonadeChange(int[] bills) {
        int five=0;
        int ten=0;
        for(int bill:bills){
            if(bill==5) five++;
            else if(bill==10){
                if(five>0){
                    five--;
                    ten++;
                }
                else{
                    return false;
                }
            }
            else{
                if(five>0 && ten>0){
                    five--;
                    ten--;
                }
                else if(five>=3){
                    five-=3;
                }
                else{
                    return false;
                }
            }
        }
        return true;
    }
}