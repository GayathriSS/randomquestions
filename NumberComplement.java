public class Solution {
    public int findComplement(int num) {
        String binaryIntInStr = Integer.toBinaryString(num);
        String newStr = "";
        int val = 0;
        for(int i=0;i<binaryIntInStr.length();i++){
            if(Character.getNumericValue(binaryIntInStr.charAt(i)) ==  1){
                val = 0;
            }else if(Character.getNumericValue(binaryIntInStr.charAt(i)) ==  0){
                val = 1;
            }
            newStr=newStr+val;
        }
       return Integer.parseInt(newStr, 2);
    }
}