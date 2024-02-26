/*
Input:
N = 4, K = 2
Arr = [100, 200, 300, 400]
Output:
700
Explanation:
Arr3  + Arr4 =700,
which is maximum.
  */

class Solution{
    static long maximumSumSubarray(int K, ArrayList<Integer> Arr,int N){
       int i = 0, j = 0;
       long sum=0, maxi = 0;
       
       while (j<N){
           sum += Arr.get(j);
           
           if (j-i+1 < K){
               j++; // window size is less 
           }
           else{
               if (j-i+1 == K){ 
                   maxi = Math.max(maxi,sum); // find maximum sum 
                   
                   // unaffect the prev
                   sum -= Arr.get(i);
                   i++;
                   j++;
               }
           }
       }
       return maxi;
    }
}
