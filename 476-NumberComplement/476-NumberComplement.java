// Last updated: 9/3/2025, 10:50:27 AM
class Solution {
    public int findComplement(int num) {
        int i=0;
        int sum=0;
        while(num>0){
            int a=num%2;
            if(a==1){
                sum+=0*(Math.pow(2,i));
            }
            else{
                sum+=1*(Math.pow(2,i));
            }
            i++;
            num=num/2;
        }
        return sum;
    }
}