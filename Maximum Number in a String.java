// Given an alphanumeric string s consisting of lowercase letters (a–z), uppercase letters (A–Z), and digits (0–9).
// Extract all numeric substrings from s and return the maximum numeric value among them.
// If no numeric substring exists, return -1.

// Examples:

// Input: s = "100klh564abc365bg"
// Output: 564
// Explanation: Numeric values in string s are 100, 564 and 365. But 564 is maximum among them. So answer is 564.


// Input: s = "abcdefg"
// Output: -1
// Explanation: Since there is no numeric value in the string. So answer is -1. 


// Constraints:
// 1 ≤ |s| ≤ 104
// -1 ≤ output value ≤ 106




class Maximum Number in a String{
    static int extractMaximum(String s) {
        boolean is=false;
        int max=0;
        int sum=0;
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)>='0' && s.charAt(i)<='9'){
                is=true;
                sum=sum*10+s.charAt(i)-'0';
            }else{
                max=Math.max(sum,max);
                sum=0;
            }
        }
        max=Math.max(max,sum);
        if(is){
            return max;
        }
        return -1;
    }
}