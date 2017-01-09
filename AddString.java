public class Solution {
    public String addStrings(String num1, String num2) {
        while(num1.length()<num2.length()){
            num1=0+num1;
        }
        while(num1.length()>num2.length()){
            num2=0+num2;
        }
        int val =0;
        char [] num1ch = num1.toCharArray();
        char [] num2ch = num2.toCharArray();
        String result = "";
        int carry =0;
        for(int i=num1ch.length-1;i>=0;i--){
            val =Character.getNumericValue(num1ch[i])+Character.getNumericValue(num2ch[i])+carry;
            carry =val/10;
            result= (val%10)+result;
        }
        if(carry != 0){
        result = carry+result;}
        return result;
    }
}