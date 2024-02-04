// Problem - https://www.geeksforgeeks.org/problems/find-the-closest-pair-from-two-arrays4215/1

class Solution{
    // Function for finding maximum and value pair
    public static ArrayList<Integer> printClosest (int arr[], int brr[], int n, int m, int x) {
       
       int i = 0, j = m-1, ans = Integer.MAX_VALUE, a = 0, b = 0;
       ArrayList<Integer> list = new ArrayList<>();
       
       while (i<n && j>=0){
           
           if ( Math.abs( arr[i]+brr[j]-x ) < ans ){
               ans = Math.abs( arr[i]+brr[j]-x );
               a = arr[i];
               b = brr[j];
           }
           
           if (arr[i]+brr[j]-x < 0){
               i++;
           }
           else if (arr[i]+brr[j]-x > 0){
               j--;
           }
           else {
               break;
           }
       }
       
       list.add(a);
       list.add(b);
       return list;
    }
}
