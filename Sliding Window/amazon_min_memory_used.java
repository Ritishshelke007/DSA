// Given list of processes where each value representing memory consuption by the process and given one variable m representing number of processes to be removed.
// We need to delete m number of processes from the list in contiguous manner and return minimum amount of main memory used by all the proccesses running after
 // deleting contiguous segment of processes.
// Example - processes = {10,4,8,13,20}, m = 2;
// output = 22 [removing 13 and 20 as its consuming large memory]

public class MyClass {
    public static void main(String args[]) {
      int arr[] = {10,4,8,13,20};
      int i = 0, j = 0, sum = 0, maxi = 0, total = 0;
      int k = 2;
      
      while (j<arr.length){
          sum += arr[j];
          total += arr[j];
          
          if (j-i+1 < k){
              j++;
          }
          else if (j-i+1 == k ){
              maxi = Math.max(maxi,sum);
              sum -= arr[i];
              i++;
              j++;
          }
      }

      System.out.println("Minimum amount of memory used by processes after deleting k process  = " + (total-maxi));
      
    }
}
