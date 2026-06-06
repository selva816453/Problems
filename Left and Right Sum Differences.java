// You are given a 0-indexed integer array nums of size n.
// Define two arrays leftSum and rightSum where:
// leftSum[i] is the sum of elements to the left of the index i in the array nums. If there is no such element, leftSum[i] = 0.
// rightSum[i] is the sum of elements to the right of the index i in the array nums. If there is no such element, rightSum[i] = 0.
// Return an integer array answer of size n where answer[i] = |leftSum[i] - rightSum[i]|.

 

// Example 1:
// Input: nums = [10,4,8,3]
// Output: [15,1,11,22]
// Explanation: The array leftSum is [0,10,14,22] and the array rightSum is [15,11,3,0].
// The array answer is [|0 - 15|,|10 - 11|,|14 - 3|,|22 - 0|] = [15,1,11,22].

// Example 2:
// Input: nums = [1]
// Output: [0]
// Explanation: The array leftSum is [0] and the array rightSum is [0].
// The array answer is [|0 - 0|] = [0].
 

// Constraints:
// 1 <= nums.length <= 1000
// 1 <= nums[i] <= 105


class Left and Right Sum Differences{
    public int[] leftRightDifference(int[] nums) {
        int[]ans=new int[nums.length];
        int[]ans1=new int[nums.length];
        int xum=0;
        int xum1=0;
        for(int i=0;i<nums.length;i++){
            ans[i]=xum;
            xum+=nums[i];
    }
    for(int i=nums.length-1;i>=0;i--){
        ans1[i]=xum1;
        xum1+=nums[i];
    }
    int[]finalans=new int[ans.length];
    for(int i=0;i<ans.length;i++){
        finalans[i]=Math.abs(ans[i]-ans1[i]);
        
    }
    return finalans; 
}