// Given a string s1 and another string s2. Find the minimum index of the character in s1 that is also present in s2. if no character common in both then return -1.

// Examples :
// Input: s1 = "geeksforgeeks", s2 = "set"
// Output: 1
// Explanation: 'e' is the character which is present in given s1 "geeksforgeeks" and is also present in s2 "set". Minimum index of e is 1. 

// Input: s1 = "adcffaet", s2 = "onkl"
// Output: -1
// Explanation: There are none of the characters which is common in s1 and s2.


// Constraints:
// 1 ≤ s1.size(), s2.size() ≤ 105 
// 'a' ≤ s1i, s2i ≤ 'z'


class Minimum indexed character{
    public static int minIndexChar(String s1, String s2) {
        HashSet<Character> set = new HashSet<>();
        for (char c : s2.toCharArray()) {
            set.add(c);
        }
        for (int i = 0; i < s1.length(); i++) {
            if (set.contains(s1.charAt(i))) {
                return i;
            }
        }
        return -1;
    }

}