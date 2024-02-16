// nums[] = { -1, 1, 1 } output : 3 

public static int getLongestSubarray(int []nums, int k) {
		Map<Integer,Integer> map = new HashMap<>();
		int sum = 0;
		int maxlen = 0;

		for (int i=0; i<nums.length; i++){
			sum += nums[i];

			if (sum == k){
				maxlen = Math.max(maxlen, i+1);
			}

			int rem = sum - k;

			if (map.containsKey(rem)){
				int len = i - map.get(rem);
				maxlen = Math.max(maxlen, len);
			}

			if (!map.containsKey(sum)){
				map.put(sum, i);
			}
		}
		return maxlen;
	}
