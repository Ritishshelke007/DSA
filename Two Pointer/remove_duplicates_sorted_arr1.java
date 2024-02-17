// Input: nums = [0,0,1,1,1,2,2,3,3,4]
// Output: 5, nums = [0,1,2,3,4,_,_,_,_,_]

class Solution {
    public int removeDuplicates(int[] nums) {
        // int i = 0;

        // for(int j=1; j<nums.length; j++){
        //     if(nums[i]!=nums[j]){
        //         nums[i+1] = nums[j];
        //         i++;
        //     }
           
        // }
        // return i+1;

        // classic two pointer

        int left = 0, right = 1;

        while (right < nums.length){
            if (nums[left] == nums[right]){
                right++;
            }
            else {
                nums[left+1] = nums[right];
                left++;
            }
        }
        return left+1;
    }
}
