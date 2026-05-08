// Given an array of n names arr of candidates in an election, where each name is a string of lowercase characters. A candidate name in the array represents a vote casted to the candidate. Print the name of the candidate that received the maximum count of votes. If there is a draw between two candidates, then print lexicographically smaller name.

// Examples :
// Input: n = 13
// arr[] = {john,johnny,jackie,johnny,john,jackie,jamie,jamie,john,johnny,jamie,johnny,john}
// Output: john 4
// Explanation: john has 4 votes casted for him, but so does johnny. john is lexicographically smaller, so we print john and the votes he received.

// Input: n = 3
// arr[] = {andy,blake,clark}
// Output: Andy 1
// Explanation: All the candidates get 1 votes each. We print andy as it is lexicographically smaller.

// Your Task:
// You only need to complete the function winner() that takes an array of strings arr, and length of arr n as parameters and returns an array of string of length 2. First element of the array should be the name of the candidate and second element should be the number of votes that candidate got in string format.

// Constraints:
// 1 <= n <= 105
// 1 <= |arri| <= 105



class Winner of an election
{
     public static String[] winner(String arr[], int n) {
        HashMap<String,Integer> map=new LinkedHashMap<>();
        for(String nn:arr){
            map.put(nn,map.getOrDefault(nn,0)+1);
        }
        int max=0;
        String a="";
        for(Map.Entry<String,Integer> entry:map.entrySet()){
            if(entry.getValue()>max){
                max=entry.getValue();
                a=entry.getKey();
            }else if(entry.getValue()==max && entry.getKey().compareTo(a)<0){
                a=entry.getKey();
            }
        }
        String[]ans=new String[2];
        ans[0]=a;
        ans[1]=max+"";
        return ans;
    }
}
