// You are given an array of integers. Return the sum of all the array elements.

// Examples:

// Input: arr[] = [54, 43, 2, 1, 5]
// Output: 105
// Explanation: Just sum it 54 + 43 + 2 + 1 + 5 = 105.

// Input: arr[] = [324, 5, 2, 2]
// Output: 333
// Explanation: Just sum it 324 + 5 + 2 + 2 = 333.


// Constraints:
// 0 ≤ |arr| ≤ 105 
// 0 ≤ arr[i] ≤ 104



class Sum All Array Elements{
    public int arraySum(List<Integer> arr) {
        int sum=0;
        for(int n:arr){
            sum+=n;
        }
        return sum;
    }
}