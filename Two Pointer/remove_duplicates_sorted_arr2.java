// Input: nums = [0,0,1,1,1,1,2,3,3]
// Output: 7, nums = [0,0,1,1,2,3,3,_,_]

class Solution {
    public int removeDuplicates(int[] nums) {
        // int left = 0, right = 1, counter = 0;

        // while (right < nums.length){
        //     if (nums[left]!=nums[right]){
        //         left++;
        //         nums[left] = nums[right];
        //         counter = 0;
        //     }
        //     else if (nums[left] == nums[right] && counter < 1){
        //         counter++;
        //         nums[++left] = nums[right];
        //     }
        //     right++;
        // }
        // return left+1;

        int temp = 1, j = 1;

        for (int i=1; i<nums.length; i++){
            if (nums[i] == nums[i-1]){
                temp++;
            }
            else {
                temp = 1;
            }

            if (temp <= 2){
                nums[j] = nums[i];
                j++;
            }
        }
        return j;
    }
}
