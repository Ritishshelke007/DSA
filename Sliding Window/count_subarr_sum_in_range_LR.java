// Input:
// N = 3, L = 3, R = 8
// A[] = {1, 4, 6}
// Output: 
// 3
// Explanation: 
// The subarrays are [1,4], [4] and [6]

class Solution 
{ 
    long count (int N, int A[], long x){
        long sum = 0, ans = 0;
        
        for (int l=0,r=0; r<N; r++){
            
            sum += A[r];
            
            while (sum > x){ // if sum  exceeding
                sum -= A[l];
                l++;
            }
            
            ans += (r-l+1); // add count of subarrays
        }
        return ans;
    }
    
    long countSubarray(int N,int A[],long L,long R) {
    long ans1 = count(N,A,L-1);
    long ans2 = count(N,A,R);
    
    return ans2-ans1;
    }
} 
