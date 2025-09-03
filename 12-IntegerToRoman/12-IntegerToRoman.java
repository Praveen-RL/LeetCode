// Last updated: 9/3/2025, 10:51:45 AM
class Solution {
    public String intToRoman(int num) {
        String O[] = {"","I","II","III","IV","V","VI","VII","VIII","IX"};
        String T[] = {"","X","XX","XXX","XL","L","LX","LXX","LXXX","XC"};
        String H[] = {"","C","CC","CCC","CD","D","DC","DCC","DCCC","CM"};
        String Th[]={"","M","MM","MMM"};
        
        return Th[num/1000] + H[(num%1000)/100] + T[(num%100)/10] + O[num%10];  
    }
}