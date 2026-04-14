// Given a string s, remove all the spaces from the string and return the modified string.

// Examples:

// Input: s = "g eeks for ge eks"
// Output: "geeksforgeeks"
// Explanation: All space characters are removed from the given string while preserving the order of the remaining characters, resulting in the final string "geeksforgeeks".

// Input: s = "abc d "
// Output: "abcd"
// Explanation:  All space characters are removed from the given string while preserving the order of the remaining characters, resulting in the final string "abcd".

// Constraints:
// 1 ≤ |s| ≤ 105


public class Remove Spaces{
     String removeSpaces(String s) {
        StringBuilder sb=new StringBuilder();
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)!=' ')
            sb.append(s.charAt(i));
        }
        return sb.toString();
    }
}
