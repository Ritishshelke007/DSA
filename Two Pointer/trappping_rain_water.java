/*
Input: height = [0,1,0,2,1,0,1,3,2,1,2,1]
Output: 6
Explanation: The above elevation map (black section) is represented by array [0,1,0,2,1,0,1,3,2,1,2,1]. In this case, 6 units of rain water (blue section) are being trapped.
  */

class Solution {
    public int trap(int[] height) {
        int left = 0, right = height.length-1;
        int leftmax = 0 , rightmax = 0, ans = 0;

        while (left<=right){
            if ( height[left] <= height[right] ){ // making sure that current left block is having hight less tha n right possibility of storing water
                if (height[left] >= leftmax){
                    leftmax = height[left]; // if it is max block height cannot store water
                }
                else{
                    ans += leftmax-height[left]; // 
                }
                left++;
            }
            else{  // right block ---- same logic as left side blocks 

            if (height[right] >= rightmax){
                rightmax = height[right];
            }
            else{
                ans += rightmax-height[right];
            }
            right--;
            }
        }
        return ans;
    }
}
