// Given a string s consisting only of characters a, b and c.
// Return the number of substrings containing at least one occurrence of all these characters a, b and c.


// Example 1:
// Input: s = "abcabc"
// Output: 10

// Explanation: The substrings containing at least one occurrence of the characters a, b and c are "abc", "abca", "abcab", "abcabc", "bca", "bcab", "bcabc", "cab", "cabc" and "abc" (again). 
// Example 2:
// Input: s = "aaacb"
// Output: 3
// Explanation: The substrings containing at least one occurrence of the characters a, b and c are "aaacb", "aacb" and "acb". 

// Example 3:
// Input: s = "abc"
// Output: 1
 

// Constraints:
// 3 <= s.length <= 5 x 10^4
// s only consists of a, b or c characters.


class Number of Substrings Containing All Three Characters{
     public int numberOfSubstrings(String s) {
        int count=0;
        int left=0;
        int[]f=new int[3];
        for(int i=0;i<s.length();i++){
            f[s.charAt(i)-'a']++;
            while(f[0]>0 && f[1]>0 && f[2]>0){
                count+=s.length()-i;
                f[s.charAt(left)-'a']--;
                left++;
            }
        }
        return count;
}