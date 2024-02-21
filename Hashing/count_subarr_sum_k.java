/*
let s prefix sum from 0 till r .....
let l to r is subarray having sum equals k ....
remmaining array should have subarray sum ------- s - k i.e. (s-k) + x = s
    x = k

store prefix sum as prefix sum, count.....
search for rem (presum - k) in hashmap.... 
if present then increase count and store prefix sum in map along with occurence

return count;

*/ 

class Solution {
    public int subarraySum(int[] nums, int k) {
        Map<Integer,Integer> map = new HashMap<>();
        int count = 0;
        int presum = 0;

        map.put(0,1);

        for (int i=0; i<nums.length; i++){
            presum += nums[i];

            int rem = presum - k;

            count += map.getOrDefault(rem,0);

            map.put(presum, map.getOrDefault(presum,0)+1);
        }
        return count;
    }
}
