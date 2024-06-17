// Given an unsorted array of integers nums, return the length of the longest consecutive elements sequence.
// You must write an algorithm that runs in O(n) time.

// Example 1:
// Input: nums = [100,4,200,1,3,2]
// Output: 4
// Explanation: The longest consecutive elements sequence is [1, 2, 3, 4]. Therefore its length is 4.

// Example 2:
// Input: nums = [0,3,7,2,5,8,4,6,0,1]
// Output: 9

  
class Solution {
    public int longestConsecutive(int[] nums) {
        Map<Integer,Boolean> present = new HashMap<>();
        Map<Integer,Boolean> checked = new HashMap<>();
        for(int no:nums){
            present.put(no,true);
        }
        int longest = 0;
        for(int no:nums){
            if(!checked.containsKey(no) && !present.containsKey(no-1)){
                int start = no;
                int currentchain = 0;
                while(present.containsKey(start)){
                    checked.put(no,true);
                    start++;
                    currentchain++;
                }
                longest = Math.max(longest,currentchain);
            }
           
        }
         return longest;
    }
}
